package com.scaler.demo.scalerdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @RequestMapping("/first-api")
    public String firstAPI(){
        return "Hello Class";
    }

    @GetMapping("/second-api/{name}")
    public String secondAPI(@PathVariable String name){
        return "Hello "+name;
    }

    @GetMapping("/third-api/{name}/{times}")
    public String thirdAPI(@PathVariable String name, @PathVariable int times){
        StringBuilder str = new StringBuilder();
        for(int i=0 ; i<times; i++){
            str.append(name).append(" ").append(i + 1);
            str.append("\n");
        }
        return str.toString();
    }
}
