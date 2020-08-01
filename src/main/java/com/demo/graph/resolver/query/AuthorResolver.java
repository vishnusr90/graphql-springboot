package com.demo.graph.resolver.query;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.demo.graph.entity.Author;
import com.demo.graph.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AuthorResolver implements GraphQLResolver<Author> {
    @Autowired
    private Book.Repo bookRepository;

    public List<Book> getBooks(Author author) {
        return bookRepository.findAll()
                .stream()
                .filter(book -> book.getAuthor().getId().equals(author.getId()))
                .collect(Collectors.toList());
    };
}
