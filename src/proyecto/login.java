package proyecto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Metodos_sql.Metodos_sql;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author LUZ
 */
public class login extends javax.swing.JFrame {
    
    private String usuarios;
    private String contraseña;
    Metodos_sql metodos = new Metodos_sql();
    private String alerta = "";
    
    private void setUsuarios(String correo) {
        
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(correo);

        if (!correo.isEmpty()) {
            if (mather.find() == true) {
                this.usuarios = correo;
            } else {
                this.alerta += "Correo: Ingresa un correo valido" + "\n";
            }
        } else {
            this.alerta += "Correo: Ingrese un valor\n";
                  
        }
        this.usuarios = correo;
    }
    
    private void setAlerta(String alerta) {
        this.alerta = alerta;
    }
    
    private void setContraseña(String contraseña) {
        if (!contraseña.isEmpty()) {
            this.contraseña = contraseña;
        }else{
            this.alerta += "Contraseña: Ingresa algun valor" + "\n";
        }
    }
    
    private String verAlerta() {
        return this.alerta;
    }
    
    private boolean inciarSesion (){
        boolean valido=false;
        int mensaje;
             
             mensaje=metodos.buscarUsuarioRegistrado(this.usuarios,this.contraseña);
             System.out.println("Validando sesión"); 
             if(mensaje == 1){
                 valido=true;
             }else{
                 valido=false;
             }
        return valido;
    }
    
    private String nombreUsuarios(){
        return this.metodos.buscarNombre(this.usuarios);
    }
    
    /**
     * Creates new form login
     */
    public login() {
        //Centramos la app
        initComponents();
           this.setLocationRelativeTo(null);
    }
//instanciamos
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Inicia Sesión.");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(510, 60, 240, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/certus2.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 10, 750, 660);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/user (1).png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(787, 136, 64, 64);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/password (1).png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(799, 299, 64, 64);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("¡Hola!");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(787, 43, 66, 29);

        txtCorreo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 153));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo);
        txtCorreo.setBounds(800, 220, 262, 55);

        txtContraseña.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(0, 0, 153));
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña);
        txtContraseña.setBounds(800, 390, 270, 52);

        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(755, 603, 105, 37);

        jButton2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton2.setText("REGISTRATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(896, 603, 187, 37);

        jButton3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton3.setText("INGRESAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1101, 603, 159, 37);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Ingresa tus datos ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(787, 81, 206, 29);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Usuario");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(877, 160, 89, 29);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("Contraseña");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(872, 321, 131, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1275, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      registrarse registarse=new registrarse();
      registarse.setVisible(true);  
      dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     System.exit(0);     // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//creamos las cantidades de usuarios
      this.setUsuarios(txtCorreo.getText());
      this.setContraseña(txtContraseña.getText());
      
      if(this.verAlerta().length() < 1){
          if(this.inciarSesion()== true ){
          JOptionPane.showMessageDialog(this,"Bienvenido (a) \n" + nombreUsuarios());
             menu menu = new menu();
             menu.lblnombre.setText(nombreUsuarios());
               menu.setVisible(true);
             this.dispose();
        }else{
             JOptionPane.showMessageDialog(this,"el usuario no se encuentra registrado, porfavor  debe  registrarse");
              
        }
      }else{
          JOptionPane.showMessageDialog(this, this.verAlerta());
                this.setAlerta("");
      }
      
      
}
     
      
       //String [] Usuarios={"luz","joao"};
       //String [] Claves=new String[2];
       //Claves[0]="12345";//clave de luz
       //Claves[1]="123456789";//clave de joao 
       
       //String usuario=txtusuario.getText();
       //String password=txtcontraseña.getText();
       /*boolean mensaje=false;
       for (int i =0; i < Usuarios.length;i++){
           if(Usuarios[i].equals(usuario)&&Claves[i].equals(password)){
               mensaje=true;
              
               
           }
       }
        if(mensaje){
            menu menu=new menu();
              menu.setVisible(true);
              dispose();
        }else{
            JOptionPane.showMessageDialog(null,"USUARIO O CONTRASEÑA INCORRECTA");
           txtusuario.setText("");
           txtcontraseña.setText("");
           
                 
        } 
        
       
     
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
