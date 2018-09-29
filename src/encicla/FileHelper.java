/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encicla;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Brian Vanegas
 */
public class FileHelper {
    BufferedReader br;//Leer el archivo
    String readLine;//almacenar linea actual
    ArrayList<String> lines = new ArrayList<String>();//aqui voy a guardar todas las lineas

    public ArrayList File(String fileName) {
        try{
            br = new BufferedReader(new FileReader(fileName));
            readLine = br.readLine();
            
            while(readLine != null){
                lines.add(readLine);//agregar linea x linea
                readLine = br.readLine();//cambiando de linea
            }
        } catch(IOException e){
            System.out.println("Hay un problema:" + e);
        } 
        return lines;//retorna la lista de lineas
    }
}