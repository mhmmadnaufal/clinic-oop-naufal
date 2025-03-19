/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided;

/**
 *
 * @author Hype
 */
public class LibraryBook {
    private String title;
    private String author;
    private boolean isBorrowed;
    String getTitle;
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setIsBorrowed(boolean bool ){
        this.isBorrowed = bool;
    }
    
    // untuk pemecahan masalah privat
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public boolean getStatus(){
        return isBorrowed;
    }
    
    public static void main(String argrs[]){
        LibraryBook lb = new LibraryBook();
        lb.setTitle("Petualangan Ramzi");
        lb.setAuthor("julio");
        lb.setIsBorrowed(true);
        System.out.println("Title: " + lb.title);
        System.out.println("Author: " + lb.author);
        System.out.println("Is Borrowed: " + lb.isBorrowed);
    }
    
}

