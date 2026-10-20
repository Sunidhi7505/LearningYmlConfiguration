package com.example.yamlProject.controller;

import com.example.yamlProject.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {
    private NotificationService service;

    public  NotificationController(NotificationService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<String> send(){
        String message = service.send();
        return ResponseEntity.status(200).body(message);
    }
}
