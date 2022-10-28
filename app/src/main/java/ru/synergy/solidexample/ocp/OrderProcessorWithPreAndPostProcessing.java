package ru.synergy.solidexample.ocp;

import ru.synergy.solidexample.models.Order;
import ru.synergy.solidexample.srp.OrderProcessor;

public class OrderProcessorWithPreAndPostProcessing extends OrderProcessor {

    @Override
    public void process(Order order) {
        super.process(order);
        beforeProcessing();
        afterProcessing();
    }

    private void beforeProcessing() {
    }

    private void afterProcessing() {
    }
}
