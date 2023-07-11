/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;
public class Number_GameJava{
    public static void main(String args[]) {
        int trials=3;
        Scanner sc=new Scanner(System.in);
        boolean incorrect=false;
        System.out.println("Welcome to the Number Game. \n You have 3 attempts to guess the correct number");
        System.out.println("Enter the range of number you want to guess in(starting from 1-).");
        int n=sc.nextInt();
        int rand=(int) (Math.random() * n) +1;
        
        while(trials>0) {
            System.out.println("Enter any number between 1-" +n +"\n");
            int guess= sc.nextInt();
            if(guess<0 || guess>n){
                System.out.println("ERROR!! Number should be in range");
                break;
            }
            if(guess==rand) {
                System.out.println("Congratulations!! \n \n You have guessed the right answer");
                incorrect=true;
                break;
            } else if(guess>rand) {
                System.out.println("Oops!! Your guessed number is bigger. Try again");
                trials--;
            } else {
                System.out.println("Oops!! Your guessed number is smaller. Try again");
                trials--;
            }
            incorrect=true;
        }
        trials--;
        if(incorrect==false) {
            System.out.println("YOU LOST. PLAY AGAIN");
        }
    }
}
