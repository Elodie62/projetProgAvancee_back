package com.example.sextoysback.ws;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = ApiRegistration.API_WS)
public class mainWs {


    @GetMapping("/hello1")
    public String getHello(){
        return "Get Hello";
    }

    @PutMapping ("/hello2")
    public String putHello(){
        return "Put hello";
    }

    @PostMapping ("/hello3")
    public String postHello(){
        return "Post Hello";
    }

    @DeleteMapping ("/hello4")
    public String deleteHello(){
        return "Delete Hello";
    }

}