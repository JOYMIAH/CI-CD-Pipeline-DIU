package com.abhishek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Successfully Built & Deployed Using Comprehensive CI-CD Pipeline");
        model.addAttribute("subtitle", "Ashekur Rahman");
        model.addAttribute("msg", "This application is deployed on to Kubernetes using Argo CD By Joy Miah");
        model.addAttribute("colorScheme", "Blue and White");
        model.addAttribute("font", "Arial");
        model.addAttribute("layout", "Grid");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
