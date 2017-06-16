package nl.devoteam.di.exercise04;

import nl.devoteam.di.exercise04.dao.OracleOrderDAO;

public class OrderApp {
    private static final Order ORDER = new Order("666");

    public static void main(String[] args) {
        OrderService orderService = new OrderService(new OracleOrderDAO());
        orderService.register(ORDER);
    }
}
