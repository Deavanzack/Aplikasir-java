/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static Classes.Database.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author fadillah
 */
public class transaksi {
    private int id;
    private String namaBarang;
    private int jumlah;
    private String tipe;

    public transaksi(int id, String nama, int jumlah, String tipe) {
        this.id = id;
        this.jumlah = jumlah;
        this.tipe = tipe;
        this.namaBarang = nama;
    }

    public int getId() {
        return id;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getTipe() {
        return tipe;
    }
    
     public void insertTransaksi() throws SQLException{
        Database db = new Database();
        String sql = "INSERT INTO `transaksi` (`id`, `namaBarang`, `tipe`, `jumlah`) VALUES ('"+this.getId()+"', '"+this.getNamaBarang()+"', '"+this.getTipe()+"', '"+this.getJumlah()+"')";
        db.query(sql);
    }
     
    public boolean authenticatebarang(String nama, String tipe) throws SQLException {
        Database db = new Database();
        try {
            if (tipe == "mainan"){
                String sql = "SELECT nama FROM mainan WHERE nama = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, nama);
                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    String dbnama = rs.getString("nama");
                    return nama.equals(dbnama);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(null, "barang tersebut tidak ada di database mainan");
                    return false;
                }
            } else if (tipe == "makanan"){
                String sql = "SELECT nama FROM makanan WHERE nama = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, nama);
                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    String dbnama = rs.getString("nama");
                    return nama.equals(dbnama);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(null, "barang tersebut tidak ada di database makanan");
                    return false;
                }
            } else if (tipe == "minuman"){
                String sql = "SELECT nama FROM minuman WHERE nama = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, nama);
                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    String dbnama = rs.getString("nama");
                    return nama.equals(dbnama);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(null, "barang tersebut tidak ada di database minuman");
                    return false;
                }
            }
        } catch (Exception e) {
             e.printStackTrace();
             return false;
        }
        return false;
    }
}
