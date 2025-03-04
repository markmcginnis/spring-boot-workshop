package org.example.repository;

import org.example.models.Pakuri;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Profile("pakuri-repository-in-memory")
@Repository("pakuri-repository-in-memory")
public class InMemoryPakuriRepository implements PakuriRepository {

    private final Map<String, Pakuri> pakuriMap = new HashMap<>();

    @Override
    public Pakuri save(Pakuri pakuri) {
        return pakuriMap.put(pakuri.getName(), pakuri);
    }

    @Override
    public Optional<Pakuri> findById(String name) {
        return Optional.ofNullable(pakuriMap.get(name));
    }

    @Override
    public List<Pakuri> findAll() {
        return new ArrayList<>(pakuriMap.values());
    }

    @Override
    public void deleteById(String name) {
        pakuriMap.remove(name);
    }

    @Override
    public void deleteAll() {
        pakuriMap.clear();
    }
}
