package com.demo.graph.resolver.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.demo.graph.entity.Author;
import com.demo.graph.entity.Book;
import com.demo.graph.service.AuthorService;
import com.demo.graph.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookService bookService;

    public List<Author> findAllAuthors() { return this.authorService.getAllAuthors(); }

    public List<Book> findAllBooks() { return this.bookService.getAllBooks(); }
}
