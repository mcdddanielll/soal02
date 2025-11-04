/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas02;

import java.util.Scanner;

/**
 *
 * @author Danielrorrrrr
 */
public class Tugas02 {

    public static void main(String[] args) {
        
        Scanner inputan = new Scanner (System.in);
        
        System.out.print("Masukkan bilangan bulat positif ");
        int n = inputan.nextInt ();
       
        if (n < 0){
        System.out.println("bilangan harus bilangan bulat positif");
        }else {
            int faktorial = 1;
        for (int a = 1; a <= n; a++ ){
        faktorial *= a;}
        
        System.out.println("faktorial dari" + n + " adalah" + faktorial);
    }
      
      
        
    }
    
}