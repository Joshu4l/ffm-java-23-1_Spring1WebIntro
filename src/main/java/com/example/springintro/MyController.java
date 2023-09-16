package com.example.springintro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MyController {

    // Instance of a Message repository
    public List<Message> messages = new ArrayList<>();


    @GetMapping()
    public String getLandingPageData() {
        /*
            Default landing page response for URL
            http://localhost:8080/api
         */
        return "This is the landing Page";
    }

    @GetMapping("/hello")
    public String getHello() {
        /*
            Default response when visiting
            http://localhost:8080/api/hello
         */
        return "Hello, World!";
    }

    @GetMapping("/hello/{name}")
    public String greetByName(@PathVariable String name) {
        /*
            Dynamic page response when visiting
            http://localhost:8080/api/hello/{name}
         */
        return "Hello " + name + "!";
    }


    @PostMapping("/messages")
    public String sendMessage(@RequestBody Message message) {
        //TODO:
        /*
            VERY IMPORTANT HERE: There's only ONE RequestBody!
            In other words, we syntactically expect only ONE argument,
            which nevertheless is handed over in a split (JSON-)
            manner, e.g.:
            {
                "id": "1",
                "name": "first message",
                "message": "first message text"
            }
         */
        messages.add(message);
        return "The message you sent: " + message;
    }

    @GetMapping("/messages")
    public String getMessages() {
        /*
            Default response when visiting
            http://localhost:8080/api/messages
         */
        return "Existing messages: " + messages;
    }

    @GetMapping("/messages/{id}")
    public Message getMessageById(@PathVariable String id) {
        /*
            Dynamic page response when visiting
            http://localhost:8080/api/message/{id}
         */
        Optional<Message> optionalMessage = messages.stream()
                .filter(message -> message.getId().equals(id))
                .findFirst();

        if (optionalMessage.isPresent()) {
            return optionalMessage.get();
        } else {
            return null;
        }

    }

    @DeleteMapping("/messages/{id}")
    public String deleteMessageById(@PathVariable String id) {
        /*
            Dynamic Delete operation based on a path variable specified in the target URL:
            http://localhost:8080/api/messages/{id}
         */
        Optional<Message> messageToBeDeleted = messages.stream()
                .filter(message -> message.getId().equals(id)).findFirst();
        if (messageToBeDeleted.isPresent()) {

            messages.remove(messageToBeDeleted.get());
            return messageToBeDeleted.get() + " successfully deleted.";
        } else {
            return "Message with id " + id + " was not found";
        }
    }

}
