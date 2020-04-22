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
 * This class encapsulates the concept of a team.
 * 
 * @author Lina Boshra
 */

public class Team {
    
    ///////////// ATTRIBUTE //////////////
    private String name;
    
    //////////// CONSTRUCTOR /////////////
    public Team(){
        setName(name);
    }
    
    ////////////// MUTATOR //////////////
    void setName(String name){
        this.name = name;
    }
    
    ///////////// ACCESSOR //////////////
    public String getName(){
        return name;
    }
    
    ////////// TOSTRING METHOD //////////
    public String toString(){
        return(name);
    }
    
    /////////// EQUALS METHOD ///////////
    public boolean equals(Team other){
        return name.equals(other.name);
    }
}
