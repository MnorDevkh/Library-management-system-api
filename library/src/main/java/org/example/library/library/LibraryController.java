package org.example.library.library;



import org.example.library.student.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.awt.*;


@RestController
@RequestMapping("/api/service-library")
public class LibraryController {

   private final StudentService service;

    public LibraryController(StudentService service) {
        this.service = service;
    }


    @GetMapping(value = "/call-service-b")
    public Mono<String> getStudentData() {
        return service.getStudentData();
    }
}
