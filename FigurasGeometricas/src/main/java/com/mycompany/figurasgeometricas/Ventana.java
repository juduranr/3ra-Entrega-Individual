/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.figurasgeometricas;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBaseR = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAlturaR = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBaseT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAlturaT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnCalcular1 = new javax.swing.JToggleButton();
        btnCalcular2 = new javax.swing.JToggleButton();
        btnCalcular3 = new javax.swing.JToggleButton();
        btnCalcular4 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Calcular Area y Diametro del circulo");

        jLabel2.setText("Radio del circulo:");

        txtRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRadioActionPerformed(evt);
            }
        });

        jLabel3.setText("Calcular Area y Perimetro del rectangulo");

        jLabel4.setText("Base del rectangulo");

        jLabel5.setText("Altura del rectangulo");

        txtAlturaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaRActionPerformed(evt);
            }
        });

        jLabel6.setText("Calcular Area y Perimetro del cuadrado");

        jLabel7.setText("Lado del cuadrado");

        txtLado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLadoActionPerformed(evt);
            }
        });

        jLabel9.setText("Base del triangulo");

        jLabel10.setText("Altura del triangulo");

        jLabel11.setText("Calcular Area, Perimetro e Hipotenusa ");

        jLabel12.setText("de un Triangulo Rectangulo");

        btnCalcular1.setText("Calcular");
        btnCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular1ActionPerformed(evt);
            }
        });

        btnCalcular2.setText("Calcular");
        btnCalcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular2ActionPerformed(evt);
            }
        });

        btnCalcular3.setText("Calcular");
        btnCalcular3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular3ActionPerformed(evt);
            }
        });

        btnCalcular4.setText("Calcular");
        btnCalcular4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAlturaR, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(txtBaseR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCalcular1)
                            .addComponent(btnCalcular2)
                            .addComponent(btnCalcular3))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAlturaT, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(txtBaseT))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalcular4))
                            .addComponent(jLabel12))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtBaseR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtAlturaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnCalcular2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtBaseT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtAlturaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalcular4)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRadioActionPerformed

    private void txtLadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLadoActionPerformed

    private void txtAlturaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaRActionPerformed

    private void btnCalcular4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular4ActionPerformed
        try{
            Double Area = Calculo.areaTriangulo(Double.parseDouble(txtBaseT.getText()),Double.parseDouble(txtAlturaT.getText()));
            Double Hipotenusa = Calculo.hipotenusaTriangulo(Double.parseDouble(txtBaseT.getText()),Double.parseDouble(txtAlturaT.getText()));
            Double Perimetro = Calculo.perimetroTriangulo(Double.parseDouble(txtBaseT.getText()),Double.parseDouble(txtAlturaT.getText()), Hipotenusa);
            String Tipo = "";
            if ((Double.parseDouble(txtBaseT.getText()) == Double.parseDouble(txtAlturaT.getText())) && (Double.parseDouble(txtBaseT.getText()) == Hipotenusa) && (Double.parseDouble(txtAlturaT.getText()) == Hipotenusa)){ 
                Tipo += "Equilatero";
            }
            else if ((Double.parseDouble(txtBaseT.getText()) != Double.parseDouble(txtAlturaT.getText())) && (Double.parseDouble(txtBaseT.getText()) != Hipotenusa) && (Double.parseDouble(txtAlturaT.getText()) != Hipotenusa)){
                Tipo += "Escaleno";
            }
            else{
                Tipo += "Is??sceles";
            }
            String Resultado = String.format("El area del Triangulo es %.2f, el perimetro %.2f, la hipotenusa %.2f y adem??s el tipo de triangulo es %s",Area,Perimetro,Hipotenusa,Tipo);
            JOptionPane.showMessageDialog(null, Resultado);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto.");
        }
    }//GEN-LAST:event_btnCalcular4ActionPerformed

    private void btnCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular1ActionPerformed
        try{
            Double Area = Calculo.areaCirculo(Double.parseDouble(txtRadio.getText()));
            Double Diametro = Calculo.diametroCirculo(Double.parseDouble(txtRadio.getText()));
            String Resultado = String.format("El area del circulo es %.2f y el diametro es %.2f",Area,Diametro);
            JOptionPane.showMessageDialog(null, Resultado);    
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto.");
        }
    }//GEN-LAST:event_btnCalcular1ActionPerformed

    private void btnCalcular3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular3ActionPerformed
        try{
            Double Area = Calculo.areaCuadrado(Double.parseDouble(txtLado.getText()));
            Double Perimetro = Calculo.perimetroCuadrado(Double.parseDouble(txtLado.getText()));
            String Resultado = String.format("El area del cuadrado es %.2f y el perimetro es %.2f",Area,Perimetro);
            JOptionPane.showMessageDialog(null, Resultado);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto.");
        }
    }//GEN-LAST:event_btnCalcular3ActionPerformed

    private void btnCalcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular2ActionPerformed
        try{
            Double Area = Calculo.areaRectangulo(Double.parseDouble(txtBaseR.getText()),Double.parseDouble(txtAlturaR.getText()));
            Double Perimetro = Calculo.perimetroRectangulo(Double.parseDouble(txtBaseR.getText()),Double.parseDouble(txtAlturaR.getText()));
            String Resultado = String.format("El area del rectangulo es %.2f y el perimetro es %.2f",Area,Perimetro);
            JOptionPane.showMessageDialog(null, Resultado);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto.");
        }
    }//GEN-LAST:event_btnCalcular2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCalcular1;
    private javax.swing.JToggleButton btnCalcular2;
    private javax.swing.JToggleButton btnCalcular3;
    private javax.swing.JToggleButton btnCalcular4;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAlturaR;
    private javax.swing.JTextField txtAlturaT;
    private javax.swing.JTextField txtBaseR;
    private javax.swing.JTextField txtBaseT;
    private javax.swing.JTextField txtLado;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables
}
