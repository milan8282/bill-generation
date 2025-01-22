package com.example.inventory.bill.generation.Repositories;

import com.example.inventory.bill.generation.Models.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,Long> {
}
