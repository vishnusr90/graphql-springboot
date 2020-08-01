package com.demo.graph.service;

import com.demo.graph.entity.Author;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService {

    private Author.Repo authorRepository;

    public List<Author> getAllAuthors() {
        return this.authorRepository.findAll();
    }

    @Transactional
    public Author addAuthor(String name, int age) {
        Author author = new Author();
        author.setName(name);
        author.setAge(age);
        return this.authorRepository.save(author);
    }
}
