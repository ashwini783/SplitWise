package com.example.splitwisee.controller;

import com.example.splitwisee.dtos.ResponseStatus;
import com.example.splitwisee.dtos.SettleUpRequestDTO;
import com.example.splitwisee.dtos.SettleUpResponseDTO;
import com.example.splitwisee.models.Transaction;
import com.example.splitwisee.service.SettleUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SettleUpController {

    private SettleUpService settleUpService;

    @Autowired
    public SettleUpController(SettleUpService settleUpService) {
        this.settleUpService = settleUpService;
    }
    public SettleUpResponseDTO settleUpGroup(SettleUpRequestDTO request){
        SettleUpResponseDTO response = new SettleUpResponseDTO();

        try{
            List<Transaction> transactionList=settleUpService.settleUpGroup(request.getGroupId());
              response.setTransactions(transactionList);
              response.setResponseStatus(ResponseStatus.SUCCESS);
              response.setMessage("Transaction group settle up successfully");
        }
        catch(Exception e){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setMessage(e.getMessage());
        }
        return response;
    }
}
