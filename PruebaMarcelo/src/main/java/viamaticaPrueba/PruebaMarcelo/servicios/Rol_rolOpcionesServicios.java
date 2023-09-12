/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import viamaticaPrueba.PruebaMarcelo.modelo.Rol_rolOpciones;
import viamaticaPrueba.PruebaMarcelo.modelo.repositorio.Rol_rolOpcionesRepositorio;


/**
 *
 * @author marce
 */

//Funcionalidad Crud tabla rol_rolOpciones
@Service
public class Rol_rolOpcionesServicios implements IRol_rolOpcionesServicios{
    
    @Autowired
    private Rol_rolOpcionesRepositorio rol_rolOpcionesRepositorio;

    @Override
    public List<Rol_rolOpciones> listarRol_rolOpciones() {
         return rol_rolOpcionesRepositorio.findAll();
    }

    @Override
    public Rol_rolOpciones buscarRol_rolOpcionesPorId(Integer idRol_rolOpciones) {
         return rol_rolOpcionesRepositorio.findById(idRol_rolOpciones).orElse(null);
    }

    @Override
    public Rol_rolOpciones guardarRol_rolOpcionesOpciones(Rol_rolOpciones rolOpciones) {
        return rol_rolOpcionesRepositorio.save(rolOpciones);
    }

    @Override
    public void eliminarRol_rolOpcionesOpciones(Integer idRol_rolOpciones) {
          rol_rolOpcionesRepositorio.deleteById(idRol_rolOpciones);

    }
    
}
