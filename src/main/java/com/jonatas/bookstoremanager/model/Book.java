package com.jonatas.bookstoremanager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer pages;

    @Column(nullable = false)
    private Integer chapters;

    @Column(nullable = false)
    private String isbn;

    @Column(nullable = false, name = "publisher_name", unique = true)
    private String publisherName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL /*{CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}*/)
    @JoinColumn(name = "author_id")
    private Author author;

    public Long getId() {
        return id;
    }
}
