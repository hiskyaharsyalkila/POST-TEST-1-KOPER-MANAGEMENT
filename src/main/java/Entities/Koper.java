/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Slimbook 14 R5
 */
public class Koper {
    private final String kodeKoper;
    private String merk;
    private double harga;
    
    public Koper(String kodeKoper, String merk, double harga) {
        this.kodeKoper = kodeKoper;
        this.merk = merk;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getKodeKoper() {
        return kodeKoper;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Kode Koper: " + kodeKoper);
        System.out.println("Merk: " + merk);
        System.out.println("Harga: " + harga);
    }
}