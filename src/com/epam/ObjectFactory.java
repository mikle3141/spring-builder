package com.epam;

import lombok.SneakyThrows;

public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();

    public static ObjectFactory getInstance() {return ourInstance;}

    private ObjectFactory() {}

    private Config config = new JavaConfig("com.epam");

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }
        return implClass.getDeclaredConstructor().newInstance();
    }
}
