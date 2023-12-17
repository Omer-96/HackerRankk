/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author omero
 */
public class soruTWO {
      public static void main(String[] args) {
      /*    Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        double d =scan.nextDouble();
        String a =scan.nextLine();
        String s =scan.nextLine();
        soruTWO metot = new soruTWO();
        metot.yaz(i);
        metot.yaz(d);
        metot.yaz(s);
        */
        
        Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    scan.nextLine();
    double d = scan.nextDouble();
    scan.nextLine();
    String s = scan.nextLine();

            scan.close();
  

    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
        
        
        
    }
    
    public void yaz(int i){System.out.println("Int: " + i);}
    public void yaz(double d){System.out.println("Double: " + d);}
    public  void yaz(String s){System.out.println("String: " + s);}
    
}
