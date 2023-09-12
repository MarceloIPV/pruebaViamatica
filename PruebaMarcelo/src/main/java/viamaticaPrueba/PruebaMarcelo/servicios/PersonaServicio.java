/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import viamaticaPrueba.PruebaMarcelo.modelo.Persona;
import viamaticaPrueba.PruebaMarcelo.modelo.repositorio.PersonaRepositorio;

/**
 *
 * @author marce
 */

//Funcionalidad Crud tabla Persona
@Service
public class PersonaServicio implements IPersonaServicio{
    
    @Autowired
    private PersonaRepositorio personaRepositorio;

    @Override
    public List<Persona> listarPersonas() {
        return personaRepositorio.findAll();
    }

    @Override
    public Persona buscarPersonaPorId(Integer idPersona) {
        return personaRepositorio.findById(idPersona).orElse(null);
    }

    @Override
    public Persona guardarPersona(Persona persona) {
        return personaRepositorio.save(persona);
    }

    @Override
    public void eliminarPersona(Integer idPersona) {
       personaRepositorio.deleteById(idPersona);
    }
    
}
