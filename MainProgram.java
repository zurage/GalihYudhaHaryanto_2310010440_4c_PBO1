package GalihYudhaHaryanto_2310010440_4c_PBO1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    //KRITERIA 13: ARRAY (ArrayList)
    static ArrayList<Hewan> daftarHewan = new ArrayList<>();
    
    //KRITERIA 12: IO SEDERHANA (Scanner)
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
    //KRITERIA 12: IO SEDERHANA (Output)
    System.out.println("=== SISTEM PETSHOP ===");
    System.out.println("Dibuat oleh: Galih Yudha");
    
    //KRITERIA 11: PERULANGAN (do-while)
    int pilihan = 0; // Inisialisasi nilai default
    do {
        tampilkanMenu();
        
        try {
            //[KRITERIA 12: IO SEDERHANA (Input)
            pilihan = input.nextInt();
            input.nextLine(); // Clear buffer
            
            //KRITERIA 10: SELEKSI (switch-case)
            switch(pilihan) {
                case 1:
                    tambahHewan();
                    break;
                case 2:
                    tampilkanHewan();
                    break;
                case 3:
                    System.out.println("Keluar dari sistem...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan masukkan 1-3.");
            }
        } catch(Exception e) {
            //KRITERIA 14: ERROR HANDLING
            System.out.println("Error: Input harus berupa angka (1-3)!");
            input.nextLine(); //Clear invalid input
            pilihan = 0; //Reset nilai pilihan
        }
    } while(pilihan != 3);
}
    static void tampilkanMenu() {
        System.out.println("\n1. Tambah Hewan");
        System.out.println("2. Lihat Hewan");
        System.out.println("3. Keluar");
        System.out.print("Pilih: ");
    }
    
    static void tambahHewan() {
        //KRITERIA 2: OBJECT (Pembuatan object)
        System.out.print("Jenis (1=Kucing/2=Anjing): ");
        int jenis = input.nextInt();
        input.nextLine();
        
        System.out.print("Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Umur: ");
        int umur = input.nextInt();
        input.nextLine();
        
        if(jenis == 1) {
            System.out.print("Ras: ");
            String ras = input.nextLine();
            daftarHewan.add(new Kucing(nama, umur, ras)); //KRITERIA 2: OBJECT
        } else {
            System.out.print("Jenis Anjing: ");
            String jenisAnjing = input.nextLine();
            daftarHewan.add(new Anjing(nama, umur, jenisAnjing));
        }
    }
    
    static void tampilkanHewan() {
        //KRITERIA 11: PERULANGAN (for-each)
        for(Hewan h : daftarHewan) {
            System.out.println(
                h.getNama() + " (" + h.jenis + ") - " + 
                h.getUmur() + " tahun | Suara: " + h.suara()
            );
        }
    }
}