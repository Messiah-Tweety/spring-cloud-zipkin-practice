package run.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import run.microservice.UserService;

@RestController
@EnableFeignClients
@RequestMapping("/feign-service")
public class Controller {
    @Autowired
    private UserService userService;

    @GetMapping("/go")
    public String hi() {
        return "feign-service";
    }
}
