/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Estudiantes
 */
public class GraficaTrigo extends javax.swing.JFrame {
    Trigonometricas miCalculo = new Trigonometricas();

    /**
     * Creates new form GraficaTrigo
     */
    public GraficaTrigo() {
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
        angulo = new javax.swing.JTextField();
        botonSeno = new javax.swing.JButton();
        botonCosecante = new javax.swing.JButton();
        botonArcoseno = new javax.swing.JButton();
        botonCoseno = new javax.swing.JButton();
        botonSecante = new javax.swing.JButton();
        botonTangente = new javax.swing.JButton();
        botonArcocoseno = new javax.swing.JButton();
        botonCotangente = new javax.swing.JButton();
        botonArcotangente = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Valor del angulo");

        botonSeno.setText("Sen");
        botonSeno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSenoMouseClicked(evt);
            }
        });

        botonCosecante.setText("Csc");
        botonCosecante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCosecanteMouseClicked(evt);
            }
        });

        botonArcoseno.setText("aSen");
        botonArcoseno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonArcosenoMouseClicked(evt);
            }
        });

        botonCoseno.setText("Cos");
        botonCoseno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCosenoMouseClicked(evt);
            }
        });

        botonSecante.setText("Sec");
        botonSecante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSecanteMouseClicked(evt);
            }
        });

        botonTangente.setText("Tan");
        botonTangente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTangenteMouseClicked(evt);
            }
        });

        botonArcocoseno.setText("aCos");
        botonArcocoseno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonArcocosenoMouseClicked(evt);
            }
        });

        botonCotangente.setText("Ctg");
        botonCotangente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCotangenteMouseClicked(evt);
            }
        });

        botonArcotangente.setText("aTan");
        botonArcotangente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonArcotangenteMouseClicked(evt);
            }
        });

        jLabel2.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(angulo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonSeno, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonCosecante)
                                .addGap(18, 18, 18)
                                .addComponent(botonArcoseno))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonCoseno)
                                .addGap(18, 18, 18)
                                .addComponent(botonSecante)
                                .addGap(18, 18, 18)
                                .addComponent(botonArcocoseno))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonTangente)
                                .addGap(18, 18, 18)
                                .addComponent(botonCotangente)
                                .addGap(18, 18, 18)
                                .addComponent(botonArcotangente))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(angulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSeno)
                    .addComponent(botonCosecante)
                    .addComponent(botonArcoseno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCoseno)
                    .addComponent(botonSecante)
                    .addComponent(botonArcocoseno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonTangente)
                    .addComponent(botonCotangente)
                    .addComponent(botonArcotangente))
                .addGap(18, 18, 18)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSenoMouseClicked
        radianes();
        this.resultado.setText(textos(miCalculo.seno()));
    }//GEN-LAST:event_botonSenoMouseClicked

    private void botonCosenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCosenoMouseClicked
        radianes();
        this.resultado.setText(textos(miCalculo.coseno()));
    }//GEN-LAST:event_botonCosenoMouseClicked

    private void botonTangenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTangenteMouseClicked
        radianes();
        this.resultado.setText(textos(miCalculo.tangente()));
    }//GEN-LAST:event_botonTangenteMouseClicked

    private void botonCosecanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCosecanteMouseClicked
        radianes();
        this.resultado.setText(textos(miCalculo.cosecante()));
    }//GEN-LAST:event_botonCosecanteMouseClicked

    private void botonSecanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSecanteMouseClicked
        radianes();
        this.resultado.setText(textos(miCalculo.secante()));
    }//GEN-LAST:event_botonSecanteMouseClicked

    private void botonCotangenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCotangenteMouseClicked
        radianes();
        this.resultado.setText(textos(miCalculo.cotangente()));
    }//GEN-LAST:event_botonCotangenteMouseClicked

    private void botonArcosenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonArcosenoMouseClicked
        radianes();
        this.resultado.setText(textos(miCalculo.arcoseno()));
    }//GEN-LAST:event_botonArcosenoMouseClicked

    private void botonArcocosenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonArcocosenoMouseClicked
        this.resultado.setText(textos(miCalculo.arcocoseno()));
    }//GEN-LAST:event_botonArcocosenoMouseClicked

    private void botonArcotangenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonArcotangenteMouseClicked
        this.resultado.setText(textos(miCalculo.arcotangente()));
    }//GEN-LAST:event_botonArcotangenteMouseClicked

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
            java.util.logging.Logger.getLogger(GraficaTrigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficaTrigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficaTrigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficaTrigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficaTrigo().setVisible(true);
            }
        });
    }
    
    double numero(){
        return Double.parseDouble(this.angulo.getText());
    }
    
    void radianes(){
        miCalculo.angulo = Math.toRadians(numero());
    }
    
    String textos(double num){
        return Double.toString(num);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angulo;
    private javax.swing.JButton botonArcocoseno;
    private javax.swing.JButton botonArcoseno;
    private javax.swing.JButton botonArcotangente;
    private javax.swing.JButton botonCosecante;
    private javax.swing.JButton botonCoseno;
    private javax.swing.JButton botonCotangente;
    private javax.swing.JButton botonSecante;
    private javax.swing.JButton botonSeno;
    private javax.swing.JButton botonTangente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
