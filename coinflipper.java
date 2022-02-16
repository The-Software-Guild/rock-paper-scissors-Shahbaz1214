/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shahbaz
 */

import java.util.Random;

public class coinFlipper {

    public static void main(String[] args) {

        Random flipCoin = new Random();

        int rollResult = flipCoin.nextInt(2) + 1;

        System.out.println("TIME TO Flip a coin!");

        if (rollResult == 1) {
            System.out.println("It's a Head");
        }
        else if(rollResult == 2) {
            System.out.println("It's a Tail");
        }
        else  {
            System.out.println("Error");
        }
    }
}