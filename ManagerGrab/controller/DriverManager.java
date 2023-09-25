package ManagerGrab.controller;

import java.util.*;

import ManagerGrab.model.Driver;

public class DriverManager {
    private List<Driver> driList = new ArrayList<>();

    public DriverManager() {
        Driver dri1 = new Driver(1, "Nguyen", "Dien ban", 25, false);
        Driver dri2 = new Driver(2, "Long", "Da Nang", 40, false);
        Driver dri3 = new Driver(3, "Vu", "Hoi An", 30, false);
        driList.add(dri1);
        driList.add(dri2);
        driList.add(dri3);
    }

    public boolean addDriver(Driver dr) {
        return driList.add(dr);
    }

    // --------------------- Search
    public Driver searchDriver(int idDriver) {
        return driList.stream().filter(driver -> idDriver == driver.getId()).findAny().orElse(null);
    }

    // --------------------- Remove
    public void removeDriver(int idDriver) {
        driList.remove(searchDriver(idDriver));
    }

    // -------------------- Show all
    public void display() {
        for (Driver driver : driList) {
            System.out.println(driver.toString());
        }
    }

    public static void main(String[] args) {
        DriverManager dm = new DriverManager();
        dm.display();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the User to thanh toan: ");
            String userName = sc.nextLine();
            
        }
    }
}
