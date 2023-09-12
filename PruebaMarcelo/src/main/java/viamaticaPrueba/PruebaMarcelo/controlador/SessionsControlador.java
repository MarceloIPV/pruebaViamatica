/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import viamaticaPrueba.PruebaMarcelo.modelo.Sessions;
import viamaticaPrueba.PruebaMarcelo.servicios.SessionsServicios;

/**
 *
 * @author marce
 */

@RestController
@RequestMapping("/sessions")
public class SessionsControlador {
        @Autowired
        private SessionsServicios sessionsServicios;

        @GetMapping("/listarTodoSessions")
        public  List<Sessions> listarSesiones() {
            return sessionsServicios.listarSesiones();
        }
        
       
        @GetMapping("/listarRolRolOpcionesPorId/{idSession}")
        public Sessions buscarSesionesPorId(@PathVariable Integer idSession) {
            return sessionsServicios.buscarSesionesPorId(idSession);
        }
        
        @PostMapping("/guardarSessions")
        public Sessions guardarSesiones(@RequestBody Sessions sesiones) {
            return sessionsServicios.guardarSesiones(sesiones);
        }
        
        @DeleteMapping("/eliminarSessions/{idSession}")
        public void eliminarSesiones(@PathVariable Integer idSession){
             sessionsServicios.eliminarSesiones(idSession);
            
        }
}
