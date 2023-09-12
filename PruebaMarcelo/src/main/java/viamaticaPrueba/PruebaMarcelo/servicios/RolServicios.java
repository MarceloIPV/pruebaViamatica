/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import viamaticaPrueba.PruebaMarcelo.modelo.Rol;
import viamaticaPrueba.PruebaMarcelo.modelo.repositorio.rolRepositorio;

/**
 *
 * @author marce
 */
@Service
public class RolServicios implements IRolServicios{
    
    @Autowired
    private rolRepositorio rolRepositorio;


    @Override
    public List<Rol> listarRol() {
        return rolRepositorio.findAll();
    }

    @Override
    public Rol buscarRolPorId(Integer idRol) {
        return rolRepositorio.findById(idRol).orElse(null);
    }

    @Override
    public Rol guardarRol(Rol rol) {
        return rolRepositorio.save(rol);
    }

    @Override
    public void eliminarRol(Integer idRol) {
         rolRepositorio.deleteById(idRol);
    }
    
}
