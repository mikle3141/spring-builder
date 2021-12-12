package com.epam;

public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();

    public static ObjectFactory getInstance() {return ourInstance;}

    private ObjectFactory() {}

    public <T> T createObject(Class<T> type) {
        //TODO
        return null;
    }
}
