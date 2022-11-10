/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmobil;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author DhimasMulyadi
 */
public class Rental extends javax.swing.JPanel {

    /**
     * Creates new form Rental
     */
    public Rental() {
        initComponents();
        
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x,y);
        
        tampiltanggal();
        
        jeniskendaraan.disable();
        sewa.disable();
        biayasupir.disable();
        totalbayar.disable();
        kembalian.disable();
    }
    
    //method untuk tanggal hari ini
    public void tampiltanggal(){
       Date tgl = new Date();
        SimpleDateFormat aa = new SimpleDateFormat("dd-MM-yyyy");
        tanggal.setText(aa.format(tgl));
    }
    
    //method jumlah karakter
    public void jumlahkarakter(KeyEvent a){
        if (transaksi.getText().length()==8){
            a.consume();
            JOptionPane.showMessageDialog(null,
                    "Maksimal 4 Karakter",
                    "Peringatan", JOptionPane.WARNING_MESSAGE);
            
        }
    }
    
    //jumlah karakter sewa
    public void jumlahkaraktersewa(KeyEvent c){
        if (lamasewa.getText().length()==2){
            c.consume();
            JOptionPane.showMessageDialog(null,
                    "Maksimal 2 Karakter",
                    "Peringatan", JOptionPane.WARNING_MESSAGE);
            
        }
    }
    
    //method hanya angka
    public void FilterAngka(KeyEvent b){
        if(Character.isAlphabetic(b.getKeyChar())){
            b.consume();
            JOptionPane.showMessageDialog(null, 
                    "Masukan Hanya Angka",
                    "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }

        
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        transaksi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tanggal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nopol = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jeniskendaraan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sewa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lamasewa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        supir = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        biayasupir = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        totalbayar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        uangbayar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        kembalian = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setText("RENTAL MOBIL");

        jLabel2.setText("No Transaksi");

        transaksi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                transaksiKeyTyped(evt);
            }
        });

        jLabel3.setText("Tanggal");

        jLabel4.setText("No Polisi");

        nopol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "E6666AM", "E3333OV", "E2955OV" }));
        nopol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nopolActionPerformed(evt);
            }
        });

        jLabel5.setText("Jenis Kendaraan ");

        jLabel6.setText("Harga Sewa / Hari");

        jLabel7.setText("Lama Sewa");

        lamasewa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lamasewaKeyTyped(evt);
            }
        });

        jLabel8.setText("Pilihan Supir");

        supir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jasa supir", "Tidak ada jasa supir" }));
        supir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supirActionPerformed(evt);
            }
        });

        jLabel9.setText("Biaya Supir");

        biayasupir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biayasupirActionPerformed(evt);
            }
        });

        jLabel10.setText("Total Bayar");

        jLabel11.setText("Uang Bayar");

        uangbayar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                uangbayarFocusLost(evt);
            }
        });
        uangbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uangbayarActionPerformed(evt);
            }
        });
        uangbayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uangbayarKeyTyped(evt);
            }
        });

        jLabel12.setText("Kembalian");

        jButton1.setText("BARU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("HITUNG");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("KELUAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(jButton2))
                                            .addComponent(jeniskendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(supir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel10)
                                                            .addComponent(jLabel11)
                                                            .addComponent(jLabel12))
                                                        .addGap(46, 46, 46)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(totalbayar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(uangbayar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(kembalian, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(71, 71, 71)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addGap(53, 53, 53)
                                                        .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(55, 55, 55))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel6)
                                                            .addComponent(sewa, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(56, 56, 56)
                                                                .addComponent(jLabel7))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lamasewa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                                    .addComponent(transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(biayasupir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jeniskendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lamasewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(supir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(biayasupir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(totalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(uangbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null,
                "Apakah Yakin Akan Keluar?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            System.exit(0);
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        transaksi.setText("");
        jeniskendaraan.setText("");
        sewa.setText("");
        lamasewa.setText("");
        biayasupir.setText("");
        totalbayar.setText("");
        uangbayar.setText("");
        kembalian.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void transaksiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transaksiKeyTyped
        // TODO add your handling code here:
        jumlahkarakter(evt);
        FilterAngka(evt);
    }//GEN-LAST:event_transaksiKeyTyped

    private void nopolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nopolActionPerformed
        // TODO add your handling code here:
        
        if(nopol.getSelectedItem()=="E6666AM"){
            jeniskendaraan.setText("Mobil Pribadi");
            sewa.setText("350000");
       }else if(nopol.getSelectedItem()=="E3333OV"){
            jeniskendaraan.setText("Mobil Pick up");
              sewa.setText("500000");
       }else{
           jeniskendaraan.setText("Mobil Truck");
             sewa.setText("1000000");
       }
    }//GEN-LAST:event_nopolActionPerformed

    private void biayasupirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biayasupirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biayasupirActionPerformed

    private void supirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supirActionPerformed
        // TODO add your handling code here:
        if(supir.getSelectedItem()=="Jasa supir"){
            biayasupir.setText("100000");
        }else{
            biayasupir.setText("0");
        }
    }//GEN-LAST:event_supirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int hargasewa = Integer.parseInt(sewa.getText());
        int lama = Integer.parseInt(lamasewa.getText());
        int bisup = Integer.parseInt(biayasupir.getText());
        int tobar;
        
        tobar = ((hargasewa * lama)+bisup);
        totalbayar.setText(Integer.valueOf(tobar).toString());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void uangbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uangbayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uangbayarActionPerformed

    private void uangbayarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uangbayarFocusLost
        // TODO add your handling code here:
        int cektotal = Integer.parseInt(totalbayar.getText());
        int cekbayar = Integer.parseInt(uangbayar.getText());
        
        if(cekbayar < cektotal){
            JOptionPane.showMessageDialog(null, 
                    "Uang Bayar Kurang Dari Total Bayar",
                    "Peringatan", JOptionPane.WARNING_MESSAGE);
        }else{
            int hitungkembalian;
            hitungkembalian = cekbayar - cektotal;
            kembalian.setText(Integer.valueOf(hitungkembalian).toString());
        }
    }//GEN-LAST:event_uangbayarFocusLost

    private void lamasewaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lamasewaKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
        jumlahkaraktersewa(evt);
    }//GEN-LAST:event_lamasewaKeyTyped

    private void uangbayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uangbayarKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_uangbayarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField biayasupir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jeniskendaraan;
    private javax.swing.JTextField kembalian;
    private javax.swing.JTextField lamasewa;
    private javax.swing.JComboBox<String> nopol;
    private javax.swing.JTextField sewa;
    private javax.swing.JComboBox<String> supir;
    private javax.swing.JTextField tanggal;
    private javax.swing.JTextField totalbayar;
    private javax.swing.JTextField transaksi;
    private javax.swing.JTextField uangbayar;
    // End of variables declaration//GEN-END:variables
}
