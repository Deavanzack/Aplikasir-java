/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author 62821
 */
public class Minuman extends Kategori_Barang implements Expirable{
    private Date tglKadaluarsa;
    private String status;

    public Minuman(int id, String nama, int harga, int jumlah,Date tglKadaluarsa, String status) {
        super(id, nama, harga, jumlah);
        this.tglKadaluarsa = tglKadaluarsa;
        this.status = status;
    }

    public Date getTglKadaluarsa() {
        return tglKadaluarsa;
    }
    
    public String getStatus() {
        return status;
    }
    
    @Override
    public void Expired() {
        LocalDate hariIni = LocalDate.now();
        LocalDate kadaluarsa = tglKadaluarsa.toLocalDate();

        if (hariIni.isAfter(kadaluarsa)) {
            this.status = "Kadaluarsa";
        } else {
            this.status = "Belum";
        }
    }
    
    public void insertMinuman() throws SQLException{
        Database db = new Database();
        String sql = "INSERT INTO `minuman` (`id`, `nama`, `harga`, `jumlah`, `kadaluarsa`, `status`) VALUES ('"+this.getId()+"', '"+this.getNama()+"', '"+this.getHarga()+"', '"+this.getJumlah()+"', '"+this.getTglKadaluarsa()+"', '"+this.getStatus()+"')";
        db.query(sql);
    }
}
