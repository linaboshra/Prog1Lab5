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
 * This class encapsulates the concept of a course grade.
 * 
 * @author Lina Boshra
 */

public class CourseGrade {
    
    //////////////////// ATTRIBUTES ////////////////////
    private String courseName;
    private String letterGrade;
    
    /////////////////// CONSTRUCTOR ////////////////////
    public CourseGrade(){
        setCourseName(courseName);
        setLetterGrade(letterGrade);
    }
    
    //////////////////// MUTATORS /////////////////////
    void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
    void setLetterGrade(String letterGrade){
        this.letterGrade = letterGrade;
    }
    
    /////////////////// ACCESSORS /////////////////////
    public String getCourseName(){
        return courseName;
    }
    
    public String getLetterGrade(){
        return letterGrade;
    }
    
    ///////////////// TOSTRING METHOD /////////////////
    public String toString(){
        return(letterGrade);
    }
    
    ////////////////// EQUALS METHOD /////////////////
    public boolean equals(CourseGrade other){
        return letterGrade.equals(other.letterGrade);
    }
}

