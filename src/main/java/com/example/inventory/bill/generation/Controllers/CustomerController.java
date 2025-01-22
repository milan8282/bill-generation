package com.example.inventory.bill.generation.Controllers;

import com.example.inventory.bill.generation.Models.Customer;
import com.example.inventory.bill.generation.Models.ResponseDTO;
import com.example.inventory.bill.generation.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("saveCustomer")
    public ResponseDTO<List<Customer>> saveCustomer(@RequestBody List<Customer> customers){
        return customerService.saveCustomer(customers);
    }
}