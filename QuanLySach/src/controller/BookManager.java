/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import common.Algorithm;
import java.awt.BorderLayout;
import model.Sach;
import view.*;
import java.util.Scanner;
/**
 *
 * @author Quắn
 */
public class BookManager extends Menu<String> {
    protected Algorithm alg;
    protected Sach sach;
    protected Validation val;
    static Scanner sc = new Scanner(System.in);
    public BookManager(String title,String[] mc){
        super(title, mc);
        alg = new Algorithm();
        sach = new Sach();
        val = new Validation();
    }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                String addNameBook = val.checkInput();
                String addNameAuthor = val.checkInput();
                 sach = new Sach(addNameBook,addNameAuthor);
                alg.addBook(addNameBook, addNameAuthor);
                break;
            case 2:
                String removeBook = val.checkInput();
                sach = new Sach();
                System.out.println(alg.deleteBook(removeBook));
                break;
            case 3:
                String displayBook = val.checkInput();
                sach = new Sach();
                System.out.println(alg.displayUser(displayBook));
                break;
            case 4:
                alg.displayAll();
                break;
            case 5:
                System.exit(0);
        }
    }
}
