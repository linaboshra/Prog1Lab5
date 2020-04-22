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

/**
 * This program runs the TVSet class.
 * 
 * @author Lina Boshra
 */

public class Question56 {
    
    public static void main(String[] args){
    
        TVSet firstTVSet =  new TVSet();
        firstTVSet.setBrand("Baird");
        firstTVSet.setPrice(50);
        
        TVSet secondTVSet = new TVSet();
        secondTVSet.setBrand("Phillips");
        secondTVSet.setPrice(75);
        
        TVSet thirdTVSet = new TVSet();
        thirdTVSet.setBrand("Baird");
        thirdTVSet.setPrice(60);
        
        //////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("First TV set created: '" + firstTVSet + "' brand");
        System.out.println("Price: " + firstTVSet.getPrice() + "$");
        System.out.println("");
        
        System.out.println("Second TV set created: '" + secondTVSet + "' brand");
        System.out.println("Price: " + secondTVSet.getPrice() + "$");
        System.out.println("");
        
        System.out.println("Third TV set created: '" + thirdTVSet + "' brand");
        System.out.println("Price: " + thirdTVSet.getPrice() + "$");
        System.out.println("");
        
        //////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("Are the first and second TV sets from the same brand? " + firstTVSet.equals(secondTVSet));
        System.out.println("Are the first and third TV sets from the same brand? " + firstTVSet.equals(thirdTVSet));
        System.out.println("Are the second and third TV sets from the same brand? " + secondTVSet.equals(thirdTVSet));
   }
    
}
