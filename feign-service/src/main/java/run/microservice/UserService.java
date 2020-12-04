package run.microservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("user-service")
public interface UserService {
    @GetMapping("/user/hi")
    public String hi();
}
