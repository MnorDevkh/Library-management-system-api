package org.example.student.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-student")
public class StudentController {
    @GetMapping("/students")
    public String endpoint() {
        return "Hello from Service Student!";
    }

}
