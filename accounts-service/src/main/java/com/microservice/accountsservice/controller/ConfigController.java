package com.microservice.accountsservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {
    @Value("${accounts.contactDetails.name}")
    private String accountMessage;
    @GetMapping
    public ResponseEntity<String> responseDemo() {
        return ResponseEntity.ok(this.accountMessage);
    }
}
