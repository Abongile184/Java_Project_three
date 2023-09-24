/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalproject;

import javax.swing.JOptionPane;
import java.util.Date;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Abongile Mavela
 */
public class frmHospitalBill extends javax.swing.JFrame {

    /**
     * Creates new form frmHospitalBill
     */
    public frmHospitalBill() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReturn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        chkFeroglobin = new javax.swing.JCheckBox();
        chkOramorph = new javax.swing.JCheckBox();
        chkPanado = new javax.swing.JCheckBox();
        chkExputex = new javax.swing.JCheckBox();
        chkFolicAcid = new javax.swing.JCheckBox();
        chkImmuneComplex = new javax.swing.JCheckBox();
        chkParacetamol = new javax.swing.JCheckBox();
        chkNeurobion = new javax.swing.JCheckBox();
        txtOramorph = new javax.swing.JTextField();
        txtFeroglobin = new javax.swing.JTextField();
        txtPanado = new javax.swing.JTextField();
        txtExputex = new javax.swing.JTextField();
        txtImmune = new javax.swing.JTextField();
        txtParacetamol = new javax.swing.JTextField();
        txtNeurobion = new javax.swing.JTextField();
        txtFolicAcid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        chkConsultation = new javax.swing.JCheckBox();
        txtConsultation = new javax.swing.JTextField();
        btnBill = new javax.swing.JButton();
        btnSubtotal = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblOutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOSPITAL BILL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Patient Name:");

        jLabel3.setText("Patient Surname:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("MEDICATION"));

        chkFeroglobin.setText("Feroglobin liquid plus 200 ml");

        chkOramorph.setText("Oramorph Oral Solution 10mg/5 ml");

        chkPanado.setText("Panado Paediatric Syrup 100ml");

        chkExputex.setText("Exputex Oral Solution 250mg/5ml");

        chkFolicAcid.setText("Folic Acid Supplement 300mg  60 Tablets");

        chkImmuneComplex.setText("Immune Complex 200mg  30 Tables");

        chkParacetamol.setText("Paracetamol 500mg  24 Tablets");

        chkNeurobion.setText("Neurobion 200mg  30 Tablets");

        jLabel4.setText("Subtotal:");

        jLabel5.setText("Subtotal:");

        jLabel6.setText("Subtotal:");

        jLabel7.setText("Subtotal:");

        jLabel8.setText("Subtotal:");

        jLabel9.setText("Subtotal:");

        jLabel10.setText("Subtotal:");

        jLabel11.setText("Subtotal:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPanado)
                    .addComponent(chkExputex)
                    .addComponent(chkOramorph)
                    .addComponent(chkFeroglobin)
                    .addComponent(chkFolicAcid)
                    .addComponent(chkImmuneComplex)
                    .addComponent(chkParacetamol)
                    .addComponent(chkNeurobion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(32, 32, 32)
                        .addComponent(txtNeurobion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(32, 32, 32)
                        .addComponent(txtParacetamol, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(32, 32, 32)
                        .addComponent(txtImmune, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(32, 32, 32)
                        .addComponent(txtFolicAcid, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addComponent(txtFeroglobin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32)
                        .addComponent(txtOramorph, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(32, 32, 32)
                            .addComponent(txtExputex, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPanado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkFeroglobin)
                    .addComponent(txtFeroglobin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkOramorph)
                    .addComponent(txtOramorph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPanado)
                    .addComponent(txtPanado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkExputex)
                    .addComponent(txtExputex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkFolicAcid)
                    .addComponent(txtFolicAcid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkImmuneComplex)
                    .addComponent(txtImmune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkParacetamol)
                    .addComponent(txtParacetamol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNeurobion)
                    .addComponent(txtNeurobion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("CONSULTATION"));

        chkConsultation.setText("Consulationa With Doctor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkConsultation)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(chkConsultation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBill.setText("Total Bill");
        btnBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillActionPerformed(evt);
            }
        });

        btnSubtotal.setText("Subtotal");
        btnSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtotalActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addComponent(lblOutput))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnReturn)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnBill, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(38, 38, 38)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblOutput)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnBill)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubtotal)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReturn)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillActionPerformed
        //VAT RATE = 15%
        //VAT Rate = 15% / 100 = 0.15
        //total VAT = 1 + 0.15 = 1.15 
        //Ampicillin = R100 , Oramorph = R50 , Panado = R20 , Ephedrine = R150,
        //
        Scanner input = new Scanner(System.in);

        String strName;
        String strSurname;
        strName = txtName.getText();
        strSurname = txtSurname.getText();

        Date dtDate = new Date();

        double dblAmpicillin, dblOramorph, dblPanado, dblEphedrine, dblTotal1, dblVAT;
        double dblFolicAcid, dblImmuneComplex, dblParacetamol, dblNeurobion, dblTotal2;
        dblAmpicillin = 0;
        dblOramorph = 0;
        dblPanado = 0;
        dblEphedrine = 0;
        dblTotal1 = 0;

