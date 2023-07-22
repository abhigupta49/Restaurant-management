package com.example.Abhishek_Restaurant_Management.service;

import com.example.Abhishek_Restaurant_Management.model.Customer;
import com.example.Abhishek_Restaurant_Management.model.Order;
import com.example.Abhishek_Restaurant_Management.respository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderService {
    @Autowired
    IOrderRepo iorderRepo;
    public List<Order> getAllOrders()
    {
        return iorderRepo.findAll();

    }

    public String getOrderForCustomer(Customer customer) {
        return "Order is Placed";
    }

    public String cancelOrder(Order order) {
        return "Cancel Order";
    }
}
