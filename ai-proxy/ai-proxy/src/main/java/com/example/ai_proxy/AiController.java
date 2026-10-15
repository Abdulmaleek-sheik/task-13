package com.example.ai_proxy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/ai")
public class AiController {

    @PostMapping("/analyze")
    public ResponseEntity<Map<String, Object>> analyzeDocument(@RequestBody Map<String, String> payload) {
        String documentContent = payload.get("content");

        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Document successfully proxied through Spring Boot API.");
        response.put("received_length", documentContent != null ? documentContent.length() : 0);
        
        return ResponseEntity.ok(response);
    }
}