package com.jonatas.bookstoremanager.repository;

import com.jonatas.bookstoremanager.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
