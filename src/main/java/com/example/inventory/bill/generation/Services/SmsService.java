package com.example.inventory.bill.generation.Services;

import com.example.inventory.bill.generation.Configurations.TwilioConfiguration;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsService {
    @Autowired
    TwilioConfiguration configuration;

    public void sendSms(String customerNumber, String message) {
        String customerPhoneNumber = "+91" + customerNumber;

        Message.creator(
                new PhoneNumber(customerPhoneNumber),
                new PhoneNumber("+15074315223"),
                message
        ).create();

        System.out.println("sms sent to customer : " + customerPhoneNumber + " with message " + message);

    }
}