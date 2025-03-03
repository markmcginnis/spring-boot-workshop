package org.example;

import org.example.controller.PakudexController;
import org.example.controller.PakuriController;
import org.example.service.PakuriService;

public class SpringBootWorkshop {

    public static void main(String[] args) {
        PakuriService pakuriService = new PakuriService();
        PakudexController pakudexController = new PakudexController(pakuriService);
        PakuriController pakuriController = new PakuriController(pakuriService);
        // serve stuff
    }

//    public static void main(String[] args) {
//        PakuriService pakuriService = new PakuriService();
//        PakudexController pakudexController = new PakudexController(pakuriService);
//        PakuriController pakuriController = new PakuriController(pakuriService);
//        // serve stuff
//    }

}
