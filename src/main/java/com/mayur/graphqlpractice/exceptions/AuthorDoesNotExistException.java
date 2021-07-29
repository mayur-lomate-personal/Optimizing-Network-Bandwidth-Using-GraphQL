package com.mayur.graphqlpractice.exceptions;

import java.util.List;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class AuthorDoesNotExistException extends RuntimeException implements GraphQLError {
	
	public AuthorDoesNotExistException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

	@Override
	public List<SourceLocation> getLocations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ErrorType getErrorType() {
		// TODO Auto-generated method stub
		return null;
	}

}
