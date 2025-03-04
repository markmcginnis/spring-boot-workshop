package org.example.repository;

import org.example.models.Pakuri;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface PakuriRepository {
    Pakuri save(Pakuri pakuri);

    Optional<Pakuri> findById(String name);

    List<Pakuri> findAll();

    void deleteById(String name);
}
