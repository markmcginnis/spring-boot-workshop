package org.example.models;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Map;

@Data
@Builder
@Jacksonized
public class Pakudex {

    private Map<String, Pakuri> pakuriMap;

}
