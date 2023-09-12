package viamaticaPrueba.PruebaMarcelo.controlador;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import viamaticaPrueba.PruebaMarcelo.modelo.Usuarios;
import viamaticaPrueba.PruebaMarcelo.servicios.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marce
 */

@RestController
@RequestMapping("/usuarios")
public class UsuariosControlador {
        @Autowired
        private UsuariosServicios usuariosServicios1;

        
}
