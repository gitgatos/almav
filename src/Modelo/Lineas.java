/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author 
 */
public class Lineas {
    int IdLineas;
    String Lineas;


    
    public Lineas(){
        
    }
    public Lineas(int IdLineas, String Lineas) {
        this.IdLineas = IdLineas;
        this.Lineas = Lineas;
    }

    public int getIdLineas() {
        return IdLineas;
    }

    public void setIdLineas(int IdLineas) {
        this.IdLineas = IdLineas;
    }

    public String getLineas() {
        return Lineas;
    }

    public void setLineas(String Lineas) {
        this.Lineas = Lineas;
    }
    
    
}
