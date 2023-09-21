/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.util.regex.*;
import java.util.Scanner;
/**
 *
 * @author Quắn
 */
public class Validation {
    public boolean isValidNameBook(String nameBook){
        String regex = "[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nameBook);
        return matcher.matches();
    }
    public String checkInput(){
        Scanner sc = new Scanner(System.in);
        String check = "";
        while(!isValidNameBook(check)){
            System.out.println("Enter Here:");
            check = sc.nextLine();
            if(isValidNameBook(check)!= true){
                System.out.println("Invalid input");
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Validation v = new Validation();
        v.checkInput();
    }
}
