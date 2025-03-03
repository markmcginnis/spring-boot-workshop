package org.example.models;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class Pakuri {

    public Pakuri(String name) {
        this.name = name;
        this.strength = name.length();
    }

    private final String name;

    private Integer strength;
}
