/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;
import java.util.Scanner;
import static jobsheet9.Latihan1.hitung;
public class Latihan4 {
    public static double hitung(double w, double j){
        double k= j / w ;
        return k;
    }
    
    public static void main(String[] args) {
    
    Scanner input= new Scanner(System.in);
   
    System.out.print("Masukan waktu :");
    int w= input.nextInt();
    
    System.out.print("Masukan jarak :");
    int j= input.nextInt();
    
    double B;
    B = hitung(w,j);
           
    System.out.println("kecepatan : "+ B);
         
     }
        
}

