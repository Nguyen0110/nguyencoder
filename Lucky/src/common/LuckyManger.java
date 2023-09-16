/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;
import java.util.*;
import model.Phieu;
/**
 *
 * @author USER
 */
public class LuckyManger {
    Set<Phieu> khoThamTrungThuong = new HashSet<>();
    public void add(Phieu phieu){
        this.khoThamTrungThuong.add(phieu);
    }
    public boolean remove(Phieu phieu){
        return this.khoThamTrungThuong.remove(phieu);
    }
    public boolean check(Phieu phieu){
        return this.khoThamTrungThuong.contains(phieu);
    }
    public void display(){
        for(Phieu s : khoThamTrungThuong){
            System.out.println(s.toString());
        }
    }
    public int checksize(){
        return this.khoThamTrungThuong.size();
    }
    public String bocTham() {
        String result = "";
        Random rd = new Random();
        int randomIndex = rd.nextInt(khoThamTrungThuong.size());
        result = (String) this.khoThamTrungThuong.toArray()[randomIndex];
        return result;
    }
}
