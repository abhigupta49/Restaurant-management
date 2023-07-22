package com.example.Abhishek_Restaurant_Management.respository;

import com.example.Abhishek_Restaurant_Management.model.Customer;

import java.util.List;

public interface ICustomerRepo {
    void save(Customer customer);

    List<Customer> findAll();

    Customer findFirstByCustomerEmail(String email);
}
