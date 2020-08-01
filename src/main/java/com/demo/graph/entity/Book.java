package com.demo.graph.entity;

import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id", nullable = false, updatable = false)
    private Author author;

    public interface Repo extends JpaRepository<Book, Long>{}
}
