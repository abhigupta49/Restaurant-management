package com.example.Abhishek_Restaurant_Management.respository;

import com.example.Abhishek_Restaurant_Management.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order,Long> {
}
