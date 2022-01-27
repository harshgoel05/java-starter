package com.example.demo;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello1")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World"); // constructor of HelloWorldBean
    }

    @GetMapping(path = "/hello2/{name}")
    public HelloWorldBean helloPath(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name)); // constructor of HelloWorldBean
    }
}