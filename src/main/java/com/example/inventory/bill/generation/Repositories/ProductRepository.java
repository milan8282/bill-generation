package com.example.inventory.bill.generation.Repositories;

import com.example.inventory.bill.generation.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
