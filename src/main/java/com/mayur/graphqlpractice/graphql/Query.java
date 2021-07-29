package com.mayur.graphqlpractice.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mayur.graphqlpractice.repos.AuthorRepo;
import com.mayur.graphqlpractice.repos.PostRepo;

import com.mayur.graphqlpractice.entities.Post;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	PostRepo postRepo;
	
	@Autowired
	AuthorRepo authorRepo;
	
	@Transactional
	public List<Post> getRecentPosts(int page) {
		List<Post> posts = postRepo.findAll(PageRequest.of(page, 3)).toList();
		for(int i=0; i<posts.size(); i++) {
			posts.get(i).setAuthor(authorRepo.findById(posts.get(i).getAid()).get());
		}
		return posts;
    }
}
