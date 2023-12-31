/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and openthe template in the editor.
 */

package AplikasiKeuanganPribadi;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.out;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.jdesktop.swingx.JXDatePicker;
/**
 *
 * @author Axioo Class Program
 */
public class Utama extends javax.swing.JFrame {
    int x=0; 
    private String pattern;
    private Object date;
    private Object tanggal;
    private Date tanggalDate;
    
    
    
    /**
     * Creates new form Utama
     */
    public Utama() {
        initComponents();
        //menengahkan posisi aplikasi agar ketika di run berada di posisi tengah
         Dimension screenSize = 
         Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = this.getSize();
            if (frameSize.height > screenSize.height) {
                frameSize.height = screenSize.height;
            }
            if (frameSize.width > screenSize.width) {
                frameSize.width = screenSize.width;
            }
            this.setLocation(
                    (screenSize.width - frameSize.width) / 2, 
                    (screenSize.height - frameSize.height) / 2); 
        
         jx_date.setFormats("dd-MM-yyyy"); // memngubah format jxdatepicker
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_no = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jx_date = new org.jdesktop.swingx.JXDatePicker();
        tf_keterangan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_data = new javax.swing.JTable();
        tf_uangmasuk = new javax.swing.JTextField();
        tf_uangkeluar = new javax.swing.JTextField();
        tf_saldoakhir = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bt_print = new javax.swing.JButton();
        bt_simpan = new javax.swing.JButton();
        bt_hapus = new javax.swing.JButton();
        bt_clear = new javax.swing.JButton();
        bt_keluar = new javax.swing.JButton();
        bt_save = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INPUT DATA KEUANGAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(189, 189, 189))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel2.setText("No.");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel3.setText("Tanggal");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel4.setText("Keterangan");

