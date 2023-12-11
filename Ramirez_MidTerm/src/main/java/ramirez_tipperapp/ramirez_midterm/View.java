/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramirez_tipperapp.ramirez_midterm;
import java.util.Scanner;
/**
 * Angel Ramirez-Rivera IT DEV-110 MIDTERM
 * @author angelramirez-rivera
 */

public class View {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int exit = 0;
        int nextNum = 0;
        int avg = 0;
    
    public void Directions(){
        System.out.println("Please enter your grade earned below as well enter the amount of scores entered ");
    }
    
    public void inputNumber(){
        System.out.print("Enter your score or zero to exit: ");
        nextNum = input.nextInt();
    } 
    
    public void numberSum(){
     do{ 
         inputNumber();
         sum=sum+nextNum;
         counter++;
         avg = (sum/counter);
         System.out.println("The number of scores entered " +counter);
         System.out.println("Your average grade is: "+avg);
         System.out.println("The sum of score = " +sum);
     }while(nextNum != exit); 
    }
    
}