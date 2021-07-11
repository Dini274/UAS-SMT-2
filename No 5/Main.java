/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okedroid;

import java.util.*;
/**
 *
 * @author Dini Aryani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kataNormal;
        String kataBalik = "";
        //deklarasi Var
        
        Scanner input = new Scanner (System.in);
        //membuat objek input
        
        System.out.println("Input kata atau kalimat disini : ");
        
        kataNormal = input.nextLine();
        
        for (int i = kataNormal.length() - 1; i>= 0; i--) 
        {
            kataBalik += kataNormal.charAt(i);
        }
        
        System.out.println("Hasil kata yang dibalik : " + kataBalik);
        
    }
    
}
