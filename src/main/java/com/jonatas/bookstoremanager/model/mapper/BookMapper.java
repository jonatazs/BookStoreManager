package com.jonatas.bookstoremanager.model.mapper;

import com.jonatas.bookstoremanager.model.Book;
import com.jonatas.bookstoremanager.model.dto.BookDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}
