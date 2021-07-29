package com.mayur.graphqlpractice.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mayur.graphqlpractice.entities.Author;
import com.mayur.graphqlpractice.entities.Post;
import com.mayur.graphqlpractice.exceptions.AuthorDoesNotExistException;
import com.mayur.graphqlpractice.repos.AuthorRepo;
import com.mayur.graphqlpractice.repos.PostRepo;
import com.mayur.graphqlpractice.services.SequenceGeneratorService;

@Component
public class Mutation implements GraphQLMutationResolver {
	
	@Autowired
	SequenceGeneratorService sequenceGenerator;
	
	@Autowired
	PostRepo postRepo;
	
	@Autowired
	AuthorRepo authorRepo;

	public Post writePost(String title, String text, String category, int author) {
		Author authorObj = authorRepo.findById(new Long(author)).orElse(null);
		if(authorObj == null) {
			throw new AuthorDoesNotExistException("Author does not exist");
		}
        Post post = new Post();
        post.setPid(sequenceGenerator.generateSequence(Post.SEQUENCE_NAME));
        post.setTitle(title);
        post.setText(text);
        post.setCategory(category);
        post.setAid(new Long(author));
        //post.setAuthorId(author);
        postRepo.save(post);
        post.setAuthor(authorObj);
        return post;
    }
	
	public Author insertAuthor(String name, String thumbnail) {
		Author author = new Author();
		author.setAid(sequenceGenerator.generateSequence(Author.SEQUENCE_NAME));
		author.setName(name);
		author.setThumbnail(thumbnail);
		authorRepo.save(author);
		return author;
	}
}
