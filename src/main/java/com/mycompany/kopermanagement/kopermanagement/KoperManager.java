/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kopermanagement.kopermanagement;

/**
 *
 * @author Slimbook 14 R5
 */
import Entities.Koper;
import java.util.ArrayList;
import java.util.Scanner;

public class KoperManager {
    private final ArrayList<Koper> daftarKoper;

    public KoperManager() {
        daftarKoper = new ArrayList<>();
    }

    // Menambahkan koper baru
    public void tambahKoper(String kode, String merk, double harga) {
        Koper koperBaru = new Koper(kode, merk, harga);
        daftarKoper.add(koperBaru);
        System.out.println("Koper berhasil ditambahkan!");
    }

    // Menampilkan semua koper
    public void tampilkanDaftarKoper() {
        System.out.println("Daftar Koper:");
        for (Koper koper : daftarKoper) {
            koper.tampilkanInfo();
            System.out.println("--------------------");
        }
    }

    // Mengupdate koper berdasarkan kode koper
    public void updateKoper(String kode) {
        Scanner scanner = new Scanner(System.in);
        for (Koper koper : daftarKoper) {
            if (koper.getKodeKoper().equals(kode)) {
                System.out.println("Masukkan Merk Koper Baru: ");
                String merkBaru = scanner.next();
                System.out.println("Masukkan Harga Koper Baru: ");
                double hargaBaru = scanner.nextDouble();

                koper.setMerk(merkBaru);
                koper.setHarga(hargaBaru);

                System.out.println("Koper berhasil diupdate!");
                return;
            }
        }
        System.out.println("Koper dengan kode " + kode + " tidak ditemukan.");
    }

    // Menghapus koper berdasarkan kode koper
    public void hapusKoper(String kode) {
        for (Koper koper : daftarKoper) {
            if (koper.getKodeKoper().equals(kode)) {
                daftarKoper.remove(koper);
                System.out.println("Koper berhasil dihapus!");
                return;
            }
        }
        System.out.println("Koper dengan kode " + kode + " tidak ditemukan.");
    }

    // Menu utama untuk menampilkan opsi kepada pengguna
    public void menuUtama() {
        try (Scanner scanner = new Scanner(System.in)) {
            int pilihan;
            
            do {
                System.out.println("\n=== Sistem Manajemen Penjualan Koper ===");
                System.out.println("1. Tambah Koper");
                System.out.println("2. Lihat Daftar Koper");
                System.out.println("3. Update Koper");
                System.out.println("4. Hapus Koper");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = scanner.nextInt();
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Masukkan Kode Koper: ");
                        String kode = scanner.next();
                        System.out.print("Masukkan Merk Koper: ");
                        String merk = scanner.next();
                        System.out.print("Masukkan Harga Koper: ");
                        double harga = scanner.nextDouble();
                        tambahKoper(kode, merk, harga);
                    }
                    case 2 -> tampilkanDaftarKoper();
                    case 3 -> {
                        System.out.print("Masukkan Kode Koper yang akan diupdate: ");
                        String kode = scanner.next();
                        updateKoper(kode);
                    }
                    case 4 -> {
                        System.out.print("Masukkan Kode Koper yang akan dihapus: ");
                        String kode = scanner.next();
                        hapusKoper(kode);
                    }
                    case 5 -> System.out.println("Terima kasih!");
                    default -> System.out.println("Pilihan tidak valid.");
                }
            } while (pilihan != 5);
        }
    }
}