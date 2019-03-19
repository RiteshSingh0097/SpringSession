package com.springboot.Exercise5.question4;

import org.springframework.beans.factory.annotation.Value;

public class Database {

    @Value("${db.name}")
    private String name;

    @Value("${db.port}")
    private  Integer port;

    @Override
    public String toString() {
        return "Database{" +
                "name='" + name + '\'' +
                ", port=" + port +
                '}';
    }
}
