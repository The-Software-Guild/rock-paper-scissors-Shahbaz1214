/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shahbaz
 */
import java.util.Scanner;
public class fourTimes{

    public static void main(String[] args) {

        
        int b, c;
         Scanner myScanner = new Scanner(System.in);
         
         String stringOperand1 = "";
             System.out.println("Please enter the  table to recite:");
     stringOperand1 = myScanner.nextLine();
     b = Integer.parseInt(stringOperand1);
       
        for (int i = 1; i < 11; i++) {
            
        
   
         int mul = b * i;
               System.out.println(b + "X" + i + "=" + mul);
        }
        
        }
    }