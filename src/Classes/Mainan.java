/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.*;

/**
 *
 * @author 62821
 */
public class Mainan extends Kategori_Barang{
    private String bahan;

    public Mainan( int id, String nama, int harga, int jumlah,String bahan) {
        super(id, nama, harga, jumlah);
        this.bahan = bahan;
    }

    public String getBahan() {
        return bahan;
    }
    
    public void insertMainan() throws SQLException{
        Database db = new Database();
        String sql = "INSERT INTO `mainan` (`id`, `nama`, `harga`, `jumlah`, `bahan`) VALUES ('"+this.getId()+"', '"+this.getNama()+"', '"+this.getHarga()+"', '"+this.getJumlah()+"', '"+this.getBahan()+"')";
        db.query(sql);
    }
}
