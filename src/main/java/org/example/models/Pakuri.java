package org.example.models;

import lombok.Data;

@Data
public class Pakuri {

    public Pakuri(String name) {
        this.name = name;
        this.strength = name.length();
    }

    private final String name;

    private Integer strength;
}
