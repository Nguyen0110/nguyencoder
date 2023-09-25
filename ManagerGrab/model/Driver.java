package ManagerGrab.model;

public class Driver {
    private int id;
    private String name;
    private String address;
    private int soKm;
    private boolean isDone;

    public Driver(int id, String name, String address, int soKm, boolean isDone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.soKm = soKm;
        this.isDone = isDone;
    }

    public Driver() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        return "Driver [id=" + id + ", name=" + name + ", address=" + address + ", soKm=" + soKm +
                ", isDone=" + isDone + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        final double price = 5.00;
        double result = this.soKm + price;
        return result;
    }
}
