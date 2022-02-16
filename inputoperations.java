/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Shahbaz
 */
public class Hello {
        public static void main(String[] args) {
     
         int a = 0;
         int b = 0;
        
         Scanner myScanner = new Scanner(System.in);
         
         
    String stringOperand1 = "";
    String stringOperand2 = "";
    
    
     System.out.println("Please enter the first number:");
     stringOperand1 = myScanner.nextLine();
     
      System.out.println("Please enter the second number:");
      stringOperand2 = myScanner.nextLine();
      
      a = Integer.parseInt(stringOperand1);
      b = Integer.parseInt(stringOperand2);
      
         int sum = a + b;
         System.out.println("Sum is:" + sum);
        
            int sub = a - b;
            System.out.println("Difference is:" + sub);
       
               int mul = a * b;
               System.out.println("Product is:" + mul);

                  float div = a / b;
                  System.out.println("Division is:" + div);
        
       }
}