package ru.synergy.solidexample.srp;

import ru.synergy.solidexample.models.Order;

public class OrderProcessor {

    public void process(Order order){
        MySQLOrderRepository repository = new MySQLOrderRepository();
        ConfirmationEmailSender mailSender = new ConfirmationEmailSender();

        if (order.isValid() && repository.save(order)){
            mailSender.sendConfirmationEmail(order);
        }
    }
}
