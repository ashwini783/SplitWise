package com.example.splitwisee.strategy;

import com.example.splitwisee.models.Expense;
import com.example.splitwisee.models.Transaction;

import java.util.List;

public class HeapSettleUpStrategy implements SettleUpStrategy {
    @Override
    public List<Transaction> settleUp(List<Expense> expenses) {
        return List.of();
    }
    //Find net ammount
    //Create Two Heap
    //Always pick max of both side , and settle one of the sides
}
