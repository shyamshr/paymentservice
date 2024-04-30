package com.example.paymentservice.paymentgateways.razorpay;

import com.example.paymentservice.paymentgateways.PaymentGateway;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

//@Service
public class RazorpayPaymentGateway{
   // @Override
    public String generatePaymentLink(Long amount) throws RazorpayException {
        RazorpayClient razorpay = new RazorpayClient("[YOUR_KEY_ID]", "[YOUR_KEY_SECRET]");

        JSONObject orderRequest = new JSONObject();
        orderRequest.put("amount",50000);
        orderRequest.put("currency","INR");
        orderRequest.put("receipt", "receipt#1");
        JSONObject notes = new JSONObject();
        notes.put("notes_key_1","Tea, Earl Grey, Hot");
        orderRequest.put("notes",notes);

       // Order order = instance.orders.create(orderRequest);
        return null;
    }
}
