package org.example.library.student;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class StudentServiceImpl implements StudentService {
    private final WebClient.Builder webClient;

    public StudentServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder;
    }


    @Override
    public Mono<String> getStudentData() {
        return webClient.build()
                .get()
                .uri("http://student/service-student/students")
                .retrieve()
                .bodyToMono(String.class);
    }


}
