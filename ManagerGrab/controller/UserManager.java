package ManagerGrab.controller;

import java.util.*;
import ManagerGrab.model.*;

public class UserManager {
    private DriverManager dm = new DriverManager();
    private Map<Driver, Integer> userList = new HashMap<Driver, Integer>();
    private List<User> cusList2 = new ArrayList<>();

    // ---------------------- Add User
    public void addCus(User user) {
        cusList2.add(user);
    }

    // ----------------------- Display User
    public void showAll() {
        final double $price = 5.00;
        double amount = 0;
        for (User user : cusList2) {
            System.out.println("User name: " + user.getName());
            System.out.println(" Driver " + "|KM" + "|Bill" + "| isDone");
            for (Driver dr : user.getOrderList().keySet()) {
                amount += dr.getSoKm() + $price;
                System.out.println(dr.getName() + "     " + dr.getSoKm() + "      " + amount + "      " + dr.isDone());
            }
            System.out.println("Total: " + amount);
        }
    }

    // ------------------------ Search User
    public void searchUser(String name) {

    }
}
