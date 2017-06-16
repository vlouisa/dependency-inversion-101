package nl.devoteam.di.exercise04.log;

import nl.devoteam.di.exercise04.Order;

public class CloudTransactionLog implements TransactionLog {
    @Override
    public void log(Order order) {
        System.out.println(String.format("Logging order %s to the cloud", order.getOrderNumber()));
    }
}
