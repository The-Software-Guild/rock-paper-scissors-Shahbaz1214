/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shahbaz
 */

public class Hello {

    public static void main(String[] args) {

   
         int i=1;    
    do{    
        System.out.println("He loves me");   
        System.out.println("He loves me not");   
   
           try {
             i++;
             Thread.sleep(1000L);    // 1000L = 1000ms = 1 second
            }
       catch (InterruptedException e) {
   
                                      }
    }while(i<=34); 
    System.out.println("I knew it.  loves me");   
    }
    }