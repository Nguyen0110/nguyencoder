package ManagerGrab;

import ManagerGrab.controller.AppMobile;

public class Main{
    public static void main(String[] args) {
        String mchon [] = {"Add","View Order","Booking","Exit"};
        AppMobile am = new AppMobile("Grab app", mchon);
        am.run();
    }
}