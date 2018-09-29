/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encicla;

/**
 *
 * @author Electromás
 */
public class Encicla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        /*for(Persona usuario : persona.getUsuarios()) {
            System.out.println(usuario.getNombre());
        }*/
        
        Acopio acopios = new Acopio();
        acopios.getBicicletasDisponibles();
    }
    
}
