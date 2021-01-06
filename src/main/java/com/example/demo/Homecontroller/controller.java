package com.example.demo.Homecontroller;

import org.json.JSONArray;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController

public class controller {

    @GetMapping (value ="/Hello")
    public  String sayhello()
    {
        return "Hello Worls-Get";
    }
    @PostMapping (value ="/Hello")
    public  String sayhello1()
    {
        return "Hello Worls-Post";

    }
    @DeleteMapping(value ="/Hello")
    public String sayhello3()
    {
        return "Hello Worls-Post";

    }
    @PutMapping (value ="/Hello")
    public  String sayhello4()
    {
        return "Hello Worls-Post";

    }

}
