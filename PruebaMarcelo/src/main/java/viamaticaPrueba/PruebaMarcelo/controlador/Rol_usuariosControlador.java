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
import viamaticaPrueba.PruebaMarcelo.modelo.Rol_usuarios;
import viamaticaPrueba.PruebaMarcelo.servicios.Rol_usuariosServicios;

/**
 *
 * @author marce
 */

//Implementacion del Api-Rest metodos Crud tabla rolusuarios



@RestController
@RequestMapping("/rolusuarios")
public class Rol_usuariosControlador {
        @Autowired
        private Rol_usuariosServicios rol_usuariosServicios;

        @GetMapping("/listarTodoRolusuarios")
        public List<Rol_usuarios> listaRol_usuario() {
            return rol_usuariosServicios.listaRol_usuario();
        }
        
       
        @GetMapping("/listarRolusuariosPorId/{idRol_usuario}")
        public Rol_usuarios buscarRol_usuarioPorId(@PathVariable Integer idRol_usuario) {
            return rol_usuariosServicios.buscarRol_usuarioPorId(idRol_usuario);
        }
        
        @PostMapping("/guardarRolusuarios")
        public Rol_usuarios guardarRol_usuarioOpciones(@RequestBody Rol_usuarios rol_usuario) {
            return rol_usuariosServicios.guardarRol_usuarioOpciones(rol_usuario);
        }
        
        @DeleteMapping("/eliminarRolusuarios/{idRol_usuario}")
        public void eliminarRol_usuario(@PathVariable Integer idRol_usuario){
             rol_usuariosServicios.eliminarRol_usuario(idRol_usuario);
            
        }
}
