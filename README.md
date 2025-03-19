# <h1 align="center">Clinic Management System - Java OOP</h1>
<p align="center">Muhammad Naufal</p>

## Pendahuluan

### 1.1 Latar Belakang
NightFall Clinic mengalami kekacauan dalam pengelolaan data pasien. Kesalahan pencatatan dan kurangnya sistem keamanan menyebabkan data pasien sering tertukar. Oleh karena itu, sistem manajemen klinik berbasis Java ini dibuat untuk meningkatkan pengelolaan informasi dokter, pasien, janji temu, dan diagnosis penyakit pasien dengan prinsip OOP.

### 1.2 Tujuan
- Menerapkan konsep Encapsulation untuk melindungi data sensitif seperti diagnosis pasien.
- Mengorganisir kode dalam Packages agar lebih terstruktur dan mudah dikembangkan.
- Menghubungkan semua class yang ada yaitu Doctor, Patient, Appointment, datachecker, dan diagnosis counter yang mempunyai tujuan agar informasi yang ada di nighfall clinic tidak berantakan dan aman, karena akan disusun di package package dan ditingkatkan sistem keamanannya.
- Menyediakan fitur tambahan seperti validasi data (DataChecker) dan pencatatan jumlah diagnosis (DiagnosisCounter) untuk meningkatkan akurasi informasi terhadap pasien.
- Jadi, program ini digunakan untuk mengelola dokter, pasien, dan janji temu, serta mencatat statistik diagnosis pasien.

## Dasar Teori
### Encapsulation
Encapsulation adalah konsep OOP yang menyembunyikan detail implementasi dari pengguna kelas dengan mendeklarasikan atribut sebagai private dan menyediakan metode getter dan setter untuk mengontrol aksesnya. Seperti di Nightfall clinic, Atribut pasien  (diagnosis) disembunyikan atau di private dan hanya bisa diakses melalui metode getter dan setter. Tujuannya agar akses data lebih aman, sehingga mencegah modifikasi langsung yang bisa menyebabkan inkonsistensi data. Dalam pemrograman berorientasi objek, kebutuhan enkapsulasi muncul karena adanya proses sharing data antar method. Dengan menggunakan enkapsulasi, maka keamanan dari data dan method yang ada didalamnya akan terjaga[1]. 

