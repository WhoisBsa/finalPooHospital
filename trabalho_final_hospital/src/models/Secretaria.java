/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author hemilio
 */
public class Secretaria extends Usuario {
    private String tipo;

    public Secretaria() {
        
    }

    public Secretaria(String login, String senha) {
        super(login, senha);
        setTipo("secretaria");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
