package com.mayur.graphqlpractice.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mayur.graphqlpractice.entities.Post;

@Repository
public interface PostRepo extends MongoRepository<Post, Long>{

}
