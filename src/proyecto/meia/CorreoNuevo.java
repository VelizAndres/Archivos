/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.meia;

import static java.awt.image.ImageObserver.WIDTH;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;





/**
 *
 * @author José De León
 */
public class CorreoNuevo extends javax.swing.JFrame {

    /**
     * Creates new form CorreoNuevo
     */
    public CorreoNuevo() {
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

        txt_asunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_mensaje = new javax.swing.JTextArea();
        btn_enviar = new javax.swing.JButton();
        cb_usuarios = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        btn_buscarlista = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cb_lista = new javax.swing.JComboBox<>();
        btn_Adjunto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_adjunto = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_mensaje.setColumns(20);
        txt_mensaje.setRows(5);
        jScrollPane1.setViewportView(txt_mensaje);

        btn_enviar.setText("ENVIAR");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        jLabel1.setText("PARA:");

        jLabel2.setText("MENSAJE:");

        jLabel3.setText("ASUNTO:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel4.setText("CORREO NUEVO");

        lbl_usuario.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lbl_usuario.setText("---");

        btn_buscar.setText("BUSCAR USUARIOS");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_buscarlista.setText("BUSCAR LISTA");
        btn_buscarlista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarlistaActionPerformed(evt);
            }
        });

        jLabel5.setText("PARA:");

        btn_Adjunto.setText("Buscar Archivo");
        btn_Adjunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdjuntoActionPerformed(evt);
            }
        });

        txt_adjunto.setEditable(false);
        txt_adjunto.setEnabled(false);
        jScrollPane2.setViewportView(txt_adjunto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(36, 36, 36)
                                                .addComponent(cb_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_buscarlista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(36, 36, 36)
                                                .addComponent(cb_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txt_asunto)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Adjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(135, 135, 135))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)))
                .addGap(320, 320, 320))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_usuario)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscarlista)
                    .addComponent(jLabel5)
                    .addComponent(cb_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_asunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Adjunto))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        cb_usuarios.removeAllItems();
        cb_lista.removeAllItems();
        BuscarUsuarios();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_buscarlistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarlistaActionPerformed
        // TODO add your handling code here:
        cb_lista.removeAllItems();
        cb_usuarios.removeAllItems();
        BuscarRegistros();
    }//GEN-LAST:event_btn_buscarlistaActionPerformed

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
         
        String lista="";
        String usuario="";
        if(cb_lista.getSelectedItem()==null)
        {
         usuario = cb_usuarios.getSelectedItem().toString();
        }
        else
        {
            lista = cb_lista.getSelectedItem().toString();
        }
            ArbolBi Binario = new ArbolBi();
 
            if(lista.equals("")&& usuario.equals(""))
            {
            JOptionPane.showMessageDialog(rootPane, "Debe añadir destinatario","Error", ERROR);
            }
            else
            {
            if(txt_asunto.getText().length() <=20 &&txt_mensaje.getText().length()<=100)
             {
                String ArchivoAdjunto = txt_adjunto.getText();
                if(!ArchivoAdjunto.equals(""))        
                {
                   ArchivoAdjunto = GuardarImagen(txt_adjunto.getText());
                }
                if(!lista.equals(""))
                {   
                    ArrayList<String> Contactos_list = ObtenerContactosDeLista(lbl_usuario.getText(),lista);    
                    for(String receptor : Contactos_list)
                    {
                        String[] Registro= Formalizar_Correo(receptor,ArchivoAdjunto);
                        Binario.Insertar(Registro); 
                    }
                }
                if(!usuario.equals(""))
                {
                    String[] Registro= Formalizar_Correo(usuario,ArchivoAdjunto);
                    Binario.Insertar(Registro); 
                }
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "No debe sobrepasar los campos","Error", ERROR);
                }   
            }
        
    }//GEN-LAST:event_btn_enviarActionPerformed

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
            java.util.logging.Logger.getLogger(CorreoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CorreoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CorreoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CorreoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CorreoNuevo().setVisible(true);
            }
        });
    }
    
    
public void BuscarUsuarios()
    {
                ArrayList<String> agregados = LlenarUsuarios("MEIA\\bitacora_usuario.txt","Error");
                for (int i = 0; i < agregados.size(); i++) {
                    cb_usuarios.addItem(agregados.get(i));
                }
                ArrayList<String> agregados2 = LlenarUsuarios("MEIA\\usuario.txt","Error");
                for (int i = 0; i < agregados2.size(); i++) {
                    cb_usuarios.addItem(agregados2.get(i));
                }
                if(agregados.isEmpty() && agregados2.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "No se encontraron usuarios asociados","Error", WIDTH);
                }
    }
