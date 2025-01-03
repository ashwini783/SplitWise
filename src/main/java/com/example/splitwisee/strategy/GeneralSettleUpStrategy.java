package com.example.splitwisee.strategy;

import com.example.splitwisee.models.Expense;
import com.example.splitwisee.models.Transaction;

import java.util.List;

public class GeneralSettleUpStrategy implements SettleUpStrategy {
    @Override
    public List<Transaction> settleUp(List<Expense> expenses) {
        return List.of();
    }
}
