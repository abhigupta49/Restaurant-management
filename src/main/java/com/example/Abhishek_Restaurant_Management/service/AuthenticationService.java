package com.example.Abhishek_Restaurant_Management.service;

import com.example.Abhishek_Restaurant_Management.model.AuthenticationToken;
import com.example.Abhishek_Restaurant_Management.respository.IAuthTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthenticationService {
    @Autowired
    IAuthTokenRepo authenticationTokenRepo;

    public boolean authenticate(String email, String authenticationTokenValue)
    {

        IAuthTokenRepo authTokenRepo;
        AuthenticationToken authToken = authenticationTokenRepo.findFirstByTokenValue(authenticationTokenValue);

        if(authToken == null)
        {
            return false;
        }

        String tokenConnectedEmail = authToken.getCustomer().getCustomerEmail();

        return tokenConnectedEmail.equals(email);
    }
}
