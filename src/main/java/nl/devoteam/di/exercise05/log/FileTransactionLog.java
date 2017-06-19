package nl.devoteam.di.exercise05.log;

import nl.devoteam.di.exercise05.Order;

public class FileTransactionLog implements TransactionLog {
    @Override
    public void log(Order order) {
        System.out.println(String.format("Logging order %s to Filesystem", order.getOrderNumber()));
    }
}
