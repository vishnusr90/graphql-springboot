package com.demo.graph.resolver.query;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.demo.graph.entity.Author;
import com.demo.graph.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookResolver implements GraphQLResolver<Book> {
    @Autowired
    private Author.Repo authorRepository;

    public Author getAuthor(Book book) {
        return authorRepository.findById(book.getAuthor().getId()).orElse(null);
    }
}
