package com.mayur.graphqlpractice.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mayur.graphqlpractice.entities.Author;

@Repository
public interface AuthorRepo extends MongoRepository<Author, Long>{

}
