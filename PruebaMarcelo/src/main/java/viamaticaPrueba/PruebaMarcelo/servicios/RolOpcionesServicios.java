/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import viamaticaPrueba.PruebaMarcelo.modelo.RolOpciones;
import viamaticaPrueba.PruebaMarcelo.modelo.repositorio.rolOpcionesRepositorio;

/**
 *
 * @author marce
 */
public class RolOpcionesServicios implements IRolOpcionesServicios{
    
    @Autowired
    private rolOpcionesRepositorio rolOpcionesRepositorio;

    @Override
    public List<RolOpciones> listarRolOpciones() {
        return rolOpcionesRepositorio.findAll();
    }

    @Override
    public RolOpciones buscarRolOpcionesPorId(Integer idRolOpciones) {
                return rolOpcionesRepositorio.findById(idRolOpciones).orElse(null);

    }

    @Override
    public RolOpciones guardarRolOpciones(RolOpciones rolOpciones) {
                return rolOpcionesRepositorio.save(rolOpciones);

    }

    @Override
    public void eliminarRolOpciones(RolOpciones rolOpciones) {
                 rolOpcionesRepositorio.delete(rolOpciones);

    }
    
}
