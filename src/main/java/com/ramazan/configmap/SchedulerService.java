package com.ramazan.configmap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerService {

    @Autowired
    private MyAppConfiguration config;

    @Scheduled(fixedDelay = 5000)
    public void schedule() {
        System.out.println("Config message: " + config.getMessage());
        System.out.println("Feature flag: " + config.getFeatureEnabled());
    }
}