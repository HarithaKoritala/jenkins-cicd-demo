package com.hari.sb.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsCicdDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsCicdDemoApplication.class, args);
    }

    @GetMapping("/greet/{name}")
    public String greetings(@PathVariable String name){
        String s = name.split(" ")[0];
        return "Hello " + s + "!You have successfully completed Jenkins CI/Cd";
    }
}
