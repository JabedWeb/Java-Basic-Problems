/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.factorial;

import java.util.Scanner;

/**
 *
 * @author cse
 */
public class Factorial {

       public static void main(String[] args) {
                int n,a=0,b=0,c=1;
                Scanner sca =new Scanner(System.in);
                System.out.println("Input a number");
		n=sca.nextInt();
                int fac=1;
                
		for(int i=1;i<=n;i++) {
                  fac=fac*i;
                  
                }
                System.out.print(fac+" ");
}
}
