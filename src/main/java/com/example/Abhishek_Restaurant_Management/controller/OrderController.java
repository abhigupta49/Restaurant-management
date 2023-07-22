package com.example.Abhishek_Restaurant_Management.controller;

import com.example.Abhishek_Restaurant_Management.model.Order;
import com.example.Abhishek_Restaurant_Management.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @GetMapping("orders")
    public List<Order> getAllOrders()
    {

        return orderService.getAllOrders();
    }
}
