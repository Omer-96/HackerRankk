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
public class soruOne {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
          int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
   
    if(!(N%2 == 0)) {
        System.out.println("Weird");
    } else if(N>=2 && N<=5) {
        System.out.println("Not Weird");
    } else if(N>=6 && N<=20) {
        System.out.println("Weird");
    } else {
        System.out.println("Not Weird");
    }

    scanner.close();
        
    
        
    }
}
