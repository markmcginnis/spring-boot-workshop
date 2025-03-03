package org.example.models;

import lombok.Data;

import java.util.Map;

@Data
public class Pakudex {

    private Map<String, Pakuri> pakuriMap;

}
