package org.example.library.student;


import reactor.core.publisher.Mono;

public interface StudentService {
    Mono<String> getStudentData();
}
