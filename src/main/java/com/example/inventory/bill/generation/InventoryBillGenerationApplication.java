package com.example.inventory.bill.generation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class InventoryBillGenerationApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryBillGenerationApplication.class, args);
	}

}
