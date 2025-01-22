package com.example.inventory.bill.generation.Repositories;

import com.example.inventory.bill.generation.Models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
