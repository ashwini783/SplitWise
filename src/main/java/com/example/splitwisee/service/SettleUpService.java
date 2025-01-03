package com.example.splitwisee.service;

import com.example.splitwisee.models.Expense;
import com.example.splitwisee.models.Group;
import com.example.splitwisee.models.Transaction;
import com.example.splitwisee.repositories.GroupRepository;
import com.example.splitwisee.strategy.GeneralSettleUpStrategy;
import com.example.splitwisee.strategy.SettleUpStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SettleUpService {

    private GroupRepository groupRepository;
    private SettleUpStrategy settleUpStrategy;

    @Autowired
    SettleUpService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;

        //ideally should be done by factory based on user config or what admin decide
        this.settleUpStrategy = new GeneralSettleUpStrategy();
    }
    public List<Transaction> settleUpGroup(long groupId){
        //1. get the group
         Optional<Group> groupOptional=groupRepository.findById(groupId);
            if(groupOptional.isEmpty()){
                throw new RuntimeException("Group not found");
            }

        //2. get all the expense of group
           Group group=groupOptional.get();
            List<Expense>expense=group.getExpenses();


        //3. call the algo and pass expenses to get the transaction
        return settleUpStrategy.settleUp(expense);
    }
}
