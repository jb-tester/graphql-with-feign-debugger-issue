package com.mytests.spring.graphqltestt0;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphqlController {

    @QueryMapping
    String helloWorld() {
        return "HI";
    }
}