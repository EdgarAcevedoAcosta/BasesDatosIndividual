/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Negocio;

import DTOs.FuncionDTO;
import DTOs.FuncionFiltroTablaDTO;
import DTOs.FuncionGuardarDTO;
import DTOs.FuncionTablaDTO;
import java.util.List;

/**
 *
 * @author Edgar Arturo Acevedo Acosta 245769
 */
public interface IFuncionNegocio {
    
    List<FuncionTablaDTO> buscarFuncionesTabla(FuncionFiltroTablaDTO filtro) throws NegocioException;
    
    FuncionDTO guardar(FuncionGuardarDTO funcion) throws NegocioException;
    
    FuncionDTO eliminar(int idFuncion) throws NegocioException;
}
