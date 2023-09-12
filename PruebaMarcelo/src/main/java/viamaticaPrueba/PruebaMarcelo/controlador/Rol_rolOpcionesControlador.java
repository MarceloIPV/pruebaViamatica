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
import viamaticaPrueba.PruebaMarcelo.modelo.Rol_rolOpciones;
import viamaticaPrueba.PruebaMarcelo.servicios.Rol_rolOpcionesServicios;

/**
 *
 * @author marce
 */

//Implementacion del Api-Rest metodos Crud tabla rolRolOpciones


@RestController
@RequestMapping("/rolRolOpciones")
public class Rol_rolOpcionesControlador {
        @Autowired
        private Rol_rolOpcionesServicios rol_rolOpcionesServicios;

        @GetMapping("/listarTodoRolRolOpciones")
        public  List<Rol_rolOpciones> listarRol_rolOpciones() {
            return rol_rolOpcionesServicios.listarRol_rolOpciones();
        }
        
       
        @GetMapping("/listarRolRolOpcionesPorId/{idRol_rolOpciones}")
        public Rol_rolOpciones buscarRol_rolOpcionesPorId(@PathVariable Integer idRol_rolOpciones) {
            return rol_rolOpcionesServicios.buscarRol_rolOpcionesPorId(idRol_rolOpciones);
        }
        
        @PostMapping("/guardarRolRolOpciones")
        public Rol_rolOpciones guardarRol_rolOpcionesOpciones(@RequestBody Rol_rolOpciones rolOpciones) {
            return rol_rolOpcionesServicios.guardarRol_rolOpcionesOpciones(rolOpciones);
        }
        
        @DeleteMapping("/eliminarRolRolOpciones/{idRol_rolOpciones}")
        public void eliminarRol_rolOpcionesOpciones(@PathVariable Integer idRol_rolOpciones){
             rol_rolOpcionesServicios.eliminarRol_rolOpcionesOpciones(idRol_rolOpciones);
            
        }
}
