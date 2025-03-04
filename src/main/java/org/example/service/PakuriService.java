package org.example.service;

import org.example.models.Pakudex;
import org.example.models.Pakuri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.repository.PakuriRepository;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class PakuriService {

    @Autowired
    private PakuriRepository pakuriRepository;

    public Pakudex getAsPakudex() {
        Map<String, Pakuri> pakuriMap = pakuriRepository.findAll()
            .stream()
            .collect(Collectors.toMap(Pakuri::getName, Function.identity()));
        Pakudex pakudex = new Pakudex();
        pakudex.setPakuriMap(pakuriMap);
        return pakudex;
    }

    public Pakuri getPakuriByName(String name) {
        return pakuriRepository.findById(name).orElse(null);
    }

    public List<Pakuri> getAllPakuri() {
        return pakuriRepository.findAll();
    }

    public boolean addPakuri(Pakuri pakuri) {
        if (pakuriRepository.findById(pakuri.getName()).orElse(null) != null) {
            return false;
        }
        pakuriRepository.save(pakuri);
        return true;
    }

    public boolean updatePakuri(Pakuri pakuri) {
        if (pakuriRepository.findById(pakuri.getName()).orElse(null) == null) {
            return false;
        }
        pakuriRepository.save(pakuri);
        return true;
    }

    public boolean removePakuri(String name) {
        if (pakuriRepository.findById(name).orElse(null) == null) {
            return false;
        }
        pakuriRepository.deleteById(name);
        return true;
    }

}
