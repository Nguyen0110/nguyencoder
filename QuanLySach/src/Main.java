/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import controller.BookManager;
/**
 *
 * @author Quắn
 */
public class Main {
    public static void main(String [] args){
        String [] mChon = {"Add Book", "Delete Book", "Display user", "Display all", "Delete all"};
        BookManager book= new BookManager("Main Menu", mChon);
        book.run();
    }
}
