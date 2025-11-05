package JustVibe.com.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/health")
@CrossOrigin(origins = "*")
public class HealthController {

    @GetMapping
    public String healthCheck() {
        return "JustVibe Backend is running!";
    }

    @GetMapping("/cors")
    public String corsTest() {
        return "CORS is working!";
    }
}
