package com.example.Abhishek_Restaurant_Management.respository;

import com.example.Abhishek_Restaurant_Management.model.AuthenticationToken;
import com.example.Abhishek_Restaurant_Management.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthTokenRepo extends JpaRepository<AuthenticationToken,Long> {

    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByCustomer(Customer customer);
}
