package nl.devoteam.di.exercise04.dao;

import nl.devoteam.di.exercise04.Order;

public class OracleOrderDAO implements OrderDAO {

    @Override
    public void save(Order order) {
        System.out.println(String.format("Order %s has been saved to the 'Oracle' Database", order.getOrderNumber()));
    }
}
