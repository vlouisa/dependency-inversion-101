package nl.devoteam.di.exercise04;

import nl.devoteam.di.exercise04.dao.OracleOrderDAO;
import nl.devoteam.di.exercise04.dao.OrderDAO;
import nl.devoteam.di.exercise04.log.FileTransactionLog;
import nl.devoteam.di.exercise04.log.TransactionLog;

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
