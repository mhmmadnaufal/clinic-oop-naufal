/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided;

/**
 *
 * @author Hype
 */
public class DriverLB {
    public static void main(String argrs[]){
        LibraryBook lb = new LibraryBook();
        lb.setTitle("Petualangan Ramzi");
        lb.setAuthor("julio");
        lb.setIsBorrowed(true);
         
        System.out.println("Title: " + lb.getTitle());
        System.out.println("Author: " + lb.getAuthor());
        System.out.println("Is Borrowed: " + lb.getStatus());
        
        
    }
}