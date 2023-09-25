package ManagerGrab.controller;

import java.util.*;

import ManagerGrab.model.Driver;
import ManagerGrab.model.User;
import ManagerGrab.view.Menu;

public class AppMobile extends Menu<Driver> {
    private DriverManager dm;
    private UserManager us;
    private Driver dr;

    public AppMobile(String title, String[] mc) {
        super(title, mc);
        dm = new DriverManager();
        us = new UserManager();
        dr = new Driver();
    }

    // Add Driver
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                addDriver();
                break;
            case 2:
                viewOderList();
                break;
            case 3:
                orderCook();
                break;
        }
    }

    // ------------------- Add
    public void addDriver() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
    }

    // ----------------- View Oder
    public void viewOderList() {
        us.showAll();
    }

    // ---------------- Order
    public void orderCook() {
        Map<Driver, Integer> orderList = new HashMap<Driver, Integer>();
        dm.display();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Id Driver: ");
            int idDriver = Integer.parseInt(sc.nextLine());
            Driver dr = dm.searchDriver(idDriver);
            System.out.println("You selected: " + dr.getName() + "| Km: " + dr.getSoKm());
            int soKm = Integer.parseInt(sc.nextLine());
            if (soKm > dr.getSoKm()) {
                System.out.println("The Driver cannot go");
            } else {
                System.out.println("You want to thanh toán: (Y/N)");
                String choice = sc.nextLine();
                if (choice.equals("Y")) {
                    orderList.put(dr, soKm);
                    System.out.println("Enter Name");
                    String nameUser = sc.nextLine();
                    User user = new User(nameUser, orderList);
                    us.addCus(user);
                    break;
                }

            }
        }
    }

    // ----------------- Get Bill

}
