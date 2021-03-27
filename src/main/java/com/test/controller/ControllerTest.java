package com.test.controller;

import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/1")
public class ControllerTest {

//    @GetMapping("/message")
//    @ResponseBody
    @RequestMapping("/2")
    public String getMessage(){
        return "Hello I'm Anna";
    }

}
