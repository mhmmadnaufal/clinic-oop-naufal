/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author Hype
 */
public class DataChecker {

    // Cek Nama tidak boleh kosong atau hanya spasi
    public static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    // Cek umur harus lebih dari 0 dan masuk akal)
    public static boolean isValidAge(int age) {
        return age > 0 && age <= 90;
    }

    // Format tanggal dalam bentuk "DD-MM-YYYY"
    public static boolean isValidDate(String date) {
        return date.matches("\\d{2}-\\d{2}-\\d{4}");
    }
}
