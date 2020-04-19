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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This program reads a file containing a list of names and scores. The program 
 * identifies and outputs the names with highest and lowest score, the total 
 * amount of grades processed, and the average score of all processed.
 * 
 * @author Lina Boshra
 */

public class Question1 {
    
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    
    public static void main(String[] args) throws FileNotFoundException {
        
        File inFile = new File("C:\\Users\\Lina's PC\\Desktop/grades.txt");
        
        Scanner scF = new Scanner(inFile);
        
        int count = 0, total = 0, max = 0, min = 2147483647;
        String nameHighest = "", surnameHighest = "";
        String nameLowest = "", surnameLowest = "";
        
        while(scF.hasNext()){
            
            String name = scF.next();
            String surname = scF.next();
            int grade = scF.nextInt();
            
            if (grade > max) {
                max = grade;
                nameHighest = name;
                surnameHighest = surname;
            } 
            if (grade < min){
              min = grade;
              nameLowest = name;
              surnameLowest = surname;
            }
            
            total += grade;
            count ++;
        }
        
        System.out.println("Highest score: " + nameHighest + " " + surnameHighest + " with a score of " + max);
        System.out.println("Lowest score: " + nameLowest + " " + surnameLowest + " with a score of " + min);
        System.out.println("Total amount of grades processed: " + count);
        System.out.println("Average score: " + ((double)total/count));
    }
    
}

/* Lane Olsen 98
 * Dean Oliver 76
 * Sara Rosario 58
 * Kaylen Ponce 64
 * Julia Curtis 80
 * Rory Hart 86
 * Brad Klein 92
 * Alicia Mcgrath 100
 * Octavio Rivers 60
 * Nasir Wall 56
 */