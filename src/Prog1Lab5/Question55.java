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
 * This program runs the Team class.
 * 
 * @author Lina Boshra
 */

public class Question55 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        
        Team firstTeam = new Team();
        firstTeam.setName("Red");
        
        Team secondTeam = new Team();
        secondTeam.setName("Blue");
        
        Team thirdTeam = new Team();
        thirdTeam.setName("Blue");
        
        //////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("Firt team created: '" + firstTeam + "'");
        
        System.out.println("Second team created: '" + secondTeam + "'");
        
        System.out.println("Third team created: '" + thirdTeam + "'");
        System.out.println("");
        
        //////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("Are the first and second teams equal? " + firstTeam.equals(secondTeam));
        System.out.println("Are the first and third teams equal? " + firstTeam.equals(thirdTeam));
        System.out.println("Are the second and third teams equal? " + secondTeam.equals(thirdTeam));
    }
    
}
