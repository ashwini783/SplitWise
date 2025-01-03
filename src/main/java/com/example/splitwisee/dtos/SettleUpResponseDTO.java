package com.example.splitwisee.dtos;

import com.example.splitwisee.models.Transaction;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class SettleUpResponseDTO {
    private List<Transaction> transactions;
    private ResponseStatus responseStatus;
    private String message;
}
