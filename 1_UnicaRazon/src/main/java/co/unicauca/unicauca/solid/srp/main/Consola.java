/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.unicauca.solid.srp.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ahurtado
 */
public class Consola {

    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public String readString(String message) {
        String input = "";
        try {
            show(message);
            input = br.readLine();
            } 
        catch (IOException e) {
            show("Error de lectura del teclado");
            }
        return input;
    }
    
    public int readInt(String message) {
        return Integer.parseInt(readString(message));
    }
    
    public float readFloat(String message) {
        return Float.parseFloat(readString(message));
    }
    
    public double readDouble(String message) {
        return Double.parseDouble(readString(message));
    }
    
    void show(String message) { 
        System.out.println(message);
    }
    
}
