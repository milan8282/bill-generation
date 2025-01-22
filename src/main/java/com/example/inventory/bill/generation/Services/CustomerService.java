package com.example.inventory.bill.generation.Services;

import com.example.inventory.bill.generation.Models.Customer;
import com.example.inventory.bill.generation.Models.ResponseDTO;
import com.example.inventory.bill.generation.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public ResponseDTO<List<Customer>> saveCustomer(List<Customer> customers) {
        try {
            return new ResponseDTO<>(customerRepository.saveAll(customers), HttpStatus.OK, "save customer successfully");
        } catch (Exception e) {
            return new ResponseDTO<>(null, HttpStatus.INTERNAL_SERVER_ERROR, "failed to save");
        }
    }


}
