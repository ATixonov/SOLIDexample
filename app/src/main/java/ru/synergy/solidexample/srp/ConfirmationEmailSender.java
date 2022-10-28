package ru.synergy.solidexample.srp;

import ru.synergy.solidexample.models.Order;

public class ConfirmationEmailSender {

    public void sendConfirmationEmail(Order order){
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();
    }
}
