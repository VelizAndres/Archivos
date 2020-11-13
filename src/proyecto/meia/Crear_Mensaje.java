/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.meia;

import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrés Véliz
 */
public class Crear_Mensaje extends javax.swing.JFrame {

    /**
     * Creates new form Crear_Mensaje
     */
    public Crear_Mensaje() {
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

        lb_usuario = new javax.swing.JLabel();
        btn_Adjunto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_adjunto = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_mensaje = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_enviar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_asunto = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_usuario.setText("Usuario");

        btn_Adjunto.setText("Buscar Archivo");
        btn_Adjunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdjuntoActionPerformed(evt);
            }
        });

        txt_adjunto.setEditable(false);
        txt_adjunto.setEnabled(false);
        jScrollPane1.setViewportView(txt_adjunto);

        jScrollPane2.setViewportView(txt_mensaje);

        jLabel1.setText("Mensaje:");

        jLabel2.setText("Destinatario");

        btn_enviar.setText("Enviar Mensaje");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );

        jLabel3.setText("Asunto:");

        jScrollPane3.setViewportView(txt_asunto);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel4.setText("MENSAJE NUEVO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_Adjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2)))
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(lb_usuario)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_usuario)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(99, 99, 99))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Adjunto))
                .addGap(49, 49, 49)
                .addComponent(btn_enviar)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AdjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdjuntoActionPerformed
        JFileChooser ventana = new JFileChooser();
        File fichero;
        String ruta;
        int valor = ventana.showOpenDialog(this);
        if(valor == JFileChooser.APPROVE_OPTION){
            fichero = ventana.getSelectedFile();
            ruta = fichero.getAbsolutePath();
            txt_adjunto.setText(ruta);
        }
    }//GEN-LAST:event_btn_AdjuntoActionPerformed

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
      
        if(txt_asunto.getText().length() <=20 &&txt_mensaje.getText().length()<=100)
        {
            String ArchivoAdjunto = txt_adjunto.getText();
            if(!ArchivoAdjunto.equals(""))        
            {
               ArchivoAdjunto = GuardarImagen(txt_adjunto.getText());
            }
            
            ArbolBi Binario = new ArbolBi();
            //Aqui se debe definir si es lista o contacto individual
        
           // Esto es lo que debes usar 
            String Usuario_receptor="";//Agregar javier
            String[] Registro= Formalizar_Correo(Usuario_receptor,ArchivoAdjunto);
            Binario.Insertar(Registro); 
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "No debe sobrepasar los campos","Error", ERROR);
        }
        
        
        
        
       
        
    }//GEN-LAST:event_btn_enviarActionPerformed
    
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
            java.util.logging.Logger.getLogger(Crear_Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_Mensaje().setVisible(true);
            }
        });
    }

    
    
    public String[] Formalizar_Correo(String Contacto, String ArchivoAdjunto )
    {
        Date date = new Date();
        //Caso 3: obtenerhora y fecha y salida por pantalla con formato:
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fecha = hourdateFormat.format(date);
      
        String[] Nuevo_Registro = new String[10];
        Nuevo_Registro[0] =String.format("%-15s", "");
        Nuevo_Registro[1] =String.format("%-5s", "-1");
        Nuevo_Registro[2] =String.format("%-5s", "-1");
        Nuevo_Registro[3] =String.format("%-20s", lb_usuario);
        Nuevo_Registro[4] =String.format("%-20s", Contacto);
        Nuevo_Registro[5] =String.format("%-20s", fecha);
        Nuevo_Registro[6] =String.format("%-20s", txt_asunto.getText());
        Nuevo_Registro[7] =String.format("%-100s", txt_mensaje.getText());
        Nuevo_Registro[8] =String.format("%-25s", ArchivoAdjunto);
        Nuevo_Registro[9] =String.format("%-10s", "1");
   
        return Nuevo_Registro;
    }
    
    
    
    
    
    
    
    
       String GuardarImagen(String ruta){
            File origen = new File(ruta);
            String[] split = ruta.split("\\\\");
            //int posicion = ruta.lastIndexOf("");
            //String extension = ruta.substring(posicion);
            String archivo_nuevo = "MEIA\\correo_db\\"+ split[split.length-1];
            
            File destino = new File(archivo_nuevo);
            String path_nuevo = destino.getAbsolutePath();
            
            File temporal = new File(path_nuevo);
                      
            try
            {
                Files.copy(origen.toPath(), temporal.toPath(),REPLACE_EXISTING);
                return path_nuevo;
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(rootPane, "Falló al cargar el archivo","Error", WIDTH);
            }
            return null;
    }
  
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Adjunto;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JLabel lb_usuario;
    private javax.swing.JTextPane txt_adjunto;
    private javax.swing.JTextPane txt_asunto;
    private javax.swing.JTextPane txt_mensaje;
    // End of variables declaration//GEN-END:variables
}
