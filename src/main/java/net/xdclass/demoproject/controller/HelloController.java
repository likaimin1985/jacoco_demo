package net.xdclass.demoproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/h")

public class HelloController {

    @GetMapping("/h1")
    public String f(String num){
        System.out.println("aaaaaaaaaaaaaaa");
        return "ok";
    }

}
