/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.servicios;

import java.util.Date;
import java.util.List;
import viamaticaPrueba.PruebaMarcelo.modelo.Usuarios;

/**
 *
 * @author marce
 */
public interface IUsuariosServicios {
    
    public List<Usuarios> listarUsuarios();
    
    public Usuarios buscarUsuariosPorId(Integer idUsuario);
     
    public Usuarios guardarUsuario(Usuarios usuario);
    
    public void eliminarUsuario(Integer idUsuario);
    
    public String agregarUsuario(String nombres, String apellidos, String identificacion, String fechaNacimiento, String nombre_usuario, String password);
}
