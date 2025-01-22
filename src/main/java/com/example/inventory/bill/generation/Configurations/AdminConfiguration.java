package com.example.inventory.bill.generation.Configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "admin")
public class AdminConfiguration {

    private String adminName;
    private String adminContactNumber;
    private String adminEmail;
    private String adminWhatsappNumber;

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminContactNumber() {
        return adminContactNumber;
    }

    public void setAdminContactNumber(String adminContactNumber) {
        this.adminContactNumber = adminContactNumber;
    }

    public String getAdminWhatsappNumber() {
        return adminWhatsappNumber;
    }

    public void setAdminWhatsappNumber(String adminWhatsappNumber) {
        this.adminWhatsappNumber = adminWhatsappNumber;
    }
}
