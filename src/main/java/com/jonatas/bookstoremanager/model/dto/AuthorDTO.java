package com.jonatas.bookstoremanager.model.dto;

import com.jonatas.bookstoremanager.model.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {



    @Id
    private Long id;

    @NotBlank
    @Size(max = 200)
    private String name;

    @NotNull
    @Size(max = 100)
    private Integer age;


}
