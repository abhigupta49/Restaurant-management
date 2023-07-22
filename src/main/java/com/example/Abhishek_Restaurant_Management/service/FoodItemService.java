package com.example.Abhishek_Restaurant_Management.service;

import com.example.Abhishek_Restaurant_Management.model.FoodItem;
import com.example.Abhishek_Restaurant_Management.respository.IFoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {
    @Autowired
    IFoodItemRepo foodItemRepo;

    List<FoodItem> getAllFoodItems()
    {
        return foodItemRepo.findAll();
    }

    public void addFodItem(FoodItem fooditem) {

    }
}
