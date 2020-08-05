package com.demo.graph.service;

import com.demo.graph.entity.Author;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private Author.Repo authorRepository;

    public List<Author> getAllAuthors() {
        return this.authorRepository.findAll();
    }

    @Transactional
    public Author addAuthor(String firstName, String lastName, int age, String country, String emailId) {
        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        author.setAge(age);
        author.setCountry(country);
        author.setEmailId(emailId);
        return this.authorRepository.save(author);
    }
}
