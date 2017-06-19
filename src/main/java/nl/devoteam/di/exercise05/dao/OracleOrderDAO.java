package nl.devoteam.di.exercise05.dao;

import nl.devoteam.di.exercise05.Order;
import nl.devoteam.di.exercise05.log.TransactionLog;

public class OracleOrderDAO implements OrderDAO {
    private TransactionLog transactionLog;

    public OracleOrderDAO(TransactionLog transactionLog) {
        this.transactionLog = transactionLog;
    }

    @Override
    public void save(Order order) {
        transactionLog.log(order);
        System.out.println(String.format("INSERT order %s INTO 'Oracle' Database", order.getOrderNumber()));
    }
}
