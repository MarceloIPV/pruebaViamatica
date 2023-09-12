/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.servicios;

import java.util.List;
import viamaticaPrueba.PruebaMarcelo.modelo.Rol;

/**
 *
 * @author marce
 */
public interface IRolServicios {
     public List<Rol> listarRol();
    
    public Rol buscarRolPorId(Integer idRol);
     
    public Rol guardarRol(Rol rol);
    
    public void eliminarRol(Integer idRol);
}
