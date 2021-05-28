package com.project.utils.enums;

public enum FuelType {

    MS ("Petrol"),
    HSD ("Diesel");

    private String name;

    private FuelType(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
