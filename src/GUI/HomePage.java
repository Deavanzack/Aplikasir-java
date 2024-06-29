/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Classes.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 62821
 */
public class HomePage extends javax.swing.JFrame {
    DefaultTableModel modelTabelMainan;
    DefaultTableModel modelTabelMinuman;
    DefaultTableModel modelTabelMakanan;
    DefaultTableModel modelTabelTransaksi;
    static Connection conn;
            
    public HomePage() {
        initComponents();
        
        String [] judul_mainan = {"id","nama", "harga","jumlah","bahan"};
        modelTabelMainan = new DefaultTableModel(judul_mainan,0);
        tabelMainan.setModel(modelTabelMainan);
        
        String [] judul_minuman = {"id","nama", "harga", "jumlah", "kadaluarsa", "status"};
        modelTabelMinuman = new DefaultTableModel(judul_minuman,0);
        tabelMinuman.setModel(modelTabelMinuman);
        
        String [] judul_makanan = {"id","nama", "harga", "jumlah", "kadaluarsa", "status"};
        modelTabelMakanan = new DefaultTableModel(judul_makanan,0);
        tabelMakanan.setModel(modelTabelMakanan);
        
        String [] judul_transaksi = {"id","namaBarang","jumlah","tipe"};
        modelTabelTransaksi = new DefaultTableModel(judul_transaksi,0);
        tabelTransaksi.setModel(modelTabelTransaksi);
        
        loadDataMainan();
        loadDataMinuman();
        loadDataMakanan();
        loadDataTransaksi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipeBarangGroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        radiomainan = new javax.swing.JRadioButton();
        radiomakanan = new javax.swing.JRadioButton();
        radiominuman = new javax.swing.JRadioButton();
        inputjumlah = new javax.swing.JSpinner();
        inputbarang = new javax.swing.JTextField();
        tomboljual = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        tombolRefresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputMainanButton = new javax.swing.JButton();
        buttonEditMainan = new javax.swing.JButton();
        deleteButtonMainan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMainan = new javax.swing.JTable();
        refreshButtonMainan = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelMinuman = new javax.swing.JTable();
        tambahminuman = new javax.swing.JButton();
        buttonEditMinuman = new javax.swing.JButton();
        deleteButtonMinuman = new javax.swing.JButton();
        refreshButtonMinuman = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tambahmakanan = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        buttonEditMakanan = new javax.swing.JButton();
        deleteButtonMakanan = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelMakanan = new javax.swing.JTable();
        refreshButtonMakanan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(617, 346));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Transaksi");

        jLabel4.setText("Nama Barang");

        jLabel5.setText("Tipe");

        jLabel6.setText("Jumlah");

        tipeBarangGroup.add(radiomainan);
        radiomainan.setText("Mainan");

        tipeBarangGroup.add(radiomakanan);
        radiomakanan.setText("Makanan");

        tipeBarangGroup.add(radiominuman);
        radiominuman.setText("Minuman");

        inputbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputbarangActionPerformed(evt);
            }
        });

        tomboljual.setText("Jual");
        tomboljual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomboljualActionPerformed(evt);
            }
        });

        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama Barang", "Jumlah", "Tipe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelTransaksi);

        tombolRefresh.setText("Refresh");
        tombolRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radiomakanan)
                                    .addComponent(radiomainan)
                                    .addComponent(radiominuman)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(28, 28, 28)
                                .addComponent(inputbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tomboljual)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tombolRefresh))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inputjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2)))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 68, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(inputbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radiomainan)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radiomakanan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radiominuman)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tomboljual)
                            .addComponent(tombolRefresh)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transaksi", jPanel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Mainan");

        inputMainanButton.setText("Tambah");
        inputMainanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMainanButtonActionPerformed(evt);
            }
        });

        buttonEditMainan.setText("Edit");
        buttonEditMainan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditMainanActionPerformed(evt);
            }
        });

        deleteButtonMainan.setText("Delete");
        deleteButtonMainan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonMainanActionPerformed(evt);
            }
        });

        tabelMainan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Harga", "Jumlah", "Bahan"
            }
        ));
        tabelMainan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMainanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMainan);

        refreshButtonMainan.setText("Refresh");
        refreshButtonMainan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonMainanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButtonMainan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refreshButtonMainan)
                            .addComponent(inputMainanButton)
                            .addComponent(buttonEditMainan))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(inputMainanButton)
                        .addGap(18, 18, 18)
                        .addComponent(buttonEditMainan)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButtonMainan)
                        .addGap(18, 18, 18)
                        .addComponent(refreshButtonMainan))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Mainan", jPanel3);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Data Minuman");

        tabelMinuman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Harga", "Jumlah", "Tgl Kadaluarsa"
            }
        ));
        jScrollPane2.setViewportView(tabelMinuman);

        tambahminuman.setText("Tambah");
        tambahminuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahminumanActionPerformed(evt);
            }
        });

        buttonEditMinuman.setText("Edit");
        buttonEditMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditMinumanActionPerformed(evt);
            }
        });

        deleteButtonMinuman.setText("Delete");
        deleteButtonMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonMinumanActionPerformed(evt);
            }
        });

        refreshButtonMinuman.setText("Refresh");
        refreshButtonMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonMinumanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tambahminuman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonEditMinuman, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(deleteButtonMinuman, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(refreshButtonMinuman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonEditMinuman, deleteButtonMinuman, tambahminuman});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tambahminuman)
                        .addGap(18, 18, 18)
                        .addComponent(buttonEditMinuman)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButtonMinuman)
                        .addGap(18, 18, 18)
                        .addComponent(refreshButtonMinuman))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 94, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonEditMinuman, deleteButtonMinuman, tambahminuman});

        jTabbedPane1.addTab("Data Minuman", jPanel4);

        tambahmakanan.setText("Tambah");
        tambahmakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahmakananActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Data Makanan");

        buttonEditMakanan.setText("Edit");
        buttonEditMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditMakananActionPerformed(evt);
            }
        });

        deleteButtonMakanan.setText("Delete");
        deleteButtonMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonMakananActionPerformed(evt);
            }
        });

        tabelMakanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Harga", "Jumlah", "Tgl Kadaluarsa"
            }
        ));
        jScrollPane6.setViewportView(tabelMakanan);

        refreshButtonMakanan.setText("Refresh");
        refreshButtonMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonMakananActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tambahmakanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonEditMakanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButtonMakanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refreshButtonMakanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tambahmakanan)
                        .addGap(18, 18, 18)
                        .addComponent(buttonEditMakanan)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButtonMakanan)
                        .addGap(18, 18, 18)
                        .addComponent(refreshButtonMakanan))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 94, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Makanan", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void loadDataMainan(){
        int row = tabelMainan.getRowCount();
        for(int i = 0; i<row; i++){
            modelTabelMainan.removeRow(0);
        }
        try{
            Database db = new Database();
            String sql = "select * from mainan";
            ResultSet rs = db.getData(sql);
            while(rs.next()){
                String data[] = {rs.getString("id"),rs.getString("nama"),rs.getString("harga"),rs.getString("jumlah"),rs.getString("bahan")};
                modelTabelMainan.addRow(data);
            }
        }
        catch(SQLException ex){
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void loadDataMinuman() {
       int row = tabelMinuman.getRowCount();
        for(int i = 0; i<row; i++){
            modelTabelMinuman.removeRow(0);
        }
        try{
            Database db = new Database();
            String sql = "select * from minuman";
            ResultSet rs = db.getData(sql);
            while(rs.next()){
                String data[] = {rs.getString("id"),rs.getString("nama"),rs.getString("harga"),rs.getString("jumlah"),rs.getString("kadaluarsa"),rs.getString("status")};
                modelTabelMinuman.addRow(data);
            }
        }
        catch(SQLException ex){
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     private void loadDataMakanan() {
       int row = tabelMakanan.getRowCount();
        for(int i = 0; i<row; i++){
            modelTabelMakanan.removeRow(0);
        }
        try{
            Database db = new Database();
            String sql = "select * from makanan";
            ResultSet rs = db.getData(sql);
            while(rs.next()){
                String data[] = {rs.getString("id"),rs.getString("nama"),rs.getString("harga"),rs.getString("jumlah"),rs.getString("kadaluarsa"),rs.getString("status")};
                modelTabelMakanan.addRow(data);
            }
        }
        catch(SQLException ex){
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     private void loadDataTransaksi() {
       int row = tabelTransaksi.getRowCount();
        for(int i = 0; i<row; i++){
            modelTabelTransaksi.removeRow(0);
        }
        try{
            Database db = new Database();
            String sql = "select * from transaksi";
            ResultSet rs = db.getData(sql);
            while(rs.next()){
                String data[] = {rs.getString("id"),rs.getString("namaBarang"),rs.getString("jumlah"),rs.getString("tipe")};
                modelTabelTransaksi.addRow(data);
            }
        }
        catch(SQLException ex){
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    private void inputMainanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMainanButtonActionPerformed
        InputMainan dialInputMainan = new InputMainan(this,true);
        dialInputMainan.setVisible(true);
        loadDataMainan();
    }//GEN-LAST:event_inputMainanButtonActionPerformed

    private void deleteButtonMainanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonMainanActionPerformed
        try {
            int selectedRow = tabelMainan.getSelectedRow();

            // Periksa apakah ada baris yang dipilih
            if (selectedRow == -1) {
                throw new Exception("Pilih data yang ingin dihapus!");
            }

            // Ambil nilai sebagai String dan konversi ke Integer
            String idStr = (String) tabelMainan.getValueAt(selectedRow, 0);
            int id = Integer.parseInt(idStr);

            // Tampilkan dialog penghapusan
            DeleteMainan dialDeleteMainan = new DeleteMainan(HomePage.this, true, id);
            dialDeleteMainan.setVisible(true);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID tidak valid. Harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonMainanActionPerformed

    private void tabelMainanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMainanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelMainanMouseClicked

    private void tambahminumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahminumanActionPerformed
        InputMinuman im = new InputMinuman(this,true);
        im.setVisible(true);
        loadDataMinuman();
    }//GEN-LAST:event_tambahminumanActionPerformed

    private void tambahmakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahmakananActionPerformed
        InputMakanan im = new InputMakanan(this,true);
        im.setVisible(true);
        loadDataMakanan();
    }//GEN-LAST:event_tambahmakananActionPerformed

    private void refreshButtonMainanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonMainanActionPerformed
        loadDataMainan();
    }//GEN-LAST:event_refreshButtonMainanActionPerformed

    private void refreshButtonMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonMinumanActionPerformed
        loadDataMinuman();// TODO add your handling code here:
    }//GEN-LAST:event_refreshButtonMinumanActionPerformed

    private void refreshButtonMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonMakananActionPerformed
        loadDataMakanan();// TODO add your handling code here:
    }//GEN-LAST:event_refreshButtonMakananActionPerformed

    private void deleteButtonMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonMinumanActionPerformed
        try {
            int selectedRow = tabelMinuman.getSelectedRow();

            // Periksa apakah ada baris yang dipilih
            if (selectedRow == -1) {
                throw new Exception("Pilih data yang ingin dihapus!");
            }

            // Ambil nilai sebagai String dan konversi ke Integer
            String idStr = (String) tabelMinuman.getValueAt(selectedRow, 0);
            int id = Integer.parseInt(idStr);

            // Tampilkan dialog penghapusan
            DeleteMinuman dialDeleteMainan = new DeleteMinuman(HomePage.this, true, id);
            dialDeleteMainan.setVisible(true);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID tidak valid. Harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonMinumanActionPerformed

    private void deleteButtonMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonMakananActionPerformed
        try {
            int selectedRow = tabelMakanan.getSelectedRow();

            // Periksa apakah ada baris yang dipilih
            if (selectedRow == -1) {
                throw new Exception("Pilih data yang ingin dihapus!");
            }

            // Ambil nilai sebagai String dan konversi ke Integer
            String idStr = (String) tabelMakanan.getValueAt(selectedRow, 0);
            int id = Integer.parseInt(idStr);

            // Tampilkan dialog penghapusan
            DeleteMakanan dialDeleteMakanan = new DeleteMakanan(HomePage.this, true, id);
            dialDeleteMakanan.setVisible(true);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID tidak valid. Harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonMakananActionPerformed

    private void buttonEditMainanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditMainanActionPerformed
        try {
            int selectedRow = tabelMainan.getSelectedRow();

            // Periksa apakah ada baris yang dipilih
            if (selectedRow == -1) {
                throw new Exception("Pilih data yang ingin diedit!");
            }

            // Ambil nilai sebagai String dan konversi ke Integer
            String idStr = (String) tabelMainan.getValueAt(selectedRow, 0);
            int id = Integer.parseInt(idStr);

            // Tampilkan dialog penghapusan
            UpdateMainan dialUpdateMainan = new UpdateMainan(HomePage.this, true, id);
            dialUpdateMainan.setVisible(true);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID tidak valid. Harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditMainanActionPerformed

    private void buttonEditMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditMakananActionPerformed
        try {
            int selectedRow = tabelMakanan.getSelectedRow();

            // Periksa apakah ada baris yang dipilih
            if (selectedRow == -1) {
                throw new Exception("Pilih data yang ingin diedit!");
            }

            // Ambil nilai sebagai String dan konversi ke Integer
            String idStr = (String) tabelMakanan.getValueAt(selectedRow, 0);
            int id = Integer.parseInt(idStr);

            // Tampilkan dialog penghapusan
            UpdateMakanan dialUpdateMakanan = new UpdateMakanan(HomePage.this, true, id);
            dialUpdateMakanan.setVisible(true);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID tidak valid. Harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditMakananActionPerformed

    private void buttonEditMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditMinumanActionPerformed
        try {
            int selectedRow = tabelMinuman.getSelectedRow();

            // Periksa apakah ada baris yang dipilih
            if (selectedRow == -1) {
                throw new Exception("Pilih data yang ingin diedit!");
            }

            // Ambil nilai sebagai String dan konversi ke Integer
            String idStr = (String) tabelMinuman.getValueAt(selectedRow, 0);
            int id = Integer.parseInt(idStr);

            // Tampilkan dialog penghapusan
            UpdateMinuman dialUpdateMinuman = new UpdateMinuman(HomePage.this, true, id);
            dialUpdateMinuman.setVisible(true);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID tidak valid. Harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditMinumanActionPerformed

    private void tomboljualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomboljualActionPerformed
        try {
            String inputnama = inputbarang.getText();
            String inputtipe = "";
            int jumlah = (int) inputjumlah.getValue();
            int id = 0;
            if (radiomakanan.isSelected()){
                inputtipe = "makanan";
            } else if (radiominuman.isSelected()){
                inputtipe = "minuman";
            } else if (radiomainan.isSelected()){
                inputtipe = "mainan";
            }

            Database db = new Database();
            String sql = "select * from transaksi";
            String sqlmakanan = "select * from makanan";
            String sqlminuman = "select * from minuman";
            String sqlmainan = "select * from mainan";
            
            int jumlahmakanan = 0;
            int idmakanan = 0;

            int jumlahminuman = 0;
            int idminuman = 0;

            int jumlahmainan = 0;
            int idmainan = 0;

            ResultSet rs = db.getData(sql);
            while(rs.next()){
                id = rs.getInt("id");
            }

            id = id + 1;
            transaksi p = new transaksi(id,inputnama,jumlah,inputtipe);
            
            if (inputtipe.equals("makanan")) {
                rs = db.getData(sqlmakanan);
                while (rs.next()) {
                    if (rs.getString("nama").equals(inputnama) && rs.getString("status").equals("Belum")) {
                        jumlahmakanan = rs.getInt("jumlah");
                        idmakanan = rs.getInt("id");
                        if (p.authenticatebarang(inputnama, inputtipe)) {
                            if (jumlah < jumlahmakanan) {
                                p.insertTransaksi();
                                int sisamakanan = rs.getInt("jumlah") - jumlah;
                                db.updateMakanan(idmakanan, rs.getString("nama"), rs.getInt("harga"), sisamakanan, rs.getDate("kadaluarsa"), rs.getString("status"));
                                javax.swing.JOptionPane.showMessageDialog(null, "Data Berhasil Diinputkan");
                            } else {
                                javax.swing.JOptionPane.showMessageDialog(null, "Jumlah melebihi stok");
                            }
                        }
                        break;
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(null, "Barang tidak ada atau produk kadaluarsa");
                    }
                }
            } else if (inputtipe.equals("minuman")) {
                rs = db.getData(sqlminuman);
                while (rs.next()) {
                    if (rs.getString("nama").equals(inputnama) && rs.getString("status").equals("Belum")) {
                        jumlahminuman = rs.getInt("jumlah");
                        idminuman = rs.getInt("id");
                        if (p.authenticatebarang(inputnama, inputtipe)) {
                            if (jumlah < jumlahminuman) {
                                p.insertTransaksi();
                                int sisaminuman = rs.getInt("jumlah") - jumlah;
                                db.updateMinuman(idminuman, rs.getString("nama"), rs.getInt("harga"), sisaminuman, rs.getDate("kadaluarsa"), rs.getString("status"));
                                javax.swing.JOptionPane.showMessageDialog(null, "Data Berhasil Diinputkan");
                            } else {
                                javax.swing.JOptionPane.showMessageDialog(null, "Jumlah melebihi stok");
                            }
                        }
                        break;
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(null, "Barang tidak ada atau produk kadaluarsa");
                    }
                }
            } else if (inputtipe.equals("mainan")) {
                rs = db.getData(sqlmainan);
                while (rs.next()) {
                    if (rs.getString("nama").equals(inputnama)) {
                        jumlahmainan = rs.getInt("jumlah");
                        idmainan = rs.getInt("id");
                        if (p.authenticatebarang(inputnama, inputtipe)) {
                            if (jumlah < jumlahmainan) {
                                p.insertTransaksi();
                                int sisamainan = rs.getInt("jumlah") - jumlah;
                                db.updateMainan(idmainan, inputnama, rs.getInt("harga"), sisamainan, rs.getString("bahan"));
                                javax.swing.JOptionPane.showMessageDialog(null, "Data Berhasil Diinputkan");
                            } else {
                                javax.swing.JOptionPane.showMessageDialog(null, "Jumlah melebihi stok");
                            }
                        }
                        break;
                    }
                }
            }
        } catch (SQLException ex ) {
            Logger.getLogger(InputMainan.class.getName()).log(Level.SEVERE,null, ex);
        }
    }//GEN-LAST:event_tomboljualActionPerformed

    private void inputbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputbarangActionPerformed

    private void tombolRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolRefreshActionPerformed
        loadDataTransaksi();
    }//GEN-LAST:event_tombolRefreshActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditMainan;
    private javax.swing.JButton buttonEditMakanan;
    private javax.swing.JButton buttonEditMinuman;
    private javax.swing.JButton deleteButtonMainan;
    private javax.swing.JButton deleteButtonMakanan;
    private javax.swing.JButton deleteButtonMinuman;
    private javax.swing.JButton inputMainanButton;
    private javax.swing.JTextField inputbarang;
    private javax.swing.JSpinner inputjumlah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton radiomainan;
    private javax.swing.JRadioButton radiomakanan;
    private javax.swing.JRadioButton radiominuman;
    private javax.swing.JButton refreshButtonMainan;
    private javax.swing.JButton refreshButtonMakanan;
    private javax.swing.JButton refreshButtonMinuman;
    private javax.swing.JTable tabelMainan;
    private javax.swing.JTable tabelMakanan;
    private javax.swing.JTable tabelMinuman;
    private javax.swing.JTable tabelTransaksi;
    private javax.swing.JButton tambahmakanan;
    private javax.swing.JButton tambahminuman;
    private javax.swing.ButtonGroup tipeBarangGroup;
    private javax.swing.JButton tombolRefresh;
    private javax.swing.JButton tomboljual;
    // End of variables declaration//GEN-END:variables
 
}
