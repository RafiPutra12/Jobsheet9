/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;
import java.util.Scanner;
public class Latihan5 {
    public static int t(int I, int II, int III){
        int hasil = 0;
        if(I>II && I>III){
            hasil = I;
        }else if(II>I && II>III){
            hasil = II;   
        }else if(III>II && III>I){
            hasil = III;
        }
        return hasil;
    }
     public static void main(String[] args) {
         
        Scanner scan=new Scanner(System.in);
               
         System.out.println("Masukan nilai A: ");
         int a = scan.nextInt();
         System.out.println("Masukan nilai B: ");
         int b = scan.nextInt();
         System.out.println("Masukan nilai C: ");
         int c = scan.nextInt();
         
         int jawab=t(a, b, c);
         System.out.println("Nilai yang terbesar adalah: " + jawab);
      }
     
         
     
     
}