        tf_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_noActionPerformed(evt);
            }
        });
        tf_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_noKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel5.setText("Uang Masuk");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel6.setText("Uang Keluar");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel7.setText("Saldo Akhir");

        jx_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jx_dateActionPerformed(evt);
            }
        });

        tb_data.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tb_data.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        tb_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Tanggal", "Uang Masuk", "Uang Keluar", "Saldo Akhir", "Keterangan"
            }
        ));
        jScrollPane1.setViewportView(tb_data);
        if (tb_data.getColumnModel().getColumnCount() > 0) {
            tb_data.getColumnModel().getColumn(0).setMinWidth(30);
            tb_data.getColumnModel().getColumn(0).setMaxWidth(30);
            tb_data.getColumnModel().getColumn(1).setMinWidth(100);
            tb_data.getColumnModel().getColumn(1).setMaxWidth(100);
            tb_data.getColumnModel().getColumn(2).setResizable(false);
            tb_data.getColumnModel().getColumn(3).setResizable(false);
            tb_data.getColumnModel().getColumn(4).setResizable(false);
            tb_data.getColumnModel().getColumn(5).setResizable(false);
        }

        tf_uangmasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_uangmasukActionPerformed(evt);
            }
        });
        tf_uangmasuk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_uangmasukKeyTyped(evt);
            }
        });

        tf_uangkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_uangkeluarActionPerformed(evt);
            }
        });
        tf_uangkeluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_uangkeluarKeyTyped(evt);
            }
        });

        tf_saldoakhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_saldoakhirActionPerformed(evt);
            }
        });
        tf_saldoakhir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_saldoakhirKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Tabel Data Keuangan");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        jLabel9.setText("Rp.");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        jLabel10.setText("Rp.");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        jLabel11.setText("Rp.");

        bt_print.setBackground(new java.awt.Color(255, 255, 255));
        bt_print.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        bt_print.setText("Cetak");
        bt_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jx_date, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(tf_keterangan)
                    .addComponent(tf_no, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_uangmasuk)
                    .addComponent(tf_uangkeluar)
                    .addComponent(tf_saldoakhir))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_print, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tf_uangmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jx_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_uangkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(tf_keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_saldoakhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(bt_print, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bt_simpan.setBackground(new java.awt.Color(255, 255, 255));
        bt_simpan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_simpan.setText("Tambah");
        bt_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_simpanActionPerformed(evt);
            }
        });

        bt_hapus.setBackground(new java.awt.Color(255, 255, 255));
        bt_hapus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_hapus.setText("Hapus");
        bt_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hapusActionPerformed(evt);
            }
        });

        bt_clear.setBackground(new java.awt.Color(255, 255, 255));
        bt_clear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_clear.setText("Clear");
        bt_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clearActionPerformed(evt);
            }
        });

        bt_keluar.setBackground(new java.awt.Color(255, 255, 255));
        bt_keluar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bt_keluar.setText("Keluar");
        bt_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_keluarActionPerformed(evt);
            }
        });

        bt_save.setBackground(new java.awt.Color(255, 255, 255));
        bt_save.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        bt_save.setText("Export");
        bt_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_saveActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton1.setText("Import");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(bt_save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_keluar)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_simpan)
                    .addComponent(bt_hapus)
                    .addComponent(bt_clear)
                    .addComponent(bt_keluar)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simpanActionPerformed

        Date tanggalDate = jx_date.getDate();  //Mengganti Format Tanggal jxdatepicker
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedTanggal = dateFormat.format(tanggalDate);;
        
        tb_data.setValueAt(tf_no.getText(),x,0); //menginput ke jtable
        tb_data.setValueAt(formattedTanggal,x,1);
        tb_data.setValueAt(tf_keterangan.getText(),x,5);
        tb_data.setValueAt(tf_uangmasuk.getText(),x,2);
        tb_data.setValueAt(tf_uangkeluar.getText(),x,3);
        tb_data.setValueAt(tf_saldoakhir.getText(),x,4);
        
        x=x+1;
        
        tf_no.setText(""); //Clear setelah di klik buttonnnya
        jx_date.setDate(null);
        tf_keterangan.setText("");
        tf_uangmasuk.setText("");
        tf_uangkeluar.setText("");
        tf_saldoakhir.setText("");
    }//GEN-LAST:event_bt_simpanActionPerformed

    private void tf_uangkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_uangkeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_uangkeluarActionPerformed

    private void tf_saldoakhirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_saldoakhirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_saldoakhirActionPerformed

    private void bt_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clearActionPerformed
        tf_no.setText("");
        jx_date.setDate(null);
        tf_keterangan.setText("");
        tf_uangmasuk.setText("");
        tf_uangkeluar.setText("");
        tf_saldoakhir.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_clearActionPerformed

    private void bt_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_keluarActionPerformed
         System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_keluarActionPerformed

    private void bt_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hapusActionPerformed
        // TODO add your handling code here:
        tb_data.setValueAt("", tb_data.getSelectedRow(),0);
        tb_data.setValueAt("", tb_data.getSelectedRow(),1);
        tb_data.setValueAt("", tb_data.getSelectedRow(),2);
        tb_data.setValueAt("", tb_data.getSelectedRow(),3);
        tb_data.setValueAt("", tb_data.getSelectedRow(),4);
        tb_data.setValueAt("", tb_data.getSelectedRow(),5);
        
        tf_no.setText("");
        jx_date.setDate(null);
        tf_keterangan.setText("");
        tf_uangmasuk.setText("");
        tf_uangkeluar.setText("");
        tf_saldoakhir.setText("");
    }//GEN-LAST:event_bt_hapusActionPerformed

    private void tf_uangmasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_uangmasukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_uangmasukActionPerformed

    private void tf_uangmasukKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_uangmasukKeyTyped

         char c = evt.getKeyChar(); //untuk memberi peringatan (Memunculkan Message Box)
        if (! ((Character.isDigit(c)||
                (c == KeyEvent.VK_BACK_SPACE)||
                (c == KeyEvent.VK_DELETE))
                )) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Masukkan hanya angka");
            evt.consume();
        }// TODO add your handling code here:
    }//GEN-LAST:event_tf_uangmasukKeyTyped

    private void tf_uangkeluarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_uangkeluarKeyTyped

         char c = evt.getKeyChar();
        if (! ((Character.isDigit(c)||
                (c == KeyEvent.VK_BACK_SPACE)||
                (c == KeyEvent.VK_DELETE))
                )) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Masukkan hanya angka");
            evt.consume();
        }// TODO add your handling code here:
    }//GEN-LAST:event_tf_uangkeluarKeyTyped

    private void tf_saldoakhirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_saldoakhirKeyTyped

         char c = evt.getKeyChar();
        if (! ((Character.isDigit(c)||
                (c == KeyEvent.VK_BACK_SPACE)||
                (c == KeyEvent.VK_DELETE))
                )) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Masukkan hanya angka");
            evt.consume();
        }// TODO add your handling code here:
    }//GEN-LAST:event_tf_saldoakhirKeyTyped

    private void tf_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_noKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (! ((Character.isDigit(c)||
                (c == KeyEvent.VK_BACK_SPACE)||
                (c == KeyEvent.VK_DELETE))
                )) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Masukkan hanya nomor");
            evt.consume();
        }
    }//GEN-LAST:event_tf_noKeyTyped

    private void tf_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_noActionPerformed

    private void bt_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_printActionPerformed
        try {
            // Mendapatkan model tabel
            TableModel model = tb_data.getModel();

            // Membuat pesan format untuk judul pencetakan
            MessageFormat header = new MessageFormat("Data Tabel");

            // Membuat pesan format untuk nomor halaman
            MessageFormat footer = new MessageFormat("Halaman {0,number,integer}");

            // Mencetak tabel
            boolean complete = tb_data.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);

            // Pengecekan status pencetakan
            if (complete) {
                System.out.println("Pencetakan selesai.");
            } else {
                System.out.println("Pencetakan dibatalkan.");
            }
        } catch (PrinterException pe) {
            System.err.println("Gagal mencetak: " + pe.getMessage());
        }
    
        
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_printActionPerformed

    private void bt_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_saveActionPerformed
        
        try {
            // Tentukan nama file
            String fileName = "DataKeuangan.txt"; 

            // Dapatkan model tabel
            TableModel model = tb_data.getModel(); 

            // Buat BufferedWriter untuk menulis ke file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                // Tulis header kolom
                for (int i = 0; i < model.getColumnCount(); i++) {
                    writer.write(model.getColumnName(i) + "\t");
                }
                writer.newLine();

                // Tulis data
                for (int i = 0; i < model.getRowCount(); i++) {
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        writer.write(model.getValueAt(i, j).toString() + "\t");
                    }
                    writer.newLine();
                    JOptionPane.showMessageDialog(null, "Berhasil disimpan dalam file"); //memunuclkan message box ketika berhasil di simpan
                out.close();
                }
            }
                
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bt_saveActionPerformed

    private void jx_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jx_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jx_dateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         try {
            // Buka dialog pemilihan file
            javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
            fileChooser.showOpenDialog(this);

            // Dapatkan path file yang dipilih
            String filePath = fileChooser.getSelectedFile().getPath();

            // Membaca data dari file teks
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            DefaultTableModel model = (DefaultTableModel) tb_data.getModel();
            model.setRowCount(0); // Menghapus semua baris yang ada sebelumnya

            String line;
            while ((line = br.readLine()) != null) {
                // Pisahkan data dalam baris file teks (misalnya, menggunakan tab)
                String[] data = line.split("\t");

                // Tambahkan data ke dalam model tabel
                model.addRow(data);
            }

            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_clear;
    private javax.swing.JButton bt_hapus;
    private javax.swing.JButton bt_keluar;
    private javax.swing.JButton bt_print;
    private javax.swing.JButton bt_save;
    private javax.swing.JButton bt_simpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker jx_date;
    private javax.swing.JTable tb_data;
    private javax.swing.JTextField tf_keterangan;
    private javax.swing.JTextField tf_no;
    private javax.swing.JTextField tf_saldoakhir;
    private javax.swing.JTextField tf_uangkeluar;
    private javax.swing.JTextField tf_uangmasuk;
    // End of variables declaration//GEN-END:variables
}
