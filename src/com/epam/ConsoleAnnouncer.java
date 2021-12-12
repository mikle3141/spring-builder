package com.epam;

public class ConsoleAnnouncer implements Announcer {
    @Override
    public void announce(String msg) {
        System.out.println(msg);
    }
}
