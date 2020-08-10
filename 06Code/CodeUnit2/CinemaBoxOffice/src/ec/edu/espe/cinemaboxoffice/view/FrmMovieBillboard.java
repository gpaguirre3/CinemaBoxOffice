/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view;

import ec.edu.espe.cinemaboxoffice.controller.MovieRecord;
import ec.edu.espe.cinemaboxoffice.model.CinemaRoom;
import ec.edu.espe.cinemaboxoffice.model.MovieBillboard;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alisson Clavijo
 */
public class FrmMovieBillboard extends javax.swing.JFrame {

    /**
     * Creates new form FrmMovieBillboard
     */
    public FrmMovieBillboard() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMovieBillboard = new javax.swing.JPanel();
        lblMovieBillboard = new javax.swing.JLabel();
        lblBillboardDate = new javax.swing.JLabel();
        lblBillboardPrice = new javax.swing.JLabel();
        lblBillboardRoom = new javax.swing.JLabel();
        txfBillboardPoster = new java.awt.TextField();
        cbxBillboardRoom = new javax.swing.JComboBox<>();
        btnBilboradDiscard = new javax.swing.JButton();
        btnBillboardSave = new javax.swing.JButton();
        lblBillboardTitle = new javax.swing.JLabel();
        lblBillboardGender = new javax.swing.JLabel();
        lblBillboardPoster = new javax.swing.JLabel();
        lblBillboardAge = new javax.swing.JLabel();
        txtBillboardPrice = new java.awt.TextField();
        cbxAgeRestriction = new javax.swing.JComboBox<>();
        txfBillboardTitle = new java.awt.TextField();
        cbxBillboardGender = new javax.swing.JComboBox<>();
        lblBillboardDuration = new javax.swing.JLabel();
        cbxBillboardDay = new javax.swing.JComboBox<>();
        cbxBillboardMonth = new javax.swing.JComboBox<>();
        cbxBillboardYear = new javax.swing.JComboBox<>();
        spnDuration = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        btnBillboardExit = new javax.swing.JButton();
        cbxBillboardHour = new javax.swing.JComboBox<>();
        cbxBillboardMin = new javax.swing.JComboBox<>();
        lblBillboardDay = new javax.swing.JLabel();
        lblBillboardMonth = new javax.swing.JLabel();
        lblBillboardYear = new javax.swing.JLabel();
        lblBillboardHour = new javax.swing.JLabel();
        lblBillboardMin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaSinopsis = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movie Billboard");

        pnlMovieBillboard.setBackground(new java.awt.Color(0, 0, 51));

        lblMovieBillboard.setFont(new java.awt.Font("Comic Sans MS", 3, 21)); // NOI18N
        lblMovieBillboard.setForeground(new java.awt.Color(255, 255, 255));
        lblMovieBillboard.setText("Movie Billboard");

        lblBillboardDate.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblBillboardDate.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardDate.setText("Date:");

        lblBillboardPrice.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblBillboardPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardPrice.setText("Price:");

        lblBillboardRoom.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblBillboardRoom.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardRoom.setText("Room:");

        cbxBillboardRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        btnBilboradDiscard.setText("Discard");

