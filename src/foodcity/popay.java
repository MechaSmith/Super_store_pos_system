/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcity;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samith
 */
public class popay extends javax.swing.JPanel {

    /**
     * Creates new form popay
     */
    public popay() {
        initComponents();
        lodpop();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pono = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        b = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        y = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        m = new javax.swing.JComboBox<String>();
        a = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<String>();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        od = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        am = new javax.swing.JTextField();
        cn = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PO ID", "Supplier", "Value", "Date", "Pay by"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 980, 210));
        jPanel1.add(pono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, 30));

        jButton1.setBackground(new java.awt.Color(51, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/srch.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 60, -1));

        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText(" Pending Po  Payment  Value");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 240, 20));

        buttonGroup1.add(b);
        b.setForeground(new java.awt.Color(204, 255, 255));
        b.setText("Not Oayed Po");
        jPanel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, -1, -1));

        jLabel2.setForeground(new java.awt.Color(153, 255, 204));
        jLabel2.setText("Month");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 40, 30));
        jPanel1.add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 80, 30));

        jLabel3.setForeground(new java.awt.Color(153, 255, 204));
        jLabel3.setText("Year");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 40, 30));

        m.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jan", "Feb", "Mar", "Apri", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        jPanel1.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 80, 30));

        buttonGroup1.add(a);
        a.setForeground(new java.awt.Color(204, 255, 255));
        a.setSelected(true);
        a.setText("Payed PO");
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/srch.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 60, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 153));
        jLabel4.setText("000000000000");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 280, 50));

        jLabel5.setForeground(new java.awt.Color(153, 255, 204));
        jLabel5.setText("Po No :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 140, 20));

        pn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pnKeyReleased(evt);
            }
        });
        jPanel1.add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 110, 30));

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 204, 255));
        jLabel6.setText("Po Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 100, 30));

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 110, 110));

        jLabel13.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 204, 255));
        jLabel13.setText("Out Date");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 100, 30));

        jButton4.setBackground(new java.awt.Color(51, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/py.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 80, 30));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/podicancl.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 170, 80, 30));
        jPanel1.add(od, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 190, 30));

        jLabel7.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 204, 255));
        jLabel7.setText("Amount");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 140, 30));

        am.setEditable(false);
        jPanel1.add(am, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 190, 30));

        cn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnKeyTyped(evt);
            }
        });
        jPanel1.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 190, 30));

        jLabel12.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 204, 255));
        jLabel12.setText("Check Number");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 100, 30));

        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 560, 170));

        jLabel8.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PO PAYMENT");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/ll.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 540));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void pnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnKeyReleased
        try {
            ResultSet rs = db.search("select * from po_pay where purchase_order_po_id like '%" + pn.getText() + "%' and status='0'");
            Vector v = new Vector();
            while (rs.next()) {
                v.add(rs.getString("purchase_order_po_id"));

            }
            jList1.setListData(v);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_pnKeyReleased

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        pn.setText(jList1.getSelectedValue().toString());
        pn.setEditable(false);
        try {
            ResultSet rs = db.search("select * from po_pay where purchase_order_po_id='" + pn.getText() + "'");
            if (rs.next()) {
                am.setText(rs.getString("amount"));
            }
            jList1.setVisible(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (am.getText().length() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please check correct po number", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
            pn.grabFocus();
        } else if (od.getDate() == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter check out date", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
        } else if (cn.getText().length() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter check number", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
            cn.grabFocus();
        } else {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date d = od.getDate();
                String dd = sdf.format(d);

                double amou = Double.parseDouble(am.getText());
                db.iud("update po_pay set date='" + Main.mdatee.getText() + "',outdate='" + dd + "',cheque='" + cn.getText() + "',status='1',emp_emp_id='" + log.empido + "',amount='" + amou + "'  where purchase_order_po_id='" + pn.getText() + "'");
                javax.swing.JOptionPane.showMessageDialog(this, "Success");
                ResultSet rs = db.search("select * from money_account");
                double dk = 0;
                while (rs.next()) {
                    dk = dk + Double.parseDouble(rs.getString("amount"));

                }
                double nam = dk - amou;
                db.iud("update money_account set amount='" + nam + "'");
                DefaultListModel model = new DefaultListModel();
                model.clear();
                jList1.setModel(model);

                lodpop();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        pn.setEditable(true);
        jList1.setVisible(true);
        cn.setText(null);
        am.setText(null);
        od.setDate(null);
        pn.setText(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        pn.setEditable(true);
        jList1.setVisible(true);
        cn.setText(null);
        am.setText(null);
        od.setDate(null);
        pn.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnKeyTyped
        if (cn.getText().length() < 6) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_cnKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (pono.getText().length() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter po no", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            pono.grabFocus();
        } else {
            DefaultTableModel dtm2 = (DefaultTableModel) jTable1.getModel();
            dtm2.setRowCount(0);
            try {

                ResultSet rs1 = db.search("select a.*,b.*,c.*,d.* from (((grn a inner join supplier b on a.supplier_sup_id=b.sup_id)"
                        + "inner join po_pay c on a.purchase_order_po_id=c.purchase_order_po_id)"
                        + "inner join purchase_order d on a.purchase_order_po_id=d.po_id) where a.purchase_order_po_id= '" + pono.getText() + "'");
                if (rs1.next()) {

                    String name = "";
                    String ch = "";
                    ResultSet rs3 = db.search("select fname from emp where emp_id='" + rs1.getString("emp_emp_id") + "'");

                    if (rs3.next()) {
                        ch = rs1.getString("cheque");
                        name = rs3.getString("fname");
                    } else {
                        ch = "Pending";
                        name = "Pending";
                    }

                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    Vector v = new Vector();
                    v.add(rs1.getString("emp_emp_id"));
                    v.add(rs1.getString("name"));
                    v.add(rs1.getString("amount"));
                    v.add(rs1.getString("date"));
                    v.add(rs1.getString("cheque"));

                    v.add(name);
                    dtm.addRow(v);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Wrong Po Number", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        String stat = "";
        if (a.isSelected()) {
            stat = "1";
        } else {
            stat = "0";
        }
        if (y.getText().length() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter year", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
            y.grabFocus();
        } else if (y.getText().length() != 4) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter correct year", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
            y.grabFocus();
        } else {

            String month = m.getSelectedItem().toString();
            String mn = "";
            if (month.equalsIgnoreCase("jan")) {
                mn = "01";
            } else if (month.equalsIgnoreCase("feb")) {
                mn = "02";
            } else if (month.equalsIgnoreCase("mar")) {
                mn = "03";
            } else if (month.equalsIgnoreCase("apr")) {
                mn = "04";
            } else if (month.equalsIgnoreCase("may")) {
                mn = "05";
            } else if (month.equalsIgnoreCase("jun")) {
                mn = "06";
            } else if (month.equalsIgnoreCase("jul")) {
                mn = "07";
            } else if (month.equalsIgnoreCase("aug")) {
                mn = "08";
            } else if (month.equalsIgnoreCase("sep")) {
                mn = "09";
            } else if (month.equalsIgnoreCase("oct")) {
                mn = "10";
            } else if (month.equalsIgnoreCase("nov")) {
                mn = "11";
            } else if (month.equalsIgnoreCase("dec")) {
                mn = "12";
            }
            String d = y.getText() + "-" + mn;
            try {
                int check = 0;
                ResultSet rs = db.search("select a.*,b.*,d.* from ((grn a inner join supplier b on a.supplier_sup_id=b.sup_id)"
                        + "inner join purchase_order d on a.purchase_order_po_id=d.po_id) where  d.date like '%" + d + "%' && d.status='"+stat+"'");
                while (rs.next()) {
                    check = 1;

                    String name = "";
                    String ch = "";
                    ResultSet rs3 = db.search("select fname from emp where emp_id='" + rs.getString("emp_emp_id") + "'");

                    if (rs3.next()) {

                        name = rs3.getString("fname");
                    } else {
                        ch = "Pending";
                        name = "Pending";
                    }

                    Vector v = new Vector();
                    v.add(rs.getString("emp_emp_id"));
                    v.add(rs.getString("name"));
                    v.add(rs.getString("total"));
                    v.add(rs.getString("date"));

                    v.add(name);
                    dtm.addRow(v);
                }
                if (check == 0) {
                    DefaultTableModel dtm1 = (DefaultTableModel) jTable1.getModel();
                    dtm1.setRowCount(0);
                    javax.swing.JOptionPane.showMessageDialog(this, "NO data you selected month. Please check another month.", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a;
    private javax.swing.JTextField am;
    private javax.swing.JRadioButton b;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> m;
    private com.toedter.calendar.JDateChooser od;
    private javax.swing.JTextField pn;
    private javax.swing.JTextField pono;
    private javax.swing.JTextField y;
    // End of variables declaration//GEN-END:variables

    private void lodpop() {
        try {
            ResultSet rs = db.search("select amount from po_pay where status='0'");
            double d = 0;
            while (rs.next()) {
                d = d + Double.parseDouble(rs.getString("amount"));
            }
            jLabel4.setText("" + d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
