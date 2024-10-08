package com.dawiec.lead_management_system.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class LeadManagementSystemController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }
    
}
