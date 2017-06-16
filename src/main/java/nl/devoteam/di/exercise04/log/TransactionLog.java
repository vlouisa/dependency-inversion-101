package nl.devoteam.di.exercise04.log;

import nl.devoteam.di.exercise04.Order;

public interface TransactionLog {

    void log(Order order);
}