public ArrayList<String> LlenarUsuarios(String path, String strError){
        ArrayList<String> lista = new ArrayList<String>();
                
        File Archivo = new File(path);
        if(Archivo.exists()==true)
        {
            FileReader LecturaArchivo;
            try {
                LecturaArchivo = new FileReader(Archivo);
                BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                String Linea="";
                try {
                    Linea = LeerArchivo.readLine();
                    String[] split;
                    while(Linea != null)
                    {
                        if(!"".equals(Linea))
                        {
                            split = Linea.split("\\|");
                            String estatus = split[9];
                            String usuario = split[0];
                            if(estatus.trim().equals("1"))
                            {
                                lista.add(usuario);
                            } 
                        }
                        Linea = LeerArchivo.readLine();
                    }

                    LecturaArchivo.close();
                    LeerArchivo.close();  
                    System.gc();
                } catch (IOException ex) {
                    strError = ex.getMessage();
                }
            } catch (FileNotFoundException ex) {
                strError= ex.getMessage();
            }            
        }
        else
        {
            strError="No existe el archivo";
        }
        return lista;
    }

public void BuscarRegistros()
    {
                ArrayList<String> agregados2 = LlenarListas("MEIA\\Lista_Usuario.txt",lbl_usuario.getText(),"Error");
                for (int i = 0; i < agregados2.size(); i++) {
                    cb_lista.addItem(agregados2.get(i));
                }
                if(agregados2.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "No se encontraron correos asociados","Error", WIDTH);
                }
    }

public ArrayList<String> LlenarListas(String path, String usuario,String strError){
        ArrayList<String> lista = new ArrayList<String>();
                
        File Archivo = new File(path);
        if(Archivo.exists()==true)
        {
            FileReader LecturaArchivo;
            try {
                LecturaArchivo = new FileReader(Archivo);
                BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                String Linea="";
                try {
                    Linea = LeerArchivo.readLine();
                    String[] split;
                    while(Linea != null)
                    {
                        if(!"".equals(Linea))
                        {
                            split = Linea.split("\\|");
                            String estatus = split[5];
                            String user  = split[1];
                            if(estatus.trim().equals("1") && !lista.contains(split[0]) && user.equals(usuario))
                            {
                                lista.add(split[0]);
                            } 
                        }
                        Linea = LeerArchivo.readLine();
                    }

                    LecturaArchivo.close();
                    LeerArchivo.close();  
                    System.gc();
                } catch (IOException ex) {
                    strError = ex.getMessage();
                }
            } catch (FileNotFoundException ex) {
                strError= ex.getMessage();
            }            
        }
        else
        {
            strError="No existe el archivo";
        }
        return lista;
    }




    public String[] Formalizar_Correo(String Contacto, String ArchivoAdjunto )
    {
        Date date = new Date();
        //Caso 3: obtenerhora y fecha y salida por pantalla con formato:
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fecha = hourdateFormat.format(date);
      
        String[] Nuevo_Registro = new String[10];
        Nuevo_Registro[0] =String.format("%-15s", "0");
        Nuevo_Registro[1] =String.format("%-5s", "-1");
        Nuevo_Registro[2] =String.format("%-5s", "-1");
        Nuevo_Registro[3] =String.format("%-20s", lbl_usuario.getText());
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
            String archivo_nuevo = "MEIA\\correos_db\\"+ split[split.length-1];
            
            File destino = new File(archivo_nuevo);
            String path_nuevo = destino.getAbsolutePath();
            
            File temporal = new File(path_nuevo);
                      
            try
            {
                Files.copy(origen.toPath(), temporal.toPath(),REPLACE_EXISTING);
                return split[split.length-1];
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(rootPane, "Falló al cargar el archivo","Error", WIDTH);
            }
            return null;
    }
  
        
        
        ArrayList<String> ObtenerContactosDeLista(String Emisor, String NombreDeLista)
    {
        String path = "MEIA\\Lista_usuario.txt";
        File Archivo = new File(path);
        ArrayList<String> ContactosReceptores = new ArrayList<String>();
        if(Archivo.exists()==true)
        {
            FileReader LecturaArchivo;
            try {
                LecturaArchivo = new FileReader(Archivo);
                BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                String Linea="";
                try {
                    Linea = LeerArchivo.readLine();
                    String[] split;
                    while(Linea != null)
                    {
                        if(!"".equals(Linea))
                        {
                            split = Linea.split("\\|");
                            String estatus = split[5].trim();
                            String nombre_lista= split[0].trim();
                            String usuario= split[1].trim();
                            String destinatario= split[2].trim();
                            
                            if (estatus.equals("1") && usuario.equals(Emisor) && nombre_lista.equals(NombreDeLista))
                            {
                                ContactosReceptores.add(destinatario);
                            }
                        }
                        Linea = LeerArchivo.readLine();
                    }
                    LecturaArchivo.close();
                    LeerArchivo.close();              
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Falló la obtención de los contactos de la lista seleccionada","Error", WIDTH);
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(rootPane, "Falló la obtención de los contactos de la lista seleccionada","Error", WIDTH);
            }            
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Falló la obtención de los contactos de la lista seleccionada debido a que el archivo no existe","Error", WIDTH);
        }
        return ContactosReceptores;
    }
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Adjunto;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_buscarlista;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JComboBox<String> cb_lista;
    private javax.swing.JComboBox<String> cb_usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel lbl_usuario;
    private javax.swing.JTextPane txt_adjunto;
    private javax.swing.JTextField txt_asunto;
    private javax.swing.JTextArea txt_mensaje;
    // End of variables declaration//GEN-END:variables
}
