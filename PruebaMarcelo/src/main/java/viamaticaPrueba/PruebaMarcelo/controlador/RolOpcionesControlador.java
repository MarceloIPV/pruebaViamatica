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
import viamaticaPrueba.PruebaMarcelo.modelo.RolOpciones;
import viamaticaPrueba.PruebaMarcelo.servicios.RolOpcionesServicios;

/**
 *
 * @author marce
 */

//Implementacion del Api-Rest metodos Crud tabla rolOpciones

@RestController
@RequestMapping("/rolOpciones")
public class RolOpcionesControlador {
    @Autowired
        private RolOpcionesServicios rolOpcionesServicios;

        @GetMapping("/listarTodoRolOpciones")
        public List<RolOpciones> listarRolOpciones() {
            return rolOpcionesServicios.listarRolOpciones();
        }
        
       
        @GetMapping("/listarRolOpcionesPorId/{idRolOpciones}")
        public RolOpciones buscarRolOpcionesPorId(@PathVariable Integer idRolOpciones) {
            return rolOpcionesServicios.buscarRolOpcionesPorId(idRolOpciones);
        }
        
        @PostMapping("/guardarRolOpciones")
        public RolOpciones guardarRolOpciones(@RequestBody RolOpciones rolOpciones) {
            return rolOpcionesServicios.guardarRolOpciones(rolOpciones);
        }
        
        @DeleteMapping("/eliminarRolOpciones/{idRolOpciones}")
        public void eliminarRolOpciones(@PathVariable Integer idRolOpciones){
             rolOpcionesServicios.eliminarRolOpciones(idRolOpciones);
            
        }
        
}
