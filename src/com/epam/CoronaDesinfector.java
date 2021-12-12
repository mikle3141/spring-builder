package com.epam;

public class CoronaDesinfector {

    private Announcer announcer = new ConsoleAnnouncer();

    private Policeman policeman = new PolicemanImpl();

    public void start(Room room) {
        announcer.announce("Все вон!");
        policeman.makePeopleLeaveRoom();
        disinfect(room);
        announcer.announce("Рискните зайти обратно!");
    }

    private void disinfect(Room room) {
        System.out.println("Корона изыди!");
    }
}
