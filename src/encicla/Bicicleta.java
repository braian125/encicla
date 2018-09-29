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
public class Bicicleta {
    private String color;
    private String personaId;
    private ArrayList<Bicicleta> bicicletas = new ArrayList<Bicicleta>();


    public Bicicleta(String color, String personaId) {
        this.color = color;
        this.personaId = personaId;
    }
    public Bicicleta(){
        FileHelper file = new FileHelper();
        ArrayList lines  = file.File("Bicicletas.txt");
        
        for(Object line : lines) {
            String[] bici = String.valueOf(line).split("\\|");
            bicicletas.add(new Bicicleta(bici[0], bici[1]));
        }    
    }

    public String getPersonaId() {
        return personaId;
    }

    public void setPersonaId(String personaId) {
        this.personaId = personaId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(ArrayList<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }
}
