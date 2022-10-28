package ru.synergy.solidexample.dip;

import ru.synergy.solidexample.models.Order;

public class MySQLOrderRepository implements OrderRepository {

    @Override
    public boolean save(Order order) {
    //todo    ? MySqlConnection connection = new MySqlConnection("database.url");
        return true;
    }
}
