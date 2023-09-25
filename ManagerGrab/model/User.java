package ManagerGrab.model;

import java.util.*;

public class User {
    private String name;
    private Map<Driver, Integer> orderList = new HashMap<Driver, Integer>();

    public User(String name, Map<Driver, Integer> orderList) {
        this.name = name;
        this.orderList = orderList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Driver, Integer> getOrderList() {
        return orderList;
    }

    public void setOrderList(Map<Driver, Integer> orderList) {
        this.orderList = orderList;
    }

}
