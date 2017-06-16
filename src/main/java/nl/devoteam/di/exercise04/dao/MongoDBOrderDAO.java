package nl.devoteam.di.exercise04.dao;

import nl.devoteam.di.exercise04.Order;
import nl.devoteam.di.exercise04.log.TransactionLog;

public class MongoDBOrderDAO implements OrderDAO {
    private TransactionLog transactionLog;

    public MongoDBOrderDAO(TransactionLog transactionLog) {
        this.transactionLog = transactionLog;
    }

    @Override
    public void save(Order order) {
        transactionLog.log(order);
        System.out.println(String.format("INSERT order %s INTO 'MongoDB' Database", order.getOrderNumber()));
    }
}
