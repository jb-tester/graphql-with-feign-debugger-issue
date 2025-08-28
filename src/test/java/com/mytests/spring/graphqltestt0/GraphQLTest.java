package com.mytests.spring.graphqltestt0;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureGraphQlTester;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@AutoConfigureGraphQlTester
@SpringBootTest
public class GraphQLTest {
    @Autowired
    private GraphQlTester graphQlTester;
    @Test
    void helloWorldTest() {
        String query = """
                query MyQuery {
                  helloWorld
                }
                """;
        graphQlTester.document(query).execute();

    }
}
