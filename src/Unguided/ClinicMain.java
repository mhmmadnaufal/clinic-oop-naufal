/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author Hype
 */
import Unguided.entities.*;

public class ClinicMain {
    public static void main(String[] args) {
        // Membuat Dokter
        Doctor doctor1 = new Doctor("D001", "Dr. Aulia", "Cardiology");
        Doctor doctor2 = new Doctor("D002", "Dr. Bagas", "Neurology");

        // Membuat Pasien
        Patient patient1 = new Patient("P001", "Leo", 25, "Hipertensi");
        Patient patient2 = new Patient("P002", "Siti", 30, "Migrain");

        // Membuat Janji Temu
        Appointment appointment1 = new Appointment(doctor1, patient1, "10-04-2025");
        Appointment appointment2 = new Appointment(doctor2, patient2, "12-04-2025");

        // Mencatat Diagnosis dalam Statistik
        DiagnosisCounter.addDiagnosis(patient1.getDiagnosis());
        DiagnosisCounter.addDiagnosis(patient2.getDiagnosis());

        // Cetak Informasi
        doctor1.printDoctorInfo();
        doctor2.printDoctorInfo();

        patient1.printPatientInfo();
        patient2.printPatientInfo();

        appointment1.printAppointmentDetails();
        appointment2.printAppointmentDetails();

        // Cetak Statistik Diagnosis
        DiagnosisCounter.printDiagnosisStats();
    }
}

