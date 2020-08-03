package com.demo.graph.entity;

import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;


@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    public String publication;

    private int pages;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id", nullable = false, updatable = false)
    private Author author;

    public interface Repo extends JpaRepository<Book, Long> {
        Book findBookByTitle(String title);
    }
}
