package com.abhishek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@SpringBootApplication
@Controller
public class StartApplication {

    private static final Logger LOGGER = Logger.getLogger(StartApplication.class.getName());

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Successfully Built & Deployed Using Comprehensive CI-CD Pipeline");
        model.addAttribute("subtitle", "Abir Hasan Galib Sabbir");
        model.addAttribute("msg", "This Application is deployed on to Kubernetes With High Availability using Argo CD By Joy Miah");
        model.addAttribute("colorScheme", "Blue and White");
        model.addAttribute("font", "Arial");
        model.addAttribute("layout", "Grid");

        try {
            // This is a bad practice and can lead to SQL Injection
            String user = System.getenv("USER");
            LOGGER.info("User is: " + user);
        } catch (Exception e) {
            // Empty catch block
        }

        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
