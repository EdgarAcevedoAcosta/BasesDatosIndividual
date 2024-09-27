/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

/**
 *
 * @author Edgar Arturo Acevedo Acosta 245769
 */
public class SalaDAO {
    double Precio;
    int minutosLimpieza;
    String nombre;
    int numeroAsientosDisponibles;

    public SalaDAO(double Precio, int minutosLimpieza, String nombre, int numeroAsientosDisponibles) {
        this.Precio = Precio;
        this.minutosLimpieza = minutosLimpieza;
        this.nombre = nombre;
        this.numeroAsientosDisponibles = numeroAsientosDisponibles;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getMinutosLimpieza() {
        return minutosLimpieza;
    }

    public void setMinutosLimpieza(int minutosLimpieza) {
        this.minutosLimpieza = minutosLimpieza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroAsientosDisponibles() {
        return numeroAsientosDisponibles;
    }

    public void setNumeroAsientosDisponibles(int numeroAsientosDisponibles) {
        this.numeroAsientosDisponibles = numeroAsientosDisponibles;
    }
    
}
