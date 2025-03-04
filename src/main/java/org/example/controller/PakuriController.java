package org.example.controller;

import org.example.models.Pakuri;
import org.example.service.PakuriService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pakuri")
public class PakuriController {

    private PakuriService pakuriService = new PakuriService();

    @GetMapping
    private ResponseEntity<List<Pakuri>> getAllPakuri() {
        return ResponseEntity.ok(pakuriService.getAllPakuri());
    }

    @GetMapping("/{name}")
    private ResponseEntity<Pakuri> getPakuri(@PathVariable String name) {
        return ResponseEntity.ok(pakuriService.getPakuriByName(name));
    }

    @PostMapping
    private ResponseEntity<Boolean> addPakuri(@RequestBody Pakuri pakuri) {
        return ResponseEntity.ok(pakuriService.addPakuri(pakuri));
    }

    @PutMapping
    private ResponseEntity<Boolean> updatePakuri(@RequestBody Pakuri pakuri) {
        return ResponseEntity.ok(pakuriService.updatePakuri(pakuri));
    }

    @DeleteMapping("/{name}")
    private ResponseEntity<Boolean> deletePakuri(@PathVariable String name) {
        return ResponseEntity.ok(pakuriService.removePakuri(name));
    }

}
