package nl.devoteam.di.exercise04;

import nl.devoteam.di.exercise04.dao.OrderDAO;

public class OrderService {
    private OrderDAO orderDAO;

    public OrderService(OrderDAO orderDAO){
        this.orderDAO = orderDAO;
    }

    public void register(Order order){
        orderDAO.save(order);
    }

}
