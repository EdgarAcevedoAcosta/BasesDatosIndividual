/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import DTOs.PeliculaDTO;
import DTOs.PeliculaGuardarDTO;
import Negocio.IClasificacionNegocio;
import Negocio.IClienteNegocio;
import Negocio.IGeneroNegocio;
import Negocio.IPaisNegocio;
import Negocio.IPeliculaNegocio;
import Negocio.NegocioException;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar Arturo Acevedo Acosta 245769
 */
public class FrmNuevaPelicula extends javax.swing.JFrame {

    FrmModificarPelicula modificarPeli;
    IPeliculaNegocio peliculaNegocio;
    IGeneroNegocio generoNegocio;
    IPaisNegocio paisNegocio;
    IClasificacionNegocio clasificacionNegocio;
    IClienteNegocio clienteNegocio;
    
    /**
     * Creates new form FrmNuevaPelicula
     * @param modificarPeli
     * @param peliculaNegocio
     * @param clienteNegocio
     * @param generoNegocio
     * @param clasificacionNegocio
     * @param paisNegocio
     */
    public FrmNuevaPelicula(FrmModificarPelicula modificarPeli, IPeliculaNegocio peliculaNegocio, IClienteNegocio clienteNegocio, IGeneroNegocio generoNegocio, IClasificacionNegocio clasificacionNegocio, IPaisNegocio paisNegocio) {
        initComponents();
        
        this.peliculaNegocio = peliculaNegocio;
        this.modificarPeli = modificarPeli;
        this.clienteNegocio=clienteNegocio;
        this.generoNegocio=generoNegocio;
        this.clasificacionNegocio=clasificacionNegocio;
        this.paisNegocio = paisNegocio;
        
        try {
            cargarMetodosIniciales();
        } catch (NegocioException ex) {
            Logger.getLogger(FrmRegistrarse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void cargarMetodosIniciales() throws NegocioException{
        cargarClasificaciones();
        cargarGeneros();
        cargarPaises();
    }

    
    
    private void setImagenLabel(JLabel nombreJlb, String ruta) throws MalformedURLException{
    
        URL url;
        url = new URL(ruta);
        
            
        ImageIcon image = new ImageIcon(url);
        
        Icon icon = new ImageIcon(
        image.getImage().getScaledInstance(nombreJlb.getWidth(), nombreJlb.getHeight(), Image.SCALE_DEFAULT));
        
        nombreJlb.setIcon(icon);
        
        this.repaint();
   
    }
    
    private void cargarGeneros() throws NegocioException {
            
        try {
            List<String> generos = generoNegocio.obtenerGeneros();
            for (String genero : generos) {
                cbcGenero.addItem(genero);
            }
        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar los generos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cargarPaises() throws NegocioException {
            
        try {
            List<String> paises = paisNegocio.obtenerPaises();
            for (String pais : paises) {
                cbcPais.addItem(pais);
            }
        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar los paises: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cargarClasificaciones() throws NegocioException {
            
        try {
            List<String> clasificaciones = clasificacionNegocio.obtenerClasificaciones();
            for (String clasificacion : clasificaciones) {
                cbcClasificacion.addItem(clasificacion);
            }
        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar las clasificaciones: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoTextoTitulo = new javax.swing.JTextField();
        cbcPais = new javax.swing.JComboBox<>();
        campoTextoSinopsis = new javax.swing.JTextField();
        cbcClasificacion = new javax.swing.JComboBox<>();
        cbcGenero = new javax.swing.JComboBox<>();
        campoTextoDuracion = new javax.swing.JTextField();
        campoTextoLinkImagen = new javax.swing.JTextField();
        jblImagen = new javax.swing.JLabel();
        btnCargarImagen = new javax.swing.JButton();
        campoTextoLinkTrailer = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblSinopsis = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        lblClasificacion = new javax.swing.JLabel();
        lblDuracion = new javax.swing.JLabel();
        lblLinkTrailer = new javax.swing.JLabel();
        lblLinkImagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblSinopsis1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Pelicula");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        campoTextoTitulo.setBackground(new java.awt.Color(136, 201, 239));

        cbcPais.setBackground(new java.awt.Color(136, 201, 239));

        campoTextoSinopsis.setBackground(new java.awt.Color(136, 201, 239));

        cbcClasificacion.setBackground(new java.awt.Color(136, 201, 239));

        cbcGenero.setBackground(new java.awt.Color(136, 201, 239));

        campoTextoDuracion.setBackground(new java.awt.Color(136, 201, 239));

        campoTextoLinkImagen.setBackground(new java.awt.Color(136, 201, 239));
        campoTextoLinkImagen.setMaximumSize(new java.awt.Dimension(64, 22));
        campoTextoLinkImagen.setPreferredSize(new java.awt.Dimension(64, 169));

        jblImagen.setText("jLabel1");
        jblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCargarImagen.setText("Cargar");
        btnCargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarImagenActionPerformed(evt);
            }
        });

        campoTextoLinkTrailer.setBackground(new java.awt.Color(136, 201, 239));

        btnRegresar.setBackground(new java.awt.Color(8, 148, 249));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(51, 255, 51));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblTitulo.setText("Titulo");

        lblSinopsis.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblSinopsis.setText("Sinopsis");

        lblGenero.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblGenero.setText("Genero");

        lblPais.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblPais.setText("Pais");

        lblClasificacion.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblClasificacion.setText("Clasificacion");

        lblDuracion.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblDuracion.setText("Duracion");

        lblLinkTrailer.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblLinkTrailer.setText("Link Trailer");

        lblLinkImagen.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblLinkImagen.setText("Link Imagen");

        lblSinopsis1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblSinopsis1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSinopsis1.setText("Agregar Pelicula");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSinopsis1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblSinopsis1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoTextoTitulo)
                                .addComponent(cbcPais, 0, 180, Short.MAX_VALUE)
                                .addComponent(campoTextoLinkTrailer)
                                .addComponent(lblLinkTrailer, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPais, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLinkImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbcClasificacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoTextoSinopsis)
                                .addComponent(campoTextoLinkImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnRegresar)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbcGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblDuracion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoTextoDuracion, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jblImagen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGuardar))
                .addGap(52, 52, 52))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCargarImagen)
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoSinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbcGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbcPais, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbcClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblLinkTrailer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblLinkImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoTextoLinkImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2))
                        .addComponent(campoTextoLinkTrailer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCargarImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnGuardar))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:

        this.dispose();
        modificarPeli.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String titulo = campoTextoTitulo.getText();
        int duracion = Integer.parseInt(campoTextoDuracion.getText());
        String sinopsis = campoTextoSinopsis.getText();
        String linkTrailer = campoTextoLinkTrailer.getText();
        String linkImagen = campoTextoLinkImagen.getText();
        int genero = cbcGenero.getSelectedIndex() + 1;
        int clasificacion = cbcClasificacion.getSelectedIndex() + 1;
        int pais = cbcPais.getSelectedIndex() + 1;
        
        
        PeliculaGuardarDTO pelicula = new PeliculaGuardarDTO();
        pelicula.setClasificacion_id(clasificacion);
        pelicula.setDuracion(duracion);
        pelicula.setGenero_id(genero);
        pelicula.setLink_imagen(linkImagen);
        pelicula.setPais_id(pais);
        pelicula.setSinopsis(sinopsis);
        pelicula.setTitulo(titulo);
        pelicula.setTrailer(linkTrailer);
                
                
                
        try {
            peliculaNegocio.guardar(pelicula);
            JOptionPane.showMessageDialog(this, "Pelicula agregada");
            this.dispose();
            modificarPeli.setVisible(true);
        } catch (NegocioException ex) {
            Logger.getLogger(FrmNuevaPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarImagenActionPerformed
        try {
            // TODO add your handling code here:

            this.setImagenLabel(jblImagen, campoTextoLinkImagen.getText());
        } catch (MalformedURLException ex) {
            Logger.getLogger(FrmNuevaPelicula.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Direccion de imagen no valida");
        }
        
        
    }//GEN-LAST:event_btnCargarImagenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarImagen;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField campoTextoDuracion;
    private javax.swing.JTextField campoTextoLinkImagen;
    private javax.swing.JTextField campoTextoLinkTrailer;
    private javax.swing.JTextField campoTextoSinopsis;
    private javax.swing.JTextField campoTextoTitulo;
    private javax.swing.JComboBox<String> cbcClasificacion;
    private javax.swing.JComboBox<String> cbcGenero;
    private javax.swing.JComboBox<String> cbcPais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jblImagen;
    private javax.swing.JLabel lblClasificacion;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblLinkImagen;
    private javax.swing.JLabel lblLinkTrailer;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblSinopsis;
    private javax.swing.JLabel lblSinopsis1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
