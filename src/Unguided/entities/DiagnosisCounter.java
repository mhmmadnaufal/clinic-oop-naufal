/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author Hype
 */
import java.util.HashMap;
import java.util.Map;

public class DiagnosisCounter {
    // Menyimpan jumlah kasus untuk setiap diagnosis
    private static Map<String, Integer> diagnosisMap = new HashMap<>();

    // Menambahkan diagnosis ke dalam daftar statistik
    public static void addDiagnosis(String diagnosis) {
        int currentCount = diagnosisMap.getOrDefault(diagnosis, 0);
        diagnosisMap.put(diagnosis, currentCount + 1);
    }

    // Menampilkan statistik diagnosis yang sudah tercatat
    public static void printDiagnosisStats() {
        System.out.println("\n===== Statistik Diagnosis =====");

        if (diagnosisMap.isEmpty()) {
            System.out.println("Belum ada data diagnosis.");
            return;
        }

        // Menampilkan setiap diagnosis dan jumlah kasusnya
        diagnosisMap.forEach((diagnosis, count) -> 
            System.out.println(diagnosis + ": " + count + " kasus")
        );
    }
}