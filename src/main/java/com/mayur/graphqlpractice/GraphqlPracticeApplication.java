package com.mayur.graphqlpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages = "com.mayur.graphqlpractice.entities")
@ComponentScan(basePackages = { "com.mayur.graphqlpractice.services", "com.mayur.graphqlpractice.graphql", "com.mayur.graphqlpractice.repos"})
@SpringBootApplication
public class GraphqlPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlPracticeApplication.class, args);
	}

}
