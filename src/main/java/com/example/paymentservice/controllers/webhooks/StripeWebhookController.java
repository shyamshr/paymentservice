package com.example.paymentservice.controllers.webhooks;

import com.stripe.model.Event;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhooks/stripe")
public class StripeWebhookController {
    @PostMapping("/")
    public void handleStripeWebhook(@RequestBody Event webhookEvent){
        //handle the stripe webhook event
        System.out.println("Stripe Webhook Event");
        return ;

    }
}
