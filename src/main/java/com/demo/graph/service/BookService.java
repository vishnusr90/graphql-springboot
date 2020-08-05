package com.demo.graph.service;

import com.demo.graph.entity.Author;
import com.demo.graph.entity.Book;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private Book.Repo bookRepository;
    @Autowired
    private Author.Repo authorRepository;

    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }

    public Book addBook(String title, int pages, String publication, Long authorId) {
        Book book = new Book();
        book.setTitle(title);
        book.setPages(pages);
        book.setPublication(publication);

        Book existingBook = bookRepository.findBookByTitle(title);

        if (existingBook != null) {
            return null;
        }

        Author author = authorRepository.getOne(authorId);
        book.setAuthor(author);
        return bookRepository.save(book);
    }

    public boolean deleteBookById(Long id) {
        this.bookRepository.deleteById(id);
        return true;
    }

    ;
}
