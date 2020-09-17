/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view;

import ec.edu.espe.cinemaboxoffice.controller.SeatControl;
import ec.edu.espe.cinemaboxoffice.model.Movie;
import ec.edu.espe.cinemaboxoffice.model.BillboardMovie;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class FrmSeatsControl extends javax.swing.JFrame {

    private Movie movie;

    /**
     * Creates new form FrmSeatsControl
     */
    public FrmSeatsControl(Movie movie) {
        initComponents();
        this.movie = movie;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSeats = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblSeats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Columna 1", "Columna 2", "Columna 3", "Columna 4", "Columna 5", "Columna 6", "Columna 7", "Columna 8", "Columna 9", "Columna 10"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSeats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSeatsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSeats);
        if (tblSeats.getColumnModel().getColumnCount() > 0) {
            tblSeats.getColumnModel().getColumn(0).setPreferredWidth(90);
            tblSeats.getColumnModel().getColumn(1).setPreferredWidth(90);
            tblSeats.getColumnModel().getColumn(2).setPreferredWidth(90);
            tblSeats.getColumnModel().getColumn(3).setPreferredWidth(90);
            tblSeats.getColumnModel().getColumn(4).setPreferredWidth(90);
            tblSeats.getColumnModel().getColumn(5).setPreferredWidth(90);
            tblSeats.getColumnModel().getColumn(6).setPreferredWidth(90);
            tblSeats.getColumnModel().getColumn(7).setPreferredWidth(90);
            tblSeats.getColumnModel().getColumn(8).setPreferredWidth(90);
            tblSeats.getColumnModel().getColumn(9).setPreferredWidth(90);
        }

        jLabel1.setText("Asientos");

        jButton2.setText("Salir");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSeatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSeatsMouseClicked
        tblSeats.setEnabled(false);
        int x = tblSeats.rowAtPoint(evt.getPoint());
        int y = tblSeats.columnAtPoint(evt.getPoint());
        if ("Desocupado".equals(tblSeats.getValueAt(x, y))) {
            SeatControl seatControl = new SeatControl();
            try {
                seatControl.controlSeats(movie, x, y, true);
                FrmBill bill = new FrmBill((BillboardMovie) movie);
                FrmBill.x = x;
                FrmBill.y = y;
                bill.setVisible(true);
                bill.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            } catch (IOException ex) {
                Logger.getLogger(FrmSeatsControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "seat not available", "Seat control", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_tblSeatsMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    public void showSeats() {
        boolean seatAvailability;
        int cont = 0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                seatAvailability = movie.getRoom().getSeats()[cont].isSeatAvailableOrBusy();
                if (!seatAvailability) {
                    tblSeats.setValueAt("Desocupado", i, j);
                } else {
                    tblSeats.setValueAt("  Ocupado", i, j);
                }
                cont++;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSeats;
    // End of variables declaration//GEN-END:variables
}