## Project Structure
![Image](https://github.com/user-attachments/assets/581e0778-ced9-4b26-a0f9-cc4fd9472655)

package dalam Nightfall Clinic dipisah untuk class dan program mainnya. untuk package Unguided.entities akan menyimpan kelas-kelas inti seperti Doctor, Patient, Appointment, DataChecker, dan DiagnosisCounter, sedangkan pacakages Unguided untuk menyimpan kelas ClinicMain yang menjalankan program utama. Tujuan pemisahan ini adalah agar strukturnya lebih rapi dan mudah dikelola. Kalau semua kelas ditempatkan dalam satu package, kode bisa jadi berantakan, serta sulit dicari. Dengan cara ini, semua bagian yang berhubungan dengan data klinik dikumpulkan dalam satu tempat (entities), sedangkan bagian yang bertugas menjalankan program utama tetap terpisah. 

## Clinic Management System
Clinic Management System merupakan sebuah sistem untuk mengelola data dokter, pasien, dan janji temu di sebuah klinik menggunakan Java dengan konsep Object-Oriented Programming (OOP). Sistem ini dibuat agar pencatatan data lebih rapi, aman, dan terstruktur. Dalam sistem ini, ada beberapa fitur utama. Doctor menyimpan informasi dokter seperti nama dan spesialisasi. Patient menyimpan data pasien, termasuk diagnosisnya yang dienkapsulasi agar tidak bisa diakses langsung dari luar kelas. Appointment berfungsi untuk mencatat janji temu antara dokter dan pasien dengan tanggal tertentu. Ada juga DiagnosisCounter yang mencatat statistik jumlah diagnosis yang pernah tercatat, dan DataChecker untuk memastikan data yang dimasukkan valid, seperti nama yang tidak boleh kosong atau format tanggal yang benar.

Agar lebih terstruktur, program ini dibagi dalam dua package utama. Package "Unguided.entities" berisi kelas-kelas yang mewakili entitas seperti Doctor, Patient, Appointment, DiagnosisCounter, dan DataChecker, sedangkan Package "Unguided" digunakan untuk kelas utama ClinicMain, yang menjalankan program dan menghubungkan semua komponen yang ada. Pemisahan ini dilakukan supaya kode lebih rapi dan mudah dikelola. 

## Features 
Sistem Nightfall Clinic terdiri dari beberapa fitur utama, yaitu:
1. Penyimpanan Data Dokter (Class Doctor)
2. Penyimpanan Data Pasien (Class Patient)
3. Pengelolaan Janji Temu (Class Appointment)
4. Pengecekan Validasi Data (Class DataChecker)
5. Pencatatan Statistik Diagnosis Penyakit (Class DiagnosisCounter)
6. Program Utama (ClinicMain.java)

## Class Relationship dalam sistem Nightfall Clinic
- Doctor ↔ Patient (Melalui Appointment)
Setiap dokter dapat memiliki banyak janji temu dengan pasien, dan setiap pasien dapat memiliki lebih dari satu janji temu dengan dokter. Class Appointment menjadi penghubung yang menyimpan informasi dokter, pasien, dan tanggal janji temu.
- ClinicMain → Doctor, Patient, Appointment
Class ClinicMain bertanggung jawab untuk membuat dan mengelola objek Doctor, Patient, dan Appointment. Program ClinicMain mengatur bagaimana data dokter, pasien, dan janji temu diproses.
- Appointment ↔ DataChecker
Sebelum menyimpan data janji temu, DataChecker digunakan untuk memvalidasi nama pasien, usia, dan format tanggal agar data yang masuk ke sistem valid
- Patient ↔ DiagnosisCounter
Setiap pasien memiliki diagnosis yang perlu dicatat dalam sistem. Class DiagnosisCounter menyimpan jumlah kasus dari setiap diagnosis yang pernah tercatat dalam sistem.

## Unguided (Program Main)

```java
package Unguided;

import Unguided.entities.*;

public class ClinicMain {
    public static void main(String[] args) {
        // Membuat objek dokter
        Doctor doctor1 = new Doctor("D001", "Dr. Aulia", "Cardiology");
        Doctor doctor2 = new Doctor("D002", "Dr. Bagas", "Neurology");

        // Membuat objek pasien
        Patient patient1 = new Patient("P001", "Leo", 25, "Hipertensi");
        Patient patient2 = new Patient("P002", "Siti", 30, "Migrain");

        // Membuat janji temu
        Appointment appointment1 = new Appointment(doctor1, patient1, "10-04-2025");
        Appointment appointment2 = new Appointment(doctor2, patient2, "12-04-2025");

        // Mencatat diagnosis dalam statistik
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
```
Interpretasi :
Program ClinicMain berfungsi sebagai code utama untuk menjalankan sistem manajemen klinik yang sudah dibuat di unguided.entities. Program dimulai dengan membuat dua objek Doctor, yaitu Dr. Aulia yang berspesialisasi dalam Cardiology, dan Dr. Bagas yang berspesialisasi dalam Neurology. Setelah itu, dibuat juga dua objek Patient, yaitu Leo yang berusia 25 tahun dengan diagnosis Hipertensi, serta Siti yang berusia 30 tahun dengan diagnosis Migrain. Selanjutnya, program membuat dua objek Appointment, yang merepresentasikan janji temu antara dokter dan pasien. Janji temu pertama adalah antara Dr. Aulia dan Leo pada tanggal 10-04-2025, sementara janji temu kedua adalah antara Dr. Bagas dan Siti pada 12-04-2025. Diagnosis dari masing-masing pasien kemudian dicatat dalam DiagnosisCounter, yang digunakan untuk menghitung jumlah diagnosis yang pernah tercatat dalam sistem. Setelah data selesai dibuat, program akan mencetak informasi masing-masing dokter dan pasien dengan memanggil metode printDoctorInfo() dan printPatientInfo(). Informasi janji temu juga ditampilkan menggunakan printAppointmentDetails(), tetapi untuk menjaga privasi, diagnosis pasien tidak akan ditampilkan secara langsung. Terakhir, program mencetak statistik diagnosis yang telah tercatat menggunakan printDiagnosisStats(), sehingga bisa diketahui berapa kali masing-masing jenis diagnosis muncul.

### Unguided Entities

#### Class Doctor
memiliki fungsi : 
1. Menyimpan dan mengelola informasi dokter. Setiap dokter memiliki ID dokter, nama dokter, dan spesialisas medis.
2. Memungkinkan pengambilan dan perubahan data dokter karena terdapat getter untuk mengambil data dokter dan setter untuk mengubah nama atau spesialisasi dokter. 
3. Memiliki metode printDoctorInfo() untuk menampilkan informasi dokter di terminal.

```java
package Unguided.entities;

public class Doctor {
    private String id;
    private String name;
    private String specialization;

    // Constructor
    public Doctor(String id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    // Getter & Setter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void printDoctorInfo() {
        System.out.println("Doctor ID: " + id + ", Name: " + name + ", Specialization: " + specialization);
    }
}
```
#### Class Patient
Memiliki fungsi :
- Menyimpan informasi pasien seperti ID, nama, usia, dan diagnosis penyakitnya.
- Diagnosis pasien bersifat sensitif, sehingga sistem hanya bisa mengakses melalui getter & setter. Tujuannya untuk menjaga keamanan data pasien
- Class patient memiliki metode printPatientInfo() untuk menampilkan data pasien.

```java
package Unguided.entities; 

public class Patient { 
    private String id; 
    private String name; 
    private int age; 
    private String diagnosis; 

    // Constructor untuk menginisialisasi objek Patient dengan ID, nama, usia, dan diagnosis
    public Patient(String id, String name, int age, String diagnosis) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Getter dan Setter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Method untuk mencetak informasi pasien
    public void printPatientInfo() {
        System.out.println("Patient ID: " + id + ", Name: " + name + ", Age: " + age + ", Diagnosis: " + diagnosis);
    }
}
```

#### Class Appointment
Memiliki fungsi :
- Menghubungkan dokter dan pasien dalam sebuah janji temu medis. 
- Menyimpan informasi tentang tanggal janji temu. Janji temu memiliki 3 informasi penting yaitu dokter yang akan menangani, pasien yang akan berobat dan tanggal janji temu.
- Diagnosis pasien disembunyikan saat mencetak detail janji temu untuk menjaga privasi pasien.
- Class Appointment memiliki metode printAppointmentDetails() yang digunakan untuk mencetak detail janji temu. 

```java
package Unguided.entities;

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

    // Getters dan Setters
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

    // method untuk menampilkan informasi appointment
    public void printAppointmentDetails() {
        System.out.println("\n===== Appointment Details =====");
        System.out.println("Doctor: " + (doctor != null ? doctor.getName() + " (" + doctor.getSpecialization() + ")" : "Data not available"));
        System.out.println("Patient: " + (patient != null ? patient.getName() + ", Age: " + patient.getAge() : "Data not available"));
        System.out.println("Diagnosis: [Protected Data]");
        System.out.println("Appointment Date: " + date);
        System.out.println("==============================");
    }
}
```
#### Class DataChecker
Fungsi Class DataChecker :
- Memeriksa apakah data yang dimasukkan ke dalam sistem valid atau tidak.
Terdapat tiga metode dalam kelas DataChecker:
1. isValidName(String name) fungsinya untuk mengecek apakah nama tidak kosong.
2. isValidAge(int age) fungsinya untuk mengecek apakah usia dalam rentang 1 - 90 tahun.
3. isValidDate(String date) fungsinya untuk Mengecek apakah tanggal sudah sesuai format DD-MM-YYYY.

```java
package Unguided.entities;

public class DataChecker {

    public static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public static boolean isValidAge(int age) {
        return age > 0 && age <= 90;
    }

    public static boolean isValidDate(String date) {
        return date.matches("\\d{2}-\\d{2}-\\d{4}"); // dalam format "DD-MM-YYYY"
    }
}
```

#### Class DiagnosisCounter
Memiliki Fungsi :
- Mencatat jumlah pasien berdasarkan diagnosis penyakit yang mereka derita.
- Setiap kali ada pasien baru dengan diagnosis tertentu, sistem akan menambahkan data diagnosis ke dalam daftar statistik.
- Jika diagnosis yang sama sudah ada, sistem akan menambah jumlah kasus diagnosis tersebut.
Terdapat dua metode dalam kelas ini:
1. addDiagnosis(String diagnosis) berfungsi Menambahkan diagnosis pasien ke dalam statistik.
2. printDiagnosisStats() berfungsi Menampilkan jumlah total kasus untuk setiap diagnosis yang tercatat.

```java
package Unguided.entities;

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
```

#### Interpretasi Output Unguided keseluruhan:
![Image](https://github.com/user-attachments/assets/e9426c86-9b8e-416a-9379-105cfbabd38c)

Program diatas menggunakan konsep OOP dengan membuat beberapa objek yang merepresentasikan dokter, pasien, dan janji temu. Dua dokter yang dibuat adalah Dr. Aulia, seorang spesialis kardiologi, dan Dr. Bagas, seorang spesialis neurologi. Sementara itu, terdapat dua pasien, yaitu Leo, seorang pria berusia 25 tahun yang didiagnosis dengan hipertensi, dan Siti, seorang wanita berusia 30 tahun dengan diagnosis migrain. Setelah objek dokter dan pasien dibuat, program kemudian mengatur dua janji temu. Janji temu pertama mempertemukan Dr. Aulia dengan Leo pada tanggal 10 April 2025, sedangkan janji temu kedua mempertemukan Dr. Bagas dengan Siti pada tanggal 12 April 2025. Saat menampilkan data, informasi dokter dan pasien ditampilkan dengan jelas, namun diagnosis pasien tidak dicantumkan langsung dalam detail janji temu untuk menjaga kerahasiaan data. Selain itu, program clinic oop juga mencatat statistik diagnosis yang muncul menggunakan DiagnosisCounter. Dari data yang dikumpulkan, terdapat satu kasus hipertensi dan satu kasus migrain. Hal ini menunjukkan bahwa program dapat mengelompokkan serta menghitung jumlah kemunculan masing-masing diagnosis dengan baik.  

## Kesimpulan
Sistem Nightfall Clinic dibuat dengan konsep Object-Oriented Programming (OOP)** menggunakan Java untuk mengelola data dokter, pasien, dan janji temu secara lebih rapi, aman, dan terstruktur. Dengan menerapkan Encapsulation, data sensitif seperti diagnosis pasien dilindungi agar tidak bisa diakses langsung. Struktur program dibagi ke dalam packages, yaitu Unguided.entities untuk menyimpan kelas inti dan Unguided untuk program utama. Sistem nightfall clinic juga memiliki fitur validasi data (DataChecker) dan pencatatan statistik diagnosis (DiagnosisCounter) agar data lebih akurat. Hasil implementasi menunjukkan bahwa sistem dapat mencatat informasi dokter, pasien, serta janji temu dengan baik, sekaligus menjaga privasi pasien dan menyediakan analisis sederhana terhadap tren diagnosis penyakit.

## Referensi
[1]  A. Jamal, A. Supriyanto, F. I. A. S., A. Utami, dan B. Mauludin, "Aplikasi Berorientasi Objek untuk Perhitungan Bagian Waris Berdasarkan Hukum Islam," Program Studi Teknik Informatika, Fakultas Sains & Teknologi, Universitas Al Azhar Indonesia, Jakarta, Indonesia.
