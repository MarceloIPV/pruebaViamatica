/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.servicios;

import java.util.List;
import viamaticaPrueba.PruebaMarcelo.modelo.RolOpciones;

/**
 *
 * @author marce
 */
public interface IRolOpcionesServicios  {
     public List<RolOpciones> listarRolOpciones();
    
    public RolOpciones buscarRolOpcionesPorId(Integer idRolOpciones);
     
    public RolOpciones guardarRolOpciones(RolOpciones rolOpciones);
    
    public void eliminarRolOpciones(Integer idRolOpciones);
}
