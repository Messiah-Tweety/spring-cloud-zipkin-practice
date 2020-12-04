package run.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import run.controller.microservice.FeignService;

@RestController
@RequestMapping("/user")
public class Controller {
    @Autowired
    private FeignService feignService;

    @GetMapping("/hi")
    public String hi() {
        return feignService.hi();
    }
}
