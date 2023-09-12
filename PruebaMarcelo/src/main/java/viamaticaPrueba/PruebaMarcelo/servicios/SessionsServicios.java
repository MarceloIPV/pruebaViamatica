/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import viamaticaPrueba.PruebaMarcelo.modelo.Sessions;
import viamaticaPrueba.PruebaMarcelo.modelo.repositorio.SessionsRepositorio;
import viamaticaPrueba.PruebaMarcelo.modelo.repositorio.UsuariosRepositorio;

/**
 *
 * @author marce
 */

//Funcionalidad Crud tabla sessions

@Service
public class SessionsServicios implements ISessionsServicios{

    @Autowired
    private SessionsRepositorio sessionsRepositorio;
    
    @Override
    public List<Sessions> listarSesiones() {
        return sessionsRepositorio.findAll();
    }

    @Override
    public Sessions buscarSesionesPorId(Integer idSession) {
        return sessionsRepositorio.findById(idSession).orElse(null);
    }

    @Override
    public Sessions guardarSesiones(Sessions sesiones) {
        return sessionsRepositorio.save(sesiones);
    }

    @Override
    public void eliminarSesiones(Integer idSession) {
        sessionsRepositorio.deleteById(idSession);
    }
    
}
