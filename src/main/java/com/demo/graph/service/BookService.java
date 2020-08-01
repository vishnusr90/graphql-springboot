package com.demo.graph.service;

import com.demo.graph.entity.Author;
import com.demo.graph.entity.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private Book.Repo bookRepository;
    private Author.Repo authorRepository;

    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }

    public Book addBook(String title, Long authorId) {
        Book book = new Book();
        book.setTitle(title);

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
