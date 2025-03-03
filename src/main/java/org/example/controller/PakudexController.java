package org.example.controller;

import org.example.models.Pakudex;
import org.example.service.PakuriService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pakudex")
public class PakudexController {

    private PakuriService pakuriService;

    @GetMapping
    private ResponseEntity<Pakudex> getPakudex() {
        return ResponseEntity.ok(pakuriService.getAsPakudex());
    }

}
