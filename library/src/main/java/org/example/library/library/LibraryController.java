package org.example.library.library;

import org.example.library.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service-library")
public class LibraryController {
    private final StudentService service;

    @Autowired
    public LibraryController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/call-student")
    public String callServiceB() {
        return service.callHello();
    }

}
