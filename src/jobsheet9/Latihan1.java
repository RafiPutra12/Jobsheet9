/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;

import java.util.Scanner;

public class Latihan1 {
    public static void hitung(int a, int b) 
    {
    System.out.println("hasil : " + (a+b));
    }
    public static void main(String[] args) {
}
    static {
    Scanner input= new Scanner(System.in);
   
    System.out.print("Masukan bilangan I:");
    int bil1= input.nextInt();
    
    System.out.print("Masukan bilangan II:");
    int bil2= input.nextInt();
    
    hitung(bil1,bil2);
}
}
