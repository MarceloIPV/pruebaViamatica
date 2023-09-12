package viamaticaPrueba.PruebaMarcelo.controlador;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import viamaticaPrueba.PruebaMarcelo.modelo.Usuarios;
import viamaticaPrueba.PruebaMarcelo.servicios.UsuariosServicios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marce
 */

//Implementacion del Api-Rest metodos Crud tabla usuarios

@RestController
@RequestMapping("/usuarios")
public class UsuariosControlador {
        @Autowired
        private UsuariosServicios usuariosServicios;

        @GetMapping("/listarTodoUsuarios")
        public List<Usuarios> listarUsuarios() {
            return usuariosServicios.listarUsuarios();
        }
        
       
        @GetMapping("/listarUsuariosPorId/{idUsuario}")
        public Usuarios buscarUsuariosPorId(@PathVariable Integer idUsuario) {
            return usuariosServicios.buscarUsuariosPorId(idUsuario);
        }
        
        @PostMapping("/guardarUsuarios")
        public Usuarios guardarUsuario(@RequestBody Usuarios usuario) {
            return usuariosServicios.guardarUsuario(usuario);
        }
        
        @DeleteMapping("/eliminarUsuarios/{idUsuario}")
        public void eliminarUsuario(@PathVariable Integer idUsuario){
             usuariosServicios.eliminarUsuario(idUsuario);
            
        }
        
        //Create
        @PostMapping(path = "/agregarUsuario")
        public String agregarUsuario(@RequestParam(value="nombres") String nombres,
                    @RequestParam(value="apellidos") String apellidos, @RequestParam(value="identificacion") String identificacion,
                    @RequestParam(value="fechaNacimiento") String fechaNacimiento, @RequestParam(value="nombre_usuario") String nombre_usuario,
                    @RequestParam(value="password") String password) {
            return usuariosServicios.agregarUsuario(nombres, apellidos, identificacion, fechaNacimiento, nombre_usuario, password);
        }
}
