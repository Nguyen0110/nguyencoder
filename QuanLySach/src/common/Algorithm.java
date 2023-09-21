/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.*;
import java.util.Map.*;

/**
 *
 * @author Quắn
 */
public class Algorithm {
    private Map<String, String> data = new HashMap<String,String>();
    
    public void addBook(String nameBook, String nameAuthor){
         this.data.put(nameBook, nameAuthor);
    }
    public String deleteBook(String nameBook){
        return this.data.remove(nameBook);
    }
    public String displayUser(String nameBook){
        StringTokenizer stz = new StringTokenizer(nameBook, " ");
        String userName = this.data.get(nameBook);
        while(stz.hasMoreTokens()){
            String readUser = stz.nextToken();
            if(data.containsKey(readUser)){
                System.out.print("Name Author: " );
                return userName;
            }
        }
        return "Not Found";
    }
    public void displayAll(){
        Set<Entry<String,String>> allEle = data.entrySet();
        for(Entry<String,String> entry : allEle){
            String nameBook = entry.getKey();
            String nameAuthor  = entry.getValue();
            System.out.println("[Name Book: " + nameBook + " Name Author: " + nameAuthor + "]");
        }
    }
}
