/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encicla;

import java.util.ArrayList;

/**
 *
 * @author Electromás
 */
public class Usuario extends Persona {
    private boolean activoSistema;

    public Usuario(String identificacion, String nombre, boolean activoSistema) {
        super(identificacion, nombre);
        this.activoSistema = activoSistema;
    }

    public boolean isActivoSistema() {
        return activoSistema;
    }

    public void setActivoSistema(boolean activoSistema) {
        this.activoSistema = activoSistema;
    }
    
    
    
    
}
