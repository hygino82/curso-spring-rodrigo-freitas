package br.com.book.entity;

import javax.persistence.*;

@Entity(name = "author")
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    public Author(String name) {

        this.name = name;
    }
}
