package com.demo.graph.entity;

import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private int age;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books;

    public Author(Long authorId) {
        this.id = id;
    }

    public String toString() {
        return "Name : "+name;
    }

    public interface Repo extends JpaRepository<Author, Long> { }
}

