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
    public Author createAuthor(final String name, final Integer age) {
        return this.authorService.addAuthor(name, age);
    }



}
