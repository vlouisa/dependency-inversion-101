package nl.devoteam.di.exercise04;

import nl.devoteam.di.exercise04.dao.OracleOrderDAO;
import nl.devoteam.di.exercise04.dao.OrderDAO;
import nl.devoteam.di.exercise04.log.FileTransactionLog;
import nl.devoteam.di.exercise04.log.TransactionLog;

public class OrderApp {
    private static final Order ORDER = new Order("666");

    public static void main(String[] args) {
        OrderDAO orderDAO = constructTheProperDAO();
        OrderService orderService = new OrderService(orderDAO);
        orderService.register(ORDER);

    }

    private static OrderDAO constructTheProperDAO() {
        TransactionLog transactionLog = new FileTransactionLog();
        return new OracleOrderDAO(transactionLog);
    }
}
