package com.example.paymentservice.services;

import com.example.paymentservice.paymentgateways.PaymentGateway;
import com.stripe.exception.StripeException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentGateway paymentGateway;
    public PaymentService(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }
    public String createPaymentLink(Long orderId) throws StripeException {
        //usually payment gateway require following parameters to create a payment link:
        //orderId, email,phone,amount
        //and return a payment link
        //Flow:
        //1. Get userId from order service
        //2. Get email and phone from user service
        //3. Get amount from order service
        //4. Get payment link from payment gateway using the above parameters
        //5. Return the payment link


        return paymentGateway.generatePaymentLink(10000L);
    }
}
