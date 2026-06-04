package com.omni.agenthub.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
public class HealthCheckController {
    @GetMapping("api/v1/ping")
    public Map<String, Object> ping(){
        return Map.of(
                "service", "agenthub",
                "status", "OK",
                "timestamp", Instant.now().toString()
        );
    }
}
