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
import viamaticaPrueba.PruebaMarcelo.modelo.Rol;
import viamaticaPrueba.PruebaMarcelo.servicios.RolServicios;


/**
 *
 * @author marce
 */

@RestController
@RequestMapping("/rol")
public class RolControlador {
    
      @Autowired
        private RolServicios rolServicios;

        @GetMapping("/listarTodoRol")
        public List<Rol> listarRol() {
            return rolServicios.listarRol();
        }
        
       
        @GetMapping("/listarRolPorId/{idRol}")
        public Rol buscarRolPorId(@PathVariable Integer idRol) {
            return rolServicios.buscarRolPorId(idRol);
        }
        
        @PostMapping("/guardarRol")
        public Rol guardarRol(@RequestBody Rol rol) {
            return rolServicios.guardarRol(rol);
        }
        
        @DeleteMapping("/eliminarRol/{idRol}")
        public void eliminarRol(@PathVariable Integer idRol){
             rolServicios.eliminarRol(idRol);
            
        }
        
    
}
