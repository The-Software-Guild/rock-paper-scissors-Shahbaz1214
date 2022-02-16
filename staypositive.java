/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shahbaz
 */

public class stayPositive{

    public static void main(String[] args) {

       int i = 10;
 
       while (i>0){
       System.out.println("Remaining: " +i+ " seconds");
        
       try {
             i--;
             Thread.sleep(1000L);    // 1000L = 1000ms = 1 second
            }
       catch (InterruptedException e) {
   
                                      }
                  }
   System.out.println("Blast off");
    }
    }