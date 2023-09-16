/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import controller.Program;
/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args){
        String []mChon = {"Add", "Delete", "Check", "Display", "Check Size", "Boc Tham"};
       Program l = new Program("Main Menu", mChon);
       l.run();
    }
}
