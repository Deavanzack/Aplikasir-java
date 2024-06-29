/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author 62821
 */
public abstract class Kategori_Barang {
    private int id;
    private String nama;
    private int harga;
    private int jumlah;

    public Kategori_Barang(int id, String nama, int harga, int jumlah) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }  
}
