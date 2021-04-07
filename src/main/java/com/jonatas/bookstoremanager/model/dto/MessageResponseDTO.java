package com.jonatas.bookstoremanager.model.dto;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Builder
public class MessageResponseDTO {



    public MessageResponseDTO(String message) {
        this.message = message;
    }

    private String message;

}
