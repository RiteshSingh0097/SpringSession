package com.ttn.thymeleaf.enums;

public enum Enum {

    USER("USER"),
    ADMIN("ADMIN"),
    SUPER_ADMIN("SUPER_ADMIN");

    private String value;
    Enum(String user) {
        value = user;
    }

    public String getValue(){
        return value;
    }
}
