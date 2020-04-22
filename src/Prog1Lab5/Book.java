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
 * This class encapsulates the concept of a book.
 * 
 * @author Lina Boshra
 */

public class Book {
    
    private String title;
    private String author;
    private String ISBN;
    private String yearOfPublishing;
    private static String publisher = "Vanier";
    private int amountOfBooks = 0;
    
    public Book(String title, String author, String ISBN, String yearOfPublishing){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearOfPublishing = yearOfPublishing;
    }
    
    public Book(){}
            
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getISBN(){
        return ISBN;
    }
    
    public String getYearOfPublishing(){
        return yearOfPublishing;
    }
    
    public String getPublisher(){
        return publisher;
    }
    
    public int getAmountOfBooks(){
        return amountOfBooks;
    }
    
    public void printTitle(){
        System.out.println("Title: " + title);
    }
    
    public void printAuthor(){
        System.out.println("Author: " + author);
    }
    
    public void printISBN(){
        System.out.println("ISBN: " + ISBN);
    }
    
    public void printYearOfPublishing(){
        System.out.println("Year of publishing: " + yearOfPublishing);
    }
    
    public void printPublisher(){
        System.out.println("Publisher: " + publisher);
    }
    
     public void addBook(){
        amountOfBooks ++;
    }
    
    public String toString(){
        return(title);
    }
    
    public boolean equalsISBN(Book other){
        return ISBN.equals(other.ISBN);
    }
    
    public boolean equalsPublisher(Book other){
        return publisher.equals(other.publisher);
    }
}