/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Shahbaz
 */
public class BirthStones{
        public static void main(String[] args) {

       System.out.print("Type the Number of month");
        Scanner inputReader = new Scanner(System.in);

        String monthNumber = inputReader.nextLine();

        if(monthNumber.equals("1")){
            System.out.println("January Birthstone is Garnet"); 
        }
        else if(monthNumber.equals("2")){
            System.out.println("February Birthstone is Amethyst"); 
        }
        else if(monthNumber.equals("3")){
            System.out.println("March Birthstone is Aquamarine"); 
        }
        else if(monthNumber.equals("4")){
            System.out.println("April Birthstone is Diamond"); 
        }
        else if(monthNumber.equals("5")){
            System.out.println("May Birthstone is Emarald"); 
        }else if(monthNumber.equals("6")){
            System.out.println("June Birthstone is Pearl"); 
        }else if(monthNumber.equals("7")){
            System.out.println("July Birthstone is Ruby"); 
        }else if(monthNumber.equals("8")){
            System.out.println("August Birthstone is Priodt"); 
        }else if(monthNumber.equals("9")){
            System.out.println("September Birthstone is Sapphire"); 
        }else if(monthNumber.equals("10")){
            System.out.println("October Birthstone is Opal"); 
        }else if(monthNumber.equals("11")){
            System.out.println("November Birthstone is Topaz"); 
        }
        else if(monthNumber.equals("12")){
            System.out.println("December Birthstone is Turquoise"); 
        }
        
      
        else{
            System.out.println("No such month like  " + monthNumber);
        }
    }
}