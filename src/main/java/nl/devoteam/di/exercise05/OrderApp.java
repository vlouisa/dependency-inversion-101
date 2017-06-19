package nl.devoteam.di.exercise05;

import nl.devoteam.di.exercise05.dao.OracleOrderDAO;
import nl.devoteam.di.exercise05.dao.OrderDAO;
import nl.devoteam.di.exercise05.log.FileTransactionLog;
import nl.devoteam.di.exercise05.log.TransactionLog;

public class OrderApp {
    private static final Order ORDER = new Order("666");

    public static void main(String[] args) {
        OrderService orderService = constructTheProperOrderService();
        orderService.register(ORDER);

    }

    private static OrderService constructTheProperOrderService() {
        TransactionLog transactionLog = new FileTransactionLog();
        OrderDAO orderDAO = new OracleOrderDAO(transactionLog);
        return new OrderService(orderDAO);
    }
}
