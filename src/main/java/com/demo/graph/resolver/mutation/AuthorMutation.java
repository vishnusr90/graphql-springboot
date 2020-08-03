package com.demo.graph.resolver.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.demo.graph.entity.Author;
import com.demo.graph.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class AuthorMutation implements GraphQLMutationResolver {
    @Autowired
    private AuthorService authorService;

    @Transactional
    public Author createAuthor(final String firstName, final String lastName, final Integer age, final String country, final String emailId) {
        return this.authorService.addAuthor(firstName, lastName, age, country, emailId);
    }
}
