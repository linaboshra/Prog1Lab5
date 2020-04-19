/*
 * Copyright (C) 2020 Lina Boshra
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Prog1Lab5;

import java.util.Scanner;

/**
 * This program computes the greatest common divisor of two integers.
 * 
 * @author Lina Boshra
 */

public class Question2 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int gcd = 0;
        
        System.out.println("Enter an integer");
        
        while (!input.hasNextInt()){
            System.out.println("Invalid input, please enter an integer");
            input.nextLine();
        }
        
        int int1 = input.nextInt();
        
        System.out.println("Enter another integer");
        
        while (!input.hasNextInt()){
            System.out.println("Invalid input, please enter an integer");
            input.nextLine();
        }
        
        int int2 = input.nextInt();
        
        for (int i = 1; i <= int1 && i <= int2; i++) { //Goes through all the numbers between int1 and int2
            if(int1%i==0 && int2%i==0){ //Any number that is a divisor of these two numbers gets assigened to gcd
               gcd = i; //At the end of the iteration, the last number that gets assigend to gcd is the greatest common divisor
            }   
        }
        
        System.out.println("The greatest common divisor is " + gcd);
    }
}