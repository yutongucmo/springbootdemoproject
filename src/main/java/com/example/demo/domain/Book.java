package com.example.demo.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor // it generates a constructor with one parameter for each field, e.g., public Book(Id, Title, Author)
@NoArgsConstructor // it generates a constructor with no-arguments. e.g., public Book()
@Data
@Entity
public class Book {

    //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // primary key in the h2 database
    private String title;
    private String author;
    private String test = "Yutong: Hahahahahahahahha!!!!!";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
