package ru.netology;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<String> validPaths = List.of("/index.html", "/spring.svg", "/spring.png", "/resources.html", "/styles.css", "/app.js", "/links.html", "/forms.html", "/classic.html", "/events.html", "/events.js");
        final int PORT = 9999;
        final int NUMBER_OF_THREADS = 64;

        Server server = new Server(validPaths, PORT, NUMBER_OF_THREADS);

        server.start();
    }
}


