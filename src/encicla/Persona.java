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
public class Persona {
    private String identificacion;
    private String nombre;
    private ArrayList<Persona> usuarios = new ArrayList<Persona>();

    public Persona(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    //implementacion de sobrecarga en los dos constructores
    public Persona() {
        FileHelper file = new FileHelper();
        ArrayList lines  = file.File("Usuarios.txt");
        
        for(Object line : lines) {
            String[] usuario = String.valueOf(line).split("\\|");
            boolean estado = (usuario[2] == "Activo" ? true : false);//if shorthand
            usuarios.add(new Usuario(usuario[0], usuario[1], estado));
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public ArrayList<Persona> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Persona> usuarios) {
        this.usuarios = usuarios;
    }
}
