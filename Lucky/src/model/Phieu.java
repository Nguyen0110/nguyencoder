/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class Phieu {
    private String phieu;
    public Phieu(String phieu){
        this.phieu = phieu;
    }
    public Phieu(){
        
    }

    @Override
    public String toString() {
        return "Phieu{" + "phieu=" + phieu + '}';
    }

    public String getPhieu() {
        return phieu;
    }

    public void setPhieu(String phieu) {
        this.phieu = phieu;
    }
    
}
