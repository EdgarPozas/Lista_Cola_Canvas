package Ventana;

import Cola.Cola_Simple;
import Lista.ListaDoble;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
public class Ventana_Cola extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana_Cola() {
        cola=new Cola_Simple(10);
        initComponents();
        lienzo=new Lienzo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_eliminar_ultimo = new javax.swing.JButton();
        btn_reiniciar_cola = new javax.swing.JButton();
        txt_dato = new javax.swing.JTextField();
        btn_insertar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        jLabel1.setText("Dato");

        btn_eliminar_ultimo.setText("Eliminar");
        btn_eliminar_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_ultimoActionPerformed(evt);
            }
        });

        btn_reiniciar_cola.setText("Reiniciar");
        btn_reiniciar_cola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reiniciar_colaActionPerformed(evt);
            }
        });

        txt_dato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_datoActionPerformed(evt);
            }
        });

        btn_insertar.setText("Insertar");
        btn_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_reiniciar_cola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 154, Short.MAX_VALUE))
                    .addComponent(btn_eliminar_ultimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_insertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_dato))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_dato, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_insertar)
                .addGap(26, 26, 26)
                .addComponent(btn_eliminar_ultimo)
                .addGap(32, 32, 32)
                .addComponent(btn_reiniciar_cola)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Ventanas");

        jMenuItem1.setText("Lista");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Cola");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void txt_datoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_datoActionPerformed
      
    }//GEN-LAST:event_txt_datoActionPerformed

    private void btn_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarActionPerformed
       if(this.txt_dato.getText().isEmpty()){
           showMessageDialog(this,"Ingresa algo");
           return;
       }
       boolean inserto=cola.encolar(this.txt_dato.getText());
       if(inserto){
            lienzo.drawCola(canvas.getGraphics(),cola);
       }
       txt_dato.setText("");
    }//GEN-LAST:event_btn_insertarActionPerformed

    private void btn_eliminar_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_ultimoActionPerformed
       boolean elimino=cola.desencolar();
       if(elimino){
            lienzo.drawCola(canvas.getGraphics(),cola);
       }
    }//GEN-LAST:event_btn_eliminar_ultimoActionPerformed

    private void btn_reiniciar_colaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reiniciar_colaActionPerformed
         //Cola¿
        Ventana_Cola v=new Ventana_Cola();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_reiniciar_colaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //Lista
        Ventana_Lista v=new Ventana_Lista();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //Cola¿
        Ventana_Cola v=new Ventana_Cola();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       lienzo.drawCola(canvas.getGraphics(), cola);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Ventana_Cola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Cola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Cola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Cola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Cola().setVisible(true);
            }
        });
    }

    private Lienzo lienzo;
    private Cola_Simple cola;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar_ultimo;
    private javax.swing.JButton btn_insertar;
    private javax.swing.JButton btn_reiniciar_cola;
    private javax.swing.JPanel canvas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_dato;
    // End of variables declaration//GEN-END:variables
}
