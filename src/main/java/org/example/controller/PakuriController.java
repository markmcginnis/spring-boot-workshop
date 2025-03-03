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

@RequestMapping("/pakuri")
public class PakuriController {

    private PakuriService pakuriService;

    @GetMapping("/{name}")
    private ResponseEntity<Pakuri> getPakuri(@PathVariable String name) {
        return ResponseEntity.ok(pakuriService.getPakuriByName(name));
    }

    @PostMapping
    private ResponseEntity<Boolean> addPakuri(@RequestBody String name) {
        return ResponseEntity.ok(pakuriService.addPakuri(name));
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
