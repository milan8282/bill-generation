package com.example.inventory.bill.generation.Repositories;

import com.example.inventory.bill.generation.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
