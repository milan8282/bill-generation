package com.example.inventory.bill.generation.Schedulers;

import com.example.inventory.bill.generation.Services.EmailService;
import com.example.inventory.bill.generation.Services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ReportScheduler {

    @Autowired
    private ReportService reportService;

    @Autowired
    private EmailService emailService;

    @Scheduled(cron = "0 0 22 * * *")
    public void sendReport() throws IOException {
        try {
            reportService.generateReport();
            emailService.sendReportEmail();
        } catch (IOException | jakarta.mail.MessagingException e) {
            e.printStackTrace();
        }
    }
}