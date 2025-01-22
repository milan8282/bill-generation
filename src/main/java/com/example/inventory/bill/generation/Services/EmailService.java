package com.example.inventory.bill.generation.Services;

import com.example.inventory.bill.generation.Configurations.AdminConfiguration;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private AdminConfiguration adminConfiguration;

    public void sendReportEmail() throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        String filePath = "src/main/resources/reports/products_inventory_report_" + date + ".csv";

        helper.setFrom(adminConfiguration.getAdminEmail());
        helper.setTo(adminConfiguration.getAdminEmail());
        helper.setSubject("Daily Product and Inventory Report - " + date);
        helper.setText("Please find the attached daily report of products and inventory for " + date + ".");

        File file = new File(filePath);
        helper.addAttachment("products_inventory_report_" + date + ".csv", file);

        mailSender.send(mimeMessage);
    }

    public void senEmail(String emailTO, String subject, String message, String emailFrom) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setTo(emailTO);
        helper.setSubject(subject);
        helper.setText(message);
        helper.setFrom(emailFrom);

        mailSender.send(mimeMessage);
    }
}
