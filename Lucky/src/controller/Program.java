/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Menu;
import model.Phieu;
import common.LuckyManger;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Program extends Menu<Phieu> {

    private Phieu phieu;
    private LuckyManger lucky;
    static Scanner sc = new Scanner(System.in);

    public Program(String title, String[] mc) {
        super(title, mc);
        phieu = new Phieu();
        lucky = new LuckyManger();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.println("Enter Phieu");
                String phieu = sc.nextLine();
                Phieu tongPhieu = new Phieu(phieu);
                lucky.add(tongPhieu);
                break;
            case 2:
                System.out.println("Enter Phieu");
                String phieu1 = sc.nextLine();
                Phieu tongPhieu1 = new Phieu(phieu1);
                System.out.println(lucky.remove(tongPhieu1));
                break;
            case 3:
                System.out.println("Enter Phieu");
                String phieu2 = sc.nextLine();
                Phieu tongPhieu2 = new Phieu(phieu2);
                System.out.println(lucky.check(tongPhieu2));
                break;
            case 4:
                lucky.display();
                break;
            case 5:
                System.out.println("Lenght: " + lucky.checksize());
                break;
            case 6:
                System.out.println("Giai thuong: " + lucky.bocTham());
                break;
            case 7:
                System.exit(0);
        }
    }

}
