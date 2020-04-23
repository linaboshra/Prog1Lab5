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
 * This program runs the Book class.
 * 
 * @author Lina Boshra
 */

public class Question3 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        
        Book count = new Book();
        
        Book firstBook = new Book("Volume I", "Lina Boshra", "9781234567897", "2020");
        count.addBook();
        
        Book secondBook = new Book("Volume II", "Lina Boshra", "4471872529106", "2020");
        count.addBook();
        
        Book thirdBook = new Book("First Volume", "Lina Boshra", "9781234567897", "2020");
        count.addBook();
        
        //////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("First book created: '" + firstBook + "'");
        firstBook.printTitle();
        firstBook.printAuthor();
        firstBook.printISBN();
        firstBook.printYearOfPublishing();
        firstBook.printPublisher();
        System.out.println("");
        
        System.out.println("Second book created: '" + secondBook + "'");
        secondBook.printTitle();
        secondBook.printAuthor();
        secondBook.printISBN();
        secondBook.printYearOfPublishing();
        secondBook.printPublisher();
        System.out.println("");
        
        System.out.println("Third book created: '" + thirdBook + "'");
        thirdBook.printTitle();
        thirdBook.printAuthor();
        thirdBook.printISBN();
        thirdBook.printYearOfPublishing();
        thirdBook.printPublisher();
        System.out.println("");
        
        System.out.println("Amount of books created: " + count.getAmountOfBooks());
        System.out.println("");
        
        //////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("Are the first and second books equal? " + firstBook.equalsISBN(secondBook));
        System.out.println("Are the first and third books equal? " + firstBook.equalsISBN(thirdBook));
        System.out.println("Are the second and third books equal? " + secondBook.equalsISBN(thirdBook));
        System.out.println("");
        
        System.out.println("Do the first and second books have the same publisher? " + firstBook.equalsPublisher(secondBook));
        System.out.println("Do the first and third books have the same publisher? " + firstBook.equalsPublisher(thirdBook));
        System.out.println("Do the second and third books have the same publisher? " + secondBook.equalsPublisher(thirdBook));

    }
    
}
