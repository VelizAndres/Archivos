/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.meia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrés Véliz
 */
public class MantenimientoLista_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form MantenimientoLista_Usuario
     */
    public MantenimientoLista_Usuario() {
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

        btn_buscarContactos = new javax.swing.JButton();
        cb_contactos = new javax.swing.JComboBox<>();
        cb_listas = new javax.swing.JComboBox<>();
        btn_buscarListas = new javax.swing.JButton();
        lb_usuario_principal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_buscarContactos.setText("Buscar Contactos");
        btn_buscarContactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarContactosActionPerformed(evt);
            }
        });

        cb_contactos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cb_listas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_buscarListas.setText("Buscar Listas");
        btn_buscarListas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarListasActionPerformed(evt);
            }
        });

        lb_usuario_principal.setText("Black");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("MENÚ MANTENIMIENTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(lb_usuario_principal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_contactos, 0, 165, Short.MAX_VALUE)
                            .addComponent(cb_listas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_buscarContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscarListas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_usuario_principal)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_contactos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscarListas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_listas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarContactosActionPerformed
            cb_contactos.removeAllItems();
            BuscarContactos();
    }//GEN-LAST:event_btn_buscarContactosActionPerformed

    private void btn_buscarListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarListasActionPerformed
        cb_listas.removeAllItems();
        BuscarListas();
    }//GEN-LAST:event_btn_buscarListasActionPerformed

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
            java.util.logging.Logger.getLogger(MantenimientoLista_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoLista_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoLista_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoLista_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimientoLista_Usuario().setVisible(true);
            }
        });
    }

    
    
    
        public void BuscarContactos()
    {
                ArrayList<String> agregados = LlenarAdmin_Contactos("MEIA\\bitacora_contactos.txt",lb_usuario_principal.getText(),"Error");
                for (int i = 0; i < agregados.size(); i++) {
                    cb_contactos.addItem(agregados.get(i));
                }
                ArrayList<String> agregados2 = LlenarAdmin_Contactos("MEIA\\contactos.txt",lb_usuario_principal.getText(),"Error");
                for (int i = 0; i < agregados2.size(); i++) {
                    cb_contactos.addItem(agregados2.get(i));
                }
                if(agregados.isEmpty() && agregados2.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "No se encontraron registros asociados","Error", WIDTH);
                }
    }
        
        
      public ArrayList<String> LlenarAdmin_Contactos(String path, String usuario,String strError){
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
                            String estatus = split[4];
                            
                            String current_user = split[0].trim();
                            if(usuario.trim().equals(current_user) && estatus.trim().equals("1"))
                            {
                                lista.add(Linea);
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
    
          public void BuscarListas()
    {
                ArrayList<String> agregados = LlenarAdmin_Listas("MEIA\\bitacora_lista.txt",lb_usuario_principal.getText(),"Error");
                for (int i = 0; i < agregados.size(); i++) {
                    cb_listas.addItem(agregados.get(i));
                }
                ArrayList<String> agregados2 = LlenarAdmin_Listas("MEIA\\lista.txt",lb_usuario_principal.getText(),"Error");
                for (int i = 0; i < agregados2.size(); i++) {
                    cb_listas.addItem(agregados2.get(i));
                }
                if(agregados.isEmpty() && agregados2.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "No se encontraron registros asociados","Error", WIDTH);
                }
    }
        
        
      public ArrayList<String> LlenarAdmin_Listas(String path, String usuario,String strError){
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
                            
                            String current_user = split[1].trim();
                            if(usuario.trim().equals(current_user) && estatus.trim().equals("1"))
                            {
                                lista.add(Linea);
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
  
      
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarContactos;
    private javax.swing.JButton btn_buscarListas;
    private javax.swing.JComboBox<String> cb_contactos;
    private javax.swing.JComboBox<String> cb_listas;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel lb_usuario_principal;
    // End of variables declaration//GEN-END:variables
}