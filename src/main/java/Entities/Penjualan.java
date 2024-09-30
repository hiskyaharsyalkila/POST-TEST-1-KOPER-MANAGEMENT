/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Slimbook 14 R5
 */
public class Penjualan {
    private final String kodePenjualan;
    private final String tanggal;
    private static int totalPenjualan = 0;

    public Penjualan(String kodePenjualan, String tanggal) {
        this.kodePenjualan = kodePenjualan;
        this.tanggal = tanggal;
        totalPenjualan++;
    }

    public String getKodePenjualan() {
        return kodePenjualan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public static int getTotalPenjualan() {
        return totalPenjualan;
    }
    
    public void tampilkanPenjualan() {
        System.out.println("Kode Penjualan: " + kodePenjualan);
        System.out.println("Tanggal: " + tanggal);
    }
}

