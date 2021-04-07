package com.jonatas.bookstoremanager.service;

import com.jonatas.bookstoremanager.model.Book;
import com.jonatas.bookstoremanager.model.dto.BookDTO;
import com.jonatas.bookstoremanager.model.dto.MessageResponseDTO;
import com.jonatas.bookstoremanager.model.mapper.BookMapper;
import com.jonatas.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {


    private BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create( BookDTO bookDTO){
        Book bookToSAve = bookMapper.toModel(bookDTO);

        Book savedBook = bookRepository.save(bookToSAve );

        return MessageResponseDTO.builder()
                .message("Book created with ID: " + savedBook.getId())
                .build();
    }



}
