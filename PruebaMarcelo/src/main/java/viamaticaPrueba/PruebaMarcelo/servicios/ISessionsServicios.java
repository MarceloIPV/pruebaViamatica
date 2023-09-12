/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.servicios;

import java.util.List;
import viamaticaPrueba.PruebaMarcelo.modelo.Sessions;

/**
 *
 * @author marce
 */
public interface ISessionsServicios {
    public List<Sessions> listarSesiones();
    
    public Sessions buscarSesionesPorId(Integer idSession);
     
    public Sessions guardarSesiones(Sessions sesiones);
    
    public void eliminarSesiones(Sessions sesiones);
}
