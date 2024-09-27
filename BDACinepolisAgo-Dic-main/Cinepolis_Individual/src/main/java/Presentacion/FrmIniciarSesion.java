/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import DTOs.ClienteBuscarDTO;
import DTOs.ClienteDTO;
import Entidades.ClienteEntidad;
import Negocio.ClienteNegocio;
import Negocio.IClasificacionNegocio;
import Negocio.IClienteNegocio;
import Negocio.IGeneroNegocio;
import Negocio.IPaisNegocio;
import Negocio.IPeliculaNegocio;
import Negocio.NegocioException;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar Arturo Acevedo Acosta 245769
 */
public class FrmIniciarSesion extends javax.swing.JFrame {

    
    private String rutaCinepolisLogo = "src/main/java/utilerias/Imagenes/CinepolisLogo.png";

    FrmInicio inicio;
    IClienteNegocio clienteNegocio;
    IPeliculaNegocio peliculaNegocio;
    IGeneroNegocio generoNegocio;
    IClasificacionNegocio clasificacionNegocio;
    IPaisNegocio paisNegocio;
    
    
    /**
     * Creates new form FrmIniciarSesion
     */
    public FrmIniciarSesion(ClienteNegocio clienteNegocio, FrmInicio inicio, IPeliculaNegocio peliculaNegocio, IGeneroNegocio generoNegocio, IClasificacionNegocio clasificacionNegocio, IPaisNegocio paisNegocio) {
        initComponents();
        
        
        this.clienteNegocio = clienteNegocio;
        this.peliculaNegocio = peliculaNegocio;
        this.generoNegocio = generoNegocio;
        this.clasificacionNegocio = clasificacionNegocio;
        this.paisNegocio=paisNegocio;
        this.inicio = inicio;
        
        setImagenLabel(jblCinepolisLogo, rutaCinepolisLogo);
        
    }
    
    
    
     /**
     * Metodo que coloca una imagen de el logo de cinepolis en la interfaz
     * @param nombreJlb el jlabel que sera reemplazado por una imagen
     * @param ruta la direccion donde se encuentra la imagen
     */
    private void setImagenLabel(JLabel nombreJlb, String ruta){
    
        ImageIcon image = new ImageIcon(ruta);
        
        Icon icon = new ImageIcon(
       image.getImage().getScaledInstance(nombreJlb.getWidth(), nombreJlb.getHeight(), Image.SCALE_DEFAULT));
        
        nombreJlb.setIcon(icon);
        
        this.repaint();
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoTextoCorreo = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        lblCorreo1 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jblCinepolisLogo = new javax.swing.JLabel();
        pwdContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion");

        campoTextoCorreo.setBackground(new java.awt.Color(136, 201, 239));

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreo.setText("Correo Electronico");

        lblCorreo1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCorreo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreo1.setText("Contraseña");

        btnIniciarSesion.setBackground(new java.awt.Color(8, 148, 249));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(8, 148, 249));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 127));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jblCinepolisLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jblCinepolisLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pwdContrasena.setBackground(new java.awt.Color(136, 201, 239));
        pwdContrasena.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoTextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(pwdContrasena))))
                .addGap(138, 138, 138))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoTextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pwdContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:

        if (campoTextoCorreo.getText().equals("admin")){
                FrmPantallaAdmin admin = new FrmPantallaAdmin(this, peliculaNegocio, (ClienteNegocio) clienteNegocio, generoNegocio, clasificacionNegocio, paisNegocio);
                admin.setVisible(true);
                this.setVisible(false);

          }
        
        else{
        
        ClienteDTO clienteEncontrado = new ClienteDTO();
        
        String correo = campoTextoCorreo.getText();
        String contra = pwdContrasena.getText();
        System.out.println(campoTextoCorreo.getText());

        ClienteBuscarDTO clienteBuscado = new ClienteBuscarDTO();
        clienteBuscado.setCorreo(correo);
        clienteBuscado.setContrasena(contra);



          

            try {
            
            clienteEncontrado = clienteNegocio.buscarCliente(clienteBuscado);
            
            clienteBuscado.setApellidoMaterno(clienteEncontrado.getApellidoMaterno());
            clienteBuscado.setApellidoPaterno(clienteEncontrado.getApellidoPaterno());
            clienteBuscado.setNacimiento(clienteEncontrado.getNacimiento());
            clienteBuscado.setNombres(clienteEncontrado.getNombres());
            clienteBuscado.setIdCliente(clienteEncontrado.getIdCliente());
            clienteBuscado.setCiudad(clienteEncontrado.getCiudad());

            System.out.println(" valid");

                if(campoTextoCorreo.getText().equals(clienteBuscado.getCorreo()) && pwdContrasena.getText().equals(clienteBuscado.getContrasena())){

                    System.out.println(clienteBuscado.getIdCliente());
                    FrmCartelera cartelera = new FrmCartelera();

                    cartelera.setVisible(true);

                    this.setVisible(false);
                }

                else{
                    JOptionPane.showMessageDialog(this, "Cliente no encontrado");
                }

            
        } catch (NegocioException ex) {
            Logger.getLogger(FrmIniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }
            
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:

        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField campoTextoCorreo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jblCinepolisLogo;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreo1;
    private javax.swing.JPasswordField pwdContrasena;
    // End of variables declaration//GEN-END:variables
}