        dblVAT = 1.15;
        dblFolicAcid = 0;
        dblImmuneComplex = 0;
        dblParacetamol = 0;
        dblNeurobion = 0;
        dblTotal2 = 0;
        int intConsultation = 500;
      double  dbltotalConsultation = 0;
      double dblTotalAmountPatient = 0;        
        DecimalFormat df = new DecimalFormat("0.00");
        
        
        if (chkConsultation.isSelected()) {
            intConsultation = 500;
            dbltotalConsultation = (intConsultation * dblVAT );
        }
        
        
        if (chkFeroglobin.isSelected()) {
            dblAmpicillin = 148.87;
        }
        if (chkOramorph.isSelected()) {
            dblOramorph = 50;
        }
        if (chkPanado.isSelected()) {
            dblPanado = 62;
        }
        if (chkExputex.isSelected()) {
            dblEphedrine = 170;
        }
       
        
        if (chkFolicAcid.isSelected()) {
            dblFolicAcid = 80;
        }
        if (chkImmuneComplex.isSelected()) {
            dblImmuneComplex = 180;
        }
        if (chkParacetamol.isSelected()) {
            dblParacetamol = 120;
        }
        if (chkNeurobion.isSelected()) {
            dblNeurobion = 51;
        }
        
dblTotal1 = (dblAmpicillin + dblOramorph + dblPanado + dblEphedrine)*dblVAT;
dblTotal2 = (dblFolicAcid + dblImmuneComplex + dblParacetamol + dblNeurobion)*dblVAT;
dblTotalAmountPatient = dblTotal1 + dblTotal2 + dbltotalConsultation;

JOptionPane.showMessageDialog(null, strName + " " + strSurname + "\n" +"Total Amount Of Bottled Medication Purchased:" +" R"+ df.format(dblTotal1) +
"\n" +"Total Amount Of Tablets Purchased:"+" R"+ df.format(dblTotal2) + "\n" +"Total Fee for Consultation+ VAT:"+" R" 
+dbltotalConsultation +"\n"+"\n"+"Total Amount To Be Paid:" +" R" + df.format(dblTotalAmountPatient) +"\n"+"\n" + dtDate.toString());


    }//GEN-LAST:event_btnBillActionPerformed

    private void btnSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtotalActionPerformed
        double dblAmpicillin, dblOramorph, dblPanado, dblEphedrine, dblTotal1, dblVAT;
        double dblFolicAcid, dblImmuneComplex, dblParacetamol, dblNeurobion, dblTotal2;
        dblAmpicillin = 0;
        dblOramorph = 0;
        dblPanado = 0;
        dblEphedrine = 0;
        dblTotal1 = 0;

        dblVAT = 1.15;
        dblFolicAcid = 0;
        dblImmuneComplex = 0;
        dblParacetamol = 0;
        dblNeurobion = 0;
        dblTotal2 = 0;
        double dbltotalConsultation = 0;
        int intConsultation;
   
        if(chkConsultation.isSelected())
        {
        intConsultation = 500;
        txtConsultation.setText(String.valueOf("R" + intConsultation));
        }

        if (chkFeroglobin.isSelected()) {
            dblAmpicillin = 148.87;
            txtFeroglobin.setText(String.valueOf("R"+dblAmpicillin));
        }
        if (chkOramorph.isSelected()) {
            dblOramorph = 50;
            txtOramorph.setText(String.valueOf("R"+dblOramorph));
        }
        if (chkPanado.isSelected()) {
            dblPanado = 62;
            txtPanado.setText(String.valueOf("R"+dblPanado));
        }
        if (chkExputex.isSelected()) {
            dblEphedrine = 170;
            txtExputex.setText(String.valueOf(("R"+dblEphedrine)));
        }
       
        if (chkFolicAcid.isSelected()) {
            dblFolicAcid = 80;
            txtFolicAcid.setText(String.valueOf("R"+dblFolicAcid));
        }
        if (chkImmuneComplex.isSelected()) {
            dblImmuneComplex = 180;
            txtImmune.setText(String.valueOf("R"+dblImmuneComplex));
        }
        if (chkParacetamol.isSelected()) {
            dblParacetamol = 25;
            txtParacetamol.setText(String.valueOf("R"+dblParacetamol));
        }
        if (chkNeurobion.isSelected()) {
            dblNeurobion = 110;
            txtNeurobion.setText(String.valueOf("R"+dblNeurobion));
        }
    }//GEN-LAST:event_btnSubtotalActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtName.setText("");
        txtSurname.setText("");
        txtConsultation.setText("");

        txtFeroglobin.setText("");
        txtOramorph.setText("");
        txtPanado.setText("");
        txtExputex.setText("");

        txtFolicAcid.setText("");
        txtImmune.setText("");
        txtParacetamol.setText("");
        txtNeurobion.setText("");

        chkConsultation.setSelected(false);
        chkFeroglobin.setSelected(false);
        chkOramorph.setSelected(false);
        chkPanado.setSelected(false);
        chkExputex.setSelected(false);

        chkFolicAcid.setSelected(false);
        chkImmuneComplex.setSelected(false);
        chkParacetamol.setSelected(false);
        chkNeurobion.setSelected(false);

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        frmPatientRegistration frmPatientRegistration = new frmPatientRegistration();
        frmPatientRegistration.show();
    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(frmHospitalBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHospitalBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHospitalBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHospitalBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHospitalBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSubtotal;
    private javax.swing.JCheckBox chkConsultation;
    private javax.swing.JCheckBox chkExputex;
    private javax.swing.JCheckBox chkFeroglobin;
    private javax.swing.JCheckBox chkFolicAcid;
    private javax.swing.JCheckBox chkImmuneComplex;
    private javax.swing.JCheckBox chkNeurobion;
    private javax.swing.JCheckBox chkOramorph;
    private javax.swing.JCheckBox chkPanado;
    private javax.swing.JCheckBox chkParacetamol;
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
    private javax.swing.JLabel lblOutput;
    private javax.swing.JTextField txtConsultation;
    private javax.swing.JTextField txtExputex;
    private javax.swing.JTextField txtFeroglobin;
    private javax.swing.JTextField txtFolicAcid;
    private javax.swing.JTextField txtImmune;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNeurobion;
    private javax.swing.JTextField txtOramorph;
    private javax.swing.JTextField txtPanado;
    private javax.swing.JTextField txtParacetamol;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
