package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class RestApiController {

    @PostMapping("/test")
    public String createTest(@RequestBody Object input) {
        String returnVar = input.toString();
        return returnVar;
    }

    @PutMapping("/test/{id}")
    public String updateTest(@PathVariable Long id) {
        return "Object with " + id + " updadet.";
    }

    @GetMapping("/test")
    public String getTest(@RequestParam String returnVar) {
        return returnVar;
    }

    @DeleteMapping("/test{id}")
    public String deleteTest(@PathVariable Long id) {
        return "Object with " + id + " deleted.";
    }

}
