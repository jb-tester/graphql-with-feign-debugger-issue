package com.mytests.spring.graphqltestt0;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "name",
        url = "http://localhost:8080/"
)
public interface TestFeign {

    @GetMapping("/test")
    String test();
}