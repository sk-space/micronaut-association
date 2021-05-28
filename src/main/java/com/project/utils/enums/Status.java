package com.project.utils.enums;

public enum Status {

    ACTIVE("Active"),
    INACTIVE("Inactive");

    private String name;

    private Status(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