        btnBillboardSave.setText("Save");
        btnBillboardSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBillboardSaveMouseClicked(evt);
            }
        });

        lblBillboardTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblBillboardTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardTitle.setText("Title:");

        lblBillboardGender.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblBillboardGender.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardGender.setText("Gender:");

        lblBillboardPoster.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblBillboardPoster.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardPoster.setText("Poster File Name:");

        lblBillboardAge.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblBillboardAge.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardAge.setText("Age Restriction:");

        cbxAgeRestriction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All public", "Over 12", "Over 18" }));

        cbxBillboardGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Science fiction", "Romance", "Comedy", "Fear", "Fantasy", "Action", "Horror" }));

        lblBillboardDuration.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblBillboardDuration.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardDuration.setText("Duration:");

        cbxBillboardDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        cbxBillboardMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        cbxBillboardYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025" }));
        cbxBillboardYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBillboardYearActionPerformed(evt);
            }
        });

        spnDuration.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/cinema logo.png"))); // NOI18N

        btnBillboardExit.setText("Exit");
        btnBillboardExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBillboardExitMouseClicked(evt);
            }
        });

        cbxBillboardHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

        cbxBillboardMin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "15", "30", "45" }));

        lblBillboardDay.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardDay.setText("day");

        lblBillboardMonth.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardMonth.setText("month");

        lblBillboardYear.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardYear.setText("year");

        lblBillboardHour.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardHour.setText("hour");

        lblBillboardMin.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardMin.setText("min");

        jLabel1.setText("min");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Synopsis");

        txaSinopsis.setColumns(20);
        txaSinopsis.setRows(5);
        jScrollPane1.setViewportView(txaSinopsis);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/titleIcon.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/seatIcon.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/priceIcon.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/ageIcon.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/genderIcon.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/calendarIcon.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/durationIcon.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/synopsisIcon.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/posterIcon.png"))); // NOI18N

        javax.swing.GroupLayout pnlMovieBillboardLayout = new javax.swing.GroupLayout(pnlMovieBillboard);
        pnlMovieBillboard.setLayout(pnlMovieBillboardLayout);
        pnlMovieBillboardLayout.setHorizontalGroup(
            pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(152, 152, 152)
                .addComponent(lblMovieBillboard, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMovieBillboardLayout.createSequentialGroup()
                                .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(3, 3, 3)))))
                .addGap(18, 18, 18)
                .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMovieBillboardLayout.createSequentialGroup()
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBillboardGender)
                            .addComponent(lblBillboardDate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                                .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                                        .addComponent(btnBilboradDiscard)
                                        .addGap(39, 39, 39)
                                        .addComponent(btnBillboardSave, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)
                                        .addComponent(btnBillboardExit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(284, 284, 284))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMovieBillboardLayout.createSequentialGroup()
                                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                                                .addComponent(lblBillboardPoster)
                                                .addGap(30, 30, 30)
                                                .addComponent(txfBillboardPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(61, 61, 61))))
                            .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(cbxBillboardDay, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBillboardDay)
                                .addGap(18, 18, 18)
                                .addComponent(cbxBillboardMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblBillboardMonth)
                                .addGap(6, 6, 6)
                                .addComponent(cbxBillboardYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblBillboardYear)
                                .addGap(18, 18, 18)
                                .addComponent(cbxBillboardHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblBillboardHour)
                                .addGap(18, 18, 18)
                                .addComponent(cbxBillboardMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblBillboardMin)
                                .addContainerGap())))
                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBillboardAge)
                            .addComponent(lblBillboardTitle)
                            .addComponent(lblBillboardPrice)
                            .addComponent(lblBillboardRoom)
                            .addComponent(lblBillboardDuration))
                        .addGap(18, 18, 18)
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                                .addComponent(spnDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addComponent(cbxBillboardRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBillboardPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfBillboardTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxAgeRestriction, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxBillboardGender, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnlMovieBillboardLayout.setVerticalGroup(
            pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblMovieBillboard)))
                .addGap(18, 18, 18)
                .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfBillboardTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(lblBillboardTitle))
                    .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblBillboardPoster)
                        .addComponent(jLabel12))
                    .addComponent(txfBillboardPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4)
                    .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBillboardRoom)
                        .addComponent(cbxBillboardRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBillboardAge)
                                .addComponent(cbxAgeRestriction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBillboardPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(lblBillboardPrice)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBillboardGender)
                                .addComponent(cbxBillboardGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBillboardDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxBillboardDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxBillboardMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxBillboardYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxBillboardHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxBillboardMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBillboardDay)
                            .addComponent(lblBillboardMonth)
                            .addComponent(lblBillboardYear)
                            .addComponent(lblBillboardHour)
                            .addComponent(lblBillboardMin)
                            .addComponent(jLabel9))
                        .addGap(29, 29, 29)
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBillboardDuration)
                                .addComponent(spnDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGap(45, 45, 45))
                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBilboradDiscard)
                    .addComponent(btnBillboardSave)
                    .addComponent(btnBillboardExit))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMovieBillboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMovieBillboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBillboardExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBillboardExitMouseClicked
        this.setVisible(false);
        new FrmAdmin().setVisible(false);
        new FrmCinemaBox().setVisible(true);
    }//GEN-LAST:event_btnBillboardExitMouseClicked

    private void cbxBillboardYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBillboardYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxBillboardYearActionPerformed

    private void btnBillboardSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBillboardSaveMouseClicked
        MovieRecord record = new MovieRecord();
        String title = txfBillboardTitle.getText();
        String gender = cbxBillboardGender.getSelectedItem().toString();
        String age = cbxAgeRestriction.getSelectedItem().toString();
        int duration = Integer.parseInt(spnDuration.getValue().toString());
        String namePoster = txfBillboardPoster.getText() + ".jpg";
        float price = Float.parseFloat(txtBillboardPrice.getText());
        int roomNumber = Integer.parseInt(cbxBillboardRoom.getSelectedItem().
            toString());
        String sinopsis = txaSinopsis.getText();
        CinemaRoom room = new CinemaRoom(roomNumber, record.
            defineRoom(roomNumber), CinemaRoom.buildSeat());
        MovieBillboard movie = new MovieBillboard(title, gender, age, duration,
            namePoster, sinopsis,  recordDate(), price, room);
        try {
            record.recordMovie("Billboard.json", movie);
        } catch (IOException ex) {
            Logger.getLogger(FrmMovieBillboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBillboardSaveMouseClicked

    public Date recordDate(){
        int year = Integer.parseInt(cbxBillboardYear.getSelectedItem().toString()) - 1900;
        int month = Integer.parseInt(cbxBillboardMonth.getSelectedItem().toString()) - 1;
        int day = Integer.parseInt(cbxBillboardDay.getSelectedItem().toString());
        int hour = Integer.parseInt(cbxBillboardHour.getSelectedItem().toString());
        int minute = Integer.parseInt(cbxBillboardMin.getSelectedItem().toString());
        return new Date(year, month, day, hour, minute);
    }
    
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
            java.util.logging.Logger.getLogger(FrmMovieBillboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMovieBillboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMovieBillboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMovieBillboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMovieBillboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBilboradDiscard;
    private javax.swing.JButton btnBillboardExit;
    private javax.swing.JButton btnBillboardSave;
    private javax.swing.JComboBox<String> cbxAgeRestriction;
    private javax.swing.JComboBox<String> cbxBillboardDay;
    private javax.swing.JComboBox<String> cbxBillboardGender;
    private javax.swing.JComboBox<String> cbxBillboardHour;
    private javax.swing.JComboBox<String> cbxBillboardMin;
    private javax.swing.JComboBox<String> cbxBillboardMonth;
    private javax.swing.JComboBox<String> cbxBillboardRoom;
    private javax.swing.JComboBox<String> cbxBillboardYear;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBillboardAge;
    private javax.swing.JLabel lblBillboardDate;
    private javax.swing.JLabel lblBillboardDay;
    private javax.swing.JLabel lblBillboardDuration;
    private javax.swing.JLabel lblBillboardGender;
    private javax.swing.JLabel lblBillboardHour;
    private javax.swing.JLabel lblBillboardMin;
    private javax.swing.JLabel lblBillboardMonth;
    private javax.swing.JLabel lblBillboardPoster;
    private javax.swing.JLabel lblBillboardPrice;
    private javax.swing.JLabel lblBillboardRoom;
    private javax.swing.JLabel lblBillboardTitle;
    private javax.swing.JLabel lblBillboardYear;
    private javax.swing.JLabel lblMovieBillboard;
    private javax.swing.JPanel pnlMovieBillboard;
    private javax.swing.JSpinner spnDuration;
    private javax.swing.JTextArea txaSinopsis;
    private java.awt.TextField txfBillboardPoster;
    private java.awt.TextField txfBillboardTitle;
    private java.awt.TextField txtBillboardPrice;
    // End of variables declaration//GEN-END:variables
}
