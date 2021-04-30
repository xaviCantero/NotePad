package ar.org.casa.java.notepad;

import ar.org.casa.java.utils.files.FileText;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Notepad extends javax.swing.JFrame {

    public Notepad() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaTexto = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        menArchivo = new javax.swing.JMenu();
        menNuevo = new javax.swing.JMenuItem();
        menAbrir = new javax.swing.JMenuItem();
        menGuardar = new javax.swing.JMenuItem();
        menOpciones = new javax.swing.JMenu();
        menAcerca = new javax.swing.JMenuItem();
        menSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notepad");

        txaTexto.setColumns(20);
        txaTexto.setRows(5);
        jScrollPane1.setViewportView(txaTexto);

        menArchivo.setText("Archivo");

        menNuevo.setText("Nuevo");
        menNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menNuevoActionPerformed(evt);
            }
        });
        menArchivo.add(menNuevo);

        menAbrir.setText("Abrir");
        menAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAbrirActionPerformed(evt);
            }
        });
        menArchivo.add(menAbrir);

        menGuardar.setText("Guardar");
        menGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menGuardarActionPerformed(evt);
            }
        });
        menArchivo.add(menGuardar);

        jMenuBar1.add(menArchivo);

        menOpciones.setText("Opciones");

        menAcerca.setText("Acerca de");
        menAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAcercaActionPerformed(evt);
            }
        });
        menOpciones.add(menAcerca);

        menSalir.setText("Salir");
        menSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSalirActionPerformed(evt);
            }
        });
        menOpciones.add(menSalir);

        jMenuBar1.add(menOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSalirActionPerformed
        // Evento salir
        System.exit(0);
    }//GEN-LAST:event_menSalirActionPerformed

    private void menAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAcercaActionPerformed
        //Evento Acerca de
        JOptionPane.showMessageDialog(this, "Block de notas.\nCurso de Java 2021");
    }//GEN-LAST:event_menAcercaActionPerformed

    private void menNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menNuevoActionPerformed
        //Evento nuevo
        if(txaTexto.getText()==null || txaTexto.getText().isEmpty()) return;
        if(JOptionPane.showConfirmDialog(this, "Desea borrar el Documento")!=0) return;
        txaTexto.setText("");
    }//GEN-LAST:event_menNuevoActionPerformed

    private void menGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menGuardarActionPerformed
        // Evento Guardar
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("txt", "txt"));
        fc.showSaveDialog(this);
        File file = fc.getSelectedFile();
        if(file==null);
        new FileText(file).setText(txaTexto.getText());
    }//GEN-LAST:event_menGuardarActionPerformed

    private void menAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAbrirActionPerformed
        // Evento Abrir
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("txt", "txt"));
        fc.showOpenDialog(this);
        File file = fc.getSelectedFile();
        if(file==null)return;
        txaTexto.setText(new FileText(file).getText());
    }//GEN-LAST:event_menAbrirActionPerformed

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
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menAbrir;
    private javax.swing.JMenuItem menAcerca;
    private javax.swing.JMenu menArchivo;
    private javax.swing.JMenuItem menGuardar;
    private javax.swing.JMenuItem menNuevo;
    private javax.swing.JMenu menOpciones;
    private javax.swing.JMenuItem menSalir;
    private javax.swing.JTextArea txaTexto;
    // End of variables declaration//GEN-END:variables
}
