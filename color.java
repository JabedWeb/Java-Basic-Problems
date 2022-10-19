/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.color;

import java.util.Scanner;

/**
 *
 * @author cse
 */
public class color {

          public static void main(String[] args) {
              
                String colorRgb;
                Scanner sca =new Scanner(System.in);
                System.out.println("Input for color");
		colorRgb=sca.nextLine();
                
                switch (colorRgb) { 
                    case "111":
                    
                    System.out.print("W");
                    break;
                    case "000":
                    
                    System.out.print("B");
                    break;
                    
                    case "100":
                    
                    System.out.print("R");
                    break;
                         case "010":
                    
                    System.out.print("G");
                    break;
                    
                           case "001":
                    
                    System.out.print("B");
                    break;
                    
                             case "110":
                    
                    System.out.print("Y");
                    break;
                    
                                 case "011":
                    
                    System.out.print("C");
                    break;
                    
                                 case "101":
                    
                    System.out.print("M");
                    break;
                    
                    default : 
                    System.out.print("chose good one");
                }
                
               
                
}
}
