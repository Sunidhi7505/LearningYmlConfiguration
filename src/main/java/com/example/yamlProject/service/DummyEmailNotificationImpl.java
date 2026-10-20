package com.example.yamlProject.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev","staging","default"})
public class DummyEmailNotificationImpl implements NotificationService{
    @Override
    public String send(){
        return "dummy email sent for testing purpose";
    }
}
