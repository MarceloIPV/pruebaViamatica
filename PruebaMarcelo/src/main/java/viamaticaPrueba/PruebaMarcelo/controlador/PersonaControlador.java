package viamaticaPrueba.PruebaMarcelo.controlador;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import viamaticaPrueba.PruebaMarcelo.modelo.Persona;
import viamaticaPrueba.PruebaMarcelo.servicios.PersonaServicio;

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
@RequestMapping("/personas")
public class PersonaControlador {
   
        @Autowired
        private PersonaServicio personaServicio;

        @GetMapping("/listarTodoPersonas")
        public List<Persona> listarPersonas() {
            return personaServicio.listarPersonas();
        }
        
       
        @GetMapping("/listarPersonaPorId/{idPersona}")
        public Persona buscarPersonaPorId(@PathVariable Integer idPersona) {
            return personaServicio.buscarPersonaPorId(idPersona);
        }
        
        @GetMapping("/guardarPersona")
        public Persona guardarPersona(@RequestBody Persona persona) {
            return personaServicio.guardarPersona(persona);
        }
        
        @DeleteMapping("/eliminarPersona/{idPersona}")
        public void eliminarPersona(@PathVariable Integer idPersona){
             personaServicio.eliminarPersona(idPersona);
            
        }
        
        
   
}
