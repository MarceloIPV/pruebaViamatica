/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.servicios;

import java.util.List;
import viamaticaPrueba.PruebaMarcelo.modelo.Persona;

/**
 *
 * @author marce
 */
//Declaración de la metodos basicos crud tabla Persona

public interface IPersonaServicio {
    
    public List<Persona> listarPersonas();
    
    public Persona buscarPersonaPorId(Integer idPersona);
     
    public Persona guardarPersona(Persona persona);
    
    public void eliminarPersona(Integer idPersona);
    
}
