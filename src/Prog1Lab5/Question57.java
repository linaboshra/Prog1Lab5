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
 * This program runs the CourseGrade class.
 * 
 * @author Lina Boshra
 */ 
public class Question57 {
    
    public static void main(String[] args){
    
        CourseGrade firstCourseGrade =  new CourseGrade();
        firstCourseGrade.setCourseName("Astronomy");
        firstCourseGrade.setLetterGrade("A+");
        
        CourseGrade secondCourseGrade = new CourseGrade();
        secondCourseGrade.setCourseName("Biology");
        secondCourseGrade.setLetterGrade("B");
        
        CourseGrade thirdCourseGrade = new CourseGrade();
        thirdCourseGrade.setCourseName("Calculus");
        thirdCourseGrade.setLetterGrade("C-");
        
        //////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("First course grade created: " + firstCourseGrade);
        System.out.println("Course name: " + firstCourseGrade.getCourseName());
        System.out.println("");
        
        System.out.println("Second course grade created: " + secondCourseGrade);
        System.out.println("Course name: " + secondCourseGrade.getCourseName());
        System.out.println("");
        
        System.out.println("Third course grade created: " + thirdCourseGrade);
        System.out.println("Course name: " + thirdCourseGrade.getCourseName());
        System.out.println("");
        
        //////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("Are the first and second course grades equal? " + firstCourseGrade.equals(secondCourseGrade));
        System.out.println("Are the first and third course grades equal? " + firstCourseGrade.equals(thirdCourseGrade));
        System.out.println("Are the second and third course grades equal? " + secondCourseGrade.equals(thirdCourseGrade));
   }
    
}
