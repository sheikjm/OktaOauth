package com.example.okta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class OktaPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(OktaPocApplication.class, args);
    }

    @RequestMapping("/")
    public String login(Principal principal){
        return principal.getName()+"_ login api ";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "Welcome to the api world";
    }


}
