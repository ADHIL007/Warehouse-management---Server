package com.warehouse.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api") // Base path for all endpoints in this controller
public class MainController {

    @GetMapping("/")
    @ResponseBody // Indicates that the return value should be used as the response body
    public String hello() {
        return "Hello from Spring Boot!";
    }

    // Add more request handling methods as needed
}
