package com.ramazan.configmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringCloudKubernetesConfigMapDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudKubernetesConfigMapDemoApplication.class, args);
    }

    @EventListener(RefreshScopeRefreshedEvent.class)
    public void onScopeRefresh() {
        System.out.println("Scope Refreshed Event");
    }

}
