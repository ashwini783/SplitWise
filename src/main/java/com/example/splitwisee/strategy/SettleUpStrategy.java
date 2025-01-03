package com.example.splitwisee.strategy;

import com.example.splitwisee.models.Expense;
import com.example.splitwisee.models.Transaction;

import java.util.List;
public interface SettleUpStrategy {
    List<Transaction> settleUp(List<Expense>expenses);
}
