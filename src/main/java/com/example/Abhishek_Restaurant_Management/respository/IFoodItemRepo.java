package com.example.Abhishek_Restaurant_Management.respository;

import com.example.Abhishek_Restaurant_Management.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodItemRepo extends JpaRepository<FoodItem,Long> {
}
