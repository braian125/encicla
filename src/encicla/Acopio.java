/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encicla;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Electromás
 */
public class Acopio {
    private String nombreAcopio;
    private String color;
    private int cantidad;
    private ArrayList<Acopio> acopios = new ArrayList<Acopio>();
    
    public Acopio(String nombreAcopio, String color, int cantidad) {
        this.nombreAcopio = nombreAcopio;
        this.color = color;
        this.cantidad = cantidad;
    }

    public Acopio() {
        FileHelper file = new FileHelper();
        ArrayList lines  = file.File("Acopios.txt");
        
        for(Object line : lines) {
            String[] acopio = String.valueOf(line).split("\\|");
            acopios.add(new Acopio(acopio[0], acopio[1], Integer.parseInt(acopio[2].trim())));
        }
    }

    public String getNombreAcopio() {
        return nombreAcopio;
    }

    public void setNombreAcopio(String nombreAcopio) {
        this.nombreAcopio = nombreAcopio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ArrayList<Acopio> getAcopios() {
        return acopios;
    }

    public void setAcopios(ArrayList<Acopio> acopios) {
        this.acopios = acopios;
    }
    
    public int getBicicletasDisponibles() {
        Bicicleta bicisReservadas = new Bicicleta();
        int contador = 0;
        for(Bicicleta bici: bicisReservadas.getBicicletas()) {
            if (Objects.equals(bici.getColor().trim(), this.color.trim())) {
                contador++;
            }
        }
        return this.cantidad - contador;
    }
}

