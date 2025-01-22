package com.example.inventory.bill.generation.Controllers;

import com.example.inventory.bill.generation.Models.OrderDetail;
import com.example.inventory.bill.generation.Models.ResponseDTO;
import com.example.inventory.bill.generation.Repositories.OrderDetailRepository;
import com.example.inventory.bill.generation.Services.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    @Autowired
    private OrderDetailRepository orderDetail;

    @PostMapping("placeOrder")
    public ResponseDTO<OrderDetail> placeOrder(@RequestBody OrderDetail orderDetail) {
        return orderDetailService.placeOrder(orderDetail);
    }

    @GetMapping("getAll")
    public List<OrderDetail> getAllOrders() {
        return orderDetail.findAll();
    }

}