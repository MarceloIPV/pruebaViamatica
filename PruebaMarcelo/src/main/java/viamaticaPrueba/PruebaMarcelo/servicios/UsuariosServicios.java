/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.servicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import viamaticaPrueba.PruebaMarcelo.controladores.ControladorUsuario;
import viamaticaPrueba.PruebaMarcelo.modelo.Usuarios;
import viamaticaPrueba.PruebaMarcelo.modelo.Persona;
import viamaticaPrueba.PruebaMarcelo.modelo.repositorio.UsuariosRepositorio;
import viamaticaPrueba.PruebaMarcelo.modelo.repositorio.PersonaRepositorio;

/**
 *
 * @author marce
 */

//Funcionalidad Crud tabla usuarios

@Service
public class UsuariosServicios implements IUsuariosServicios{

    @Autowired
    private UsuariosRepositorio usuarioRepositorio;
    @Autowired
    private PersonaRepositorio personaRepositorio;
     
    @Override
    public List<Usuarios> listarUsuarios() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public Usuarios buscarUsuariosPorId(Integer idUsuario) {
        return usuarioRepositorio.findById(idUsuario).orElse(null);
    }

    @Override
    public Usuarios guardarUsuario(Usuarios usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public void eliminarUsuario(Integer idUsuario) {
         usuarioRepositorio.deleteById(idUsuario);
    }

    @Override
    public String agregarUsuario(String nombres, String apellidos, String identificacion, String fechaNacimiento, String nombre_usuario, String password) {
        String valDeUsuario = ControladorUsuario.validarUsuario(nombre_usuario);
		
		if (valDeUsuario == "True") {
			String valDePassword = ControladorUsuario.validarPassword(password);
			
			if (valDePassword == "True") {
				String valDeIdentificacion = ControladorUsuario.validarIdentificacion(identificacion);
				
				if (valDeIdentificacion == "True") {
					
					String correo = ControladorUsuario.formatoMail(nombres, apellidos, '0');
                                        
                                        Persona entity2 = new Persona();
                                        entity2.setNombres(nombres);
                                        entity2.setApellidos(apellidos);
                                        entity2.setIdentificacion(identificacion);
                                        String dateString = fechaNacimiento;
                                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                        Date date;
                                        try {
                                            date = dateFormat.parse(dateString);
                                            entity2.setFechaNacimiento(date);
                                        } catch (ParseException ex) {
                                            entity2.setFechaNacimiento(null);
                                        }
                                        
                                       
                                        personaRepositorio.save(entity2);
                                        
                                        Usuarios entity1 = new Usuarios();
                                        entity1.setMail(correo);
                                        entity1.setPassword(password);
                                        entity1.setPersona_IdPersona2(personaRepositorio.save(entity2).getId());
                                        entity1.setSessionActive('E');
                                        entity1.setStatus("Habilitado");
                                        entity1.setUserName(nombre_usuario);

                                        usuarioRepositorio.save(entity1);

                                        
					return "Registro Realizado Correctamente";
				}
				return valDeIdentificacion;
			}
			return valDePassword;
		}
		return valDeUsuario;
    }
    
}
