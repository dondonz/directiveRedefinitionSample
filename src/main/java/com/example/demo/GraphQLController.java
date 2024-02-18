package com.example.demo;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
class GraphQLController {
    @QueryMapping
    public String hello() {
        return "Hello, world!";
    }

}