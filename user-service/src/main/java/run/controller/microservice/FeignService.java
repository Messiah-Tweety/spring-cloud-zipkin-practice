package run.controller.microservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("feign-service")
public interface FeignService {
    @GetMapping("/feign-service/go")
    String hi();
}
