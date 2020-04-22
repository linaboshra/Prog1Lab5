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
 * This class encapsulates the concept of a TV set.
 * 
 * @author Lina Boshra
 */

public class TVSet {
    
    ///////////// ATTRIBUTES /////////////
    private String brand;
    private int price;
    
    //////////// CONSTRUCTOR /////////////
    public TVSet(){
        setBrand(brand);
        setPrice(price);
    }
    
    ///////////// MUTATORS //////////////
    void setBrand(String brand){
        this.brand = brand;
    }
    
    void setPrice(int price){
        this.price = price;
    }
    
    //////////// ACCESSORS //////////////
    public String getBrand(){
        return brand;
    }
    
    public int getPrice(){
        return price;
    }
    
    ////////// TOSTRING METHOD //////////
    public String toString(){
        return(brand);
    }
    
    /////////// EQUALS METHOD ///////////
    public boolean equals(TVSet other){
        return brand.equals(other.brand);
    }
}
