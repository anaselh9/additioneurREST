package com.example.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.example.services.AddService;
@RequestMapping(value = "/adder", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
public class AdderController {
    private AddService adderService;
    public AdderController(AddService adderService) {
        this.adderService = adderService;
    }
    @GetMapping("/current")
    public int currentNum() {
        return adderService.currentBase();
    }
    @PostMapping
    public int add(@RequestParam int num) {
        return adderService.add(num);
    }
}
