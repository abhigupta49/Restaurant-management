package com.example.Abhishek_Restaurant_Management.respository;

import com.example.Abhishek_Restaurant_Management.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
