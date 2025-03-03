package org.example.service;

import org.example.models.Pakudex;
import org.example.models.Pakuri;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PakuriService {

    private Map<String, Pakuri> pakuriMap = new HashMap<>();

    public Pakudex getAsPakudex() {
        return Pakudex.builder()
            .pakuriMap(new HashMap<>(pakuriMap))
            .build();
    }

    public Pakuri getPakuriByName(String name) {
        return pakuriMap.get(name);
    }

    public boolean addPakuri(String name) {
        if (pakuriMap.containsKey(name)) {
            return false;
        }
        pakuriMap.put(name, new Pakuri(name));
        return true;
    }

    public boolean updatePakuri(Pakuri pakuri) {
        if (!pakuriMap.containsKey(pakuri.getName())) {
            return false;
        }
        pakuriMap.put(pakuri.getName(), pakuri);
        return true;
    }

    public boolean removePakuri(String name) {
        if (!pakuriMap.containsKey(name)) {
            return false;
        }
        pakuriMap.remove(name);
        return true;
    }

}
