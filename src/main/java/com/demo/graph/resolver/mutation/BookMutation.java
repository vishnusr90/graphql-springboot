package com.demo.graph.resolver.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.demo.graph.entity.Author;
import com.demo.graph.entity.Book;
import com.demo.graph.service.AuthorService;
import com.demo.graph.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class BookMutation implements GraphQLMutationResolver {
    @Autowired
    private BookService bookService;

    @Transactional
    public Book createBook(final String title, final int pages, final String publication, Long authorId) {
        return this.bookService.addBook(title, pages, publication, authorId);
    }
}