package org.example.config;

import org.example.controller.PakudexController;
import org.example.controller.PakuriController;
import org.example.service.PakuriService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {

    @Bean
    public PakudexController pakudexController() {
        PakuriService pakuriService = new PakuriService();
        return new PakudexController(pakuriService);
    }

    @Bean
    public PakuriController pakuriController() {
        PakuriService pakuriService = new PakuriService();
        return new PakuriController(pakuriService);
    }

}
