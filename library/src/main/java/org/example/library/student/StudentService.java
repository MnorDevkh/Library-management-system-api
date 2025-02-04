package org.example.library.student;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "student")
public interface StudentService {
    @GetMapping("/api/service-student/endpoint")
    String callHello();
}
