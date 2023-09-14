# Aufgabenstellung

Erstellt ein neues Spring Boot Projekt in IntelliJ und implementiert einen einfachen 'HelloWorld' Controller.
Verwendet dabei die gelernten Konzepte wie Annotations, HTTP-Methoden und Path Variables.

* _Schritt 1_: Erstelle eine Spring-Boot-Anwendung mit dem Spring Initializr und füge den spring-web-starter hinzu.

* _Schritt 2_: Schreibe einen Controller, der eine GET-Anfrage auf '/hello' verarbeitet und 'Hello, World!' zurückgibt.

* _Schritt 3_: Verwende Path Variables, um den Namen in der Nachricht anzupassen.
Beispiel: '/hello/John' gibt 'Hello, John!' zurück.

* Schritt 4: Teste deine Controller-Methode mit einem REST-Client oder Postman und dokumentiere deine Ergebnisse.


# Bonusaufgabe

Bearbeite diese optionalen Zusatzaufgaben, um deine Kenntnisse weiter zu vertiefen.

* _Schritt 1_: Erstelle eine neue Klasse 'Message' mit den Feldern 'name', 'message' und 'id' vom Typ String.

* _Schritt 2_: Der Controller soll nun eine Liste von Message-Objekten haben.

* _Schritt 3_: Implementiere eine zusätzliche Controller-Methode, die eine POST-Anfrage auf '/messages' verarbeitet. Diese Methode sollte eine id, einen Namen und eine Message im Request-Body entgegennehmen und sie in der Liste speichern.

* _Schritt 4_: Implementiere eine zusätzliche Controller-Methode, die eine GET-Anfrage auf '/messages' verarbeitet. Diese Methode sollte die Liste der Messages zurückgeben.

* _Schritt 5_: Implementiere eine zusätzliche Controller-Methode, die eine DELETE-Anfrage auf '/messages/id' verarbeitet. Diese Methode sollte die Message mit der entsprechenden id aus der Liste löschen.(nutze eine Path Variable)