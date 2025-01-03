package com.example.splitwisee.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//this class is just to sent in response so not make it as entity
public class Transaction extends BaseModel{
   private User from;
   private User to;
   private int amount;
}
