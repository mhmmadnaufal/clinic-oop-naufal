/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author Hype
 */
public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String date;

    // Constructor
    public Appointment(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    // Getters & Setters
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Print appointment details (Rapi & Aman)
    public void printAppointmentDetails() {
        System.out.println("\n===== Appointment Details =====");
        System.out.println("Doctor: " + (doctor != null ? doctor.getName() + " (" + doctor.getSpecialization() + ")" : "Data not available"));
        System.out.println("Patient: " + (patient != null ? patient.getName() + ", Age: " + patient.getAge() : "Data not available"));
        System.out.println("Diagnosis: [Protected Data]");
        System.out.println("Appointment Date: " + date);
        System.out.println("==============================");
    }
}
