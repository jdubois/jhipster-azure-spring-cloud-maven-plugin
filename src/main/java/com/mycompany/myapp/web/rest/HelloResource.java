package com.mycompany.myapp.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

/**
 * HelloResource controller
 */
@RestController
public class HelloResource {

    private final Logger log = LoggerFactory.getLogger(HelloResource.class);

    /**
    * GET hello
    */
    @GetMapping("/api/hello")
    public Mono<String> hello() {
        return Mono.just("Hello from Azure Spring Cloud");
    }

}
