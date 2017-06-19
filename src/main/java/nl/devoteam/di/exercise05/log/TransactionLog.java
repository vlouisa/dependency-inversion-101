package nl.devoteam.di.exercise05.log;

import nl.devoteam.di.exercise05.Order;

public interface TransactionLog {

    void log(Order order);
}
