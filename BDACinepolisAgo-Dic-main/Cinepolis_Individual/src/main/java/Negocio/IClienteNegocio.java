/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Negocio;

import DTOs.ClienteBuscarDTO;
import DTOs.ClienteDTO;
import DTOs.ClienteGuardarDTO;
import java.util.List;

/**
 *
 * @author Edgar Arturo Acevedo Acosta 245769
 */
public interface IClienteNegocio {
 
    ClienteDTO guardar(ClienteGuardarDTO cliente) throws NegocioException;
    
    ClienteDTO buscarCliente(ClienteBuscarDTO cliente) throws NegocioException;

    
}
