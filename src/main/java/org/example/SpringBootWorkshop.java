package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWorkshop {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWorkshop.class, args);
    }

//    public static void main(String[] args) {
//        PakuriService pakuriService = new PakuriService();
//        PakudexController pakudexController = new PakudexController(pakuriService);
//        PakuriController pakuriController = new PakuriController(pakuriService);
//        // serve stuff
//    }

}
