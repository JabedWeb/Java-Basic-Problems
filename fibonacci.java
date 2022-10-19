/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fibonacchi;

import java.util.Scanner;

/**
 *
 * @author cse
 */
public class fibonacci {

   
    public static void main(String[] args) {
                int n,a=0,b=0,c=1;
                Scanner sca =new Scanner(System.in);
                System.out.println("Input a number");
		n=sca.nextInt();
                
		for(int i=1;i<=n;i++) {
                  a=b;
                  b=c;
                  c=a+b;
                  System.out.print(a+" ");
                }
}
}
