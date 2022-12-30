package de.memozone.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //@RequestMapping(value = "/", method = RequestMethod.GET)
    //alternativ kann man einfach @GetMapping Anotation verwenden
    @GetMapping("/")
    public String helloWorld() {

        return "Welcome to memoCode!!!";


    }

}
