package com.example.inventory.bill.generation.Services;


import com.example.inventory.bill.generation.Models.*;
import com.example.inventory.bill.generation.Repositories.CustomerRepository;
import com.example.inventory.bill.generation.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BillService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CustomerRepository customerRepository;

    public Bill generateBill(OrderDetail orderDetail) {
        double totalAmount = 0.0;

        for (OrderItem item : orderDetail.getOrderItems()) {
            Product product = productRepository.findById(item.getProductId()).orElseThrow(() -> new RuntimeException("Product not found with id " + item.getProductId()));
            double productPrice = product.getPrice();
            double productGst = product.getGst();
            double itemTotal = item.getQuantity() * productPrice;
            double gstAmount = itemTotal * (productGst / 100);
            totalAmount += itemTotal + gstAmount;
        }

        Bill bill = new Bill();
        bill.setDate(LocalDate.now());
        bill.setTotalAmount(totalAmount);
        bill.setCustomerId(orderDetail.getCustomerId());
        bill.setOrderId(orderDetail.getOrderId());

        Customer customer = customerRepository.findById(orderDetail.getCustomerId()).orElseThrow(() -> new RuntimeException("customer not found with id " + orderDetail.getCustomerId()));
        bill.setCustomerName(customer.getName());
        bill.setCustomerMobileNumber(customer.getMobileNumber());
        bill.setCustomerEmail(customer.getEmail());

        return bill;
    }
}

