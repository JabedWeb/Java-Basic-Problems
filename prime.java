/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab1;
import java.util.Scanner;
/**
 *
 * @author cse
 */
public class prime {

    public static void main(String[] args) {
                int num;
                int count=0;
                Scanner sca =new Scanner(System.in);
                System.out.println("Input a number");
		num=sca.nextInt();
                
		for(int i=2;i<num;i++) {
                    if(num%i==0) { 
                    count++;
                    break;
                    }
                }
                if(count==0) {
                System.out.println("this is prime number");
                }
                else { 
                    System.out.println("this is not prime number");
                }
}
}
