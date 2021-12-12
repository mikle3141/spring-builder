package com.epam;

public class CoronaDesinfector {

    private Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);

    private Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

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
