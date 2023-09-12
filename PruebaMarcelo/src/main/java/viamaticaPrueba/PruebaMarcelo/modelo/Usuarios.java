/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author marce
 */

@Entity
@Table(name="usuarios")

public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario ;
    
    private String userName;
    private String password;
    private String mail;
    private char sessionActive;
    private Integer persona_IdPersona2;
    private String status;

    /**
     * @return the idUsuario
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the sessionActive
     */
    public char getSessionActive() {
        return sessionActive;
    }

    /**
     * @param sessionActive the sessionActive to set
     */
    public void setSessionActive(char sessionActive) {
        this.sessionActive = sessionActive;
    }

    /**
     * @return the persona_IdPersona2
     */
    public Integer getPersona_IdPersona2() {
        return persona_IdPersona2;
    }

    /**
     * @param persona_IdPersona2 the persona_IdPersona2 to set
     */
    public void setPersona_IdPersona2(Integer persona_IdPersona2) {
        this.persona_IdPersona2 = persona_IdPersona2;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
