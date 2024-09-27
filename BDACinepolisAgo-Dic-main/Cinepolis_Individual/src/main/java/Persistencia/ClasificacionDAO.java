/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edgar Arturo Acevedo Acosta 245769
 */
public class ClasificacionDAO implements IClasificacionDAO {

    private IConexionBD conexionBD;
    private Connection conexionGeneral;

    public ClasificacionDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public List<String> obtenerClasificaciones() throws PersistenciaException {
        List<String> clasificaciones = new ArrayList<>();
        Connection conexion = null;
        Statement comandoSQL = null;
        ResultSet resultado = null;

        try {
            conexion = this.conexionBD.crearConexion();
            // se modifica el select
            String codigoSQL = "SELECT nombre FROM Clasificacion";
            comandoSQL = conexion.createStatement();
            resultado = comandoSQL.executeQuery(codigoSQL);

            while (resultado.next()) {
                clasificaciones.add(resultado.getString("nombre"));
            }
            return clasificaciones;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos de clasificaciones, inténtelo de nuevo.");
        } finally {
            try {
                if (resultado != null) {
                    resultado.close();
                }
                if (comandoSQL != null) {
                    comandoSQL.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                throw new PersistenciaException("Error al cerrar los recursos: " + e.getMessage());
            }
        }
    }

}
