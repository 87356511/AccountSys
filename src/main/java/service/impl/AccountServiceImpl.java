package service.impl;

import domain.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reporsitory.AccountReporsitoty;

import service.AccountService;

import java.util.List;

@Service   //相当于Component
@Transactional  //事务处理
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountReporsitoty accountReporsitoty;

    @Override
    public Account account(int number) {
        return accountReporsitoty.account(number);
    }




}
