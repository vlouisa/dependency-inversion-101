package nl.devoteam.di.exercise05;

import nl.devoteam.di.exercise05.dao.OrderDAO;

public class OrderService {
    private OrderDAO orderDAO;

    public OrderService(OrderDAO orderDAO){
        this.orderDAO = orderDAO;
    }

    public void register(Order order){
        orderDAO.save(order);
    }

}
