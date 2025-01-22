package com.example.inventory.bill.generation.Repositories;

import com.example.inventory.bill.generation.Models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Long> {
}
