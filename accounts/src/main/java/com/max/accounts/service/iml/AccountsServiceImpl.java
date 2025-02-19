package com.max.accounts.service.iml;

import org.springframework.stereotype.Service;

import com.max.accounts.dto.CustomerDto;
import com.max.accounts.repository.AccountsRepository;
import com.max.accounts.repository.CustomerRepository;
import com.max.accounts.service.IAccountsService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

        throw new UnsupportedOperationException("Unimplemented method 'createAccount'");
    }

    @Override
    public CustomerDto fetchAccount(String mobileNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fetchAccount'");
    }

    @Override
    public boolean updateAccount(CustomerDto customerDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAccount'");
    }

    @Override
    public boolean deleteAccount(String mobileNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
    }

}
