/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.servicios;

import java.util.List;
import viamaticaPrueba.PruebaMarcelo.modelo.Rol_rolOpciones;

/**
 *
 * @author marce
 */
public interface IRol_rolOpcionesServicios  {
    
    public List<Rol_rolOpciones> listarRol_rolOpciones();
    
    public Rol_rolOpciones buscarRol_rolOpcionesPorId(Integer idRolOpciones);
     
    public Rol_rolOpciones guardarRol_rolOpcionesOpciones(Rol_rolOpciones rolOpciones);
    
    public void eliminarRol_rolOpcionesOpciones(Integer idRolOpciones);
}
