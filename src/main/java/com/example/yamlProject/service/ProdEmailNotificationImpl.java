package com.example.yamlProject.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"prod"})
public class ProdEmailNotificationImpl implements NotificationService{
    @Override
    public String send(){
        return "Email sent via Prod";
    }
}
