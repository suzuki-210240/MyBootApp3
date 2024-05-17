package com.example.mybootapp3;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HeloController {
    @RequestMapping("/taro")
    public String taro(){
        return "Taro desu!";
    }
    
}
