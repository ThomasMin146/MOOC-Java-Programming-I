/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class Book {
    private String name;
    private int pages;
    private int pubyear;
    
    public Book(String name,int pages, int pubyear){
        this.name = name;
        this.pages = pages;
        this.pubyear = pubyear;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public int getPubYear(){
        return this.pubyear;
    }
        
    public String toString(){
        return this.name+", "+this.pages+" pages, "+this.pubyear;
    }
}
