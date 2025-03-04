package org.example.controller;

import org.example.models.Pakudex;
import org.example.service.PakuriService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pakudex")
public class PakudexController {

    private PakuriService pakuriService = PakuriService.getInstance();

    @GetMapping
    private ResponseEntity<Pakudex> getPakudex() {
        return ResponseEntity.ok(PakuriService.getInstance().getAsPakudex());
    }

    @PostMapping
    private ResponseEntity<Boolean> setPakudex(@RequestBody Pakudex pakudex) {
        boolean success = pakudex.getPakuriMap()
            .values()
            .stream()
            .allMatch(pakuri -> PakuriService.getInstance().addPakuri(pakuri));
        return ResponseEntity.ok(success);
    }

}
