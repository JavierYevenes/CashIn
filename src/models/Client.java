/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author james
 */
public class Client {
    private String giro;
    
    public Client(String giro){
        this.giro = giro;
    }
    
    public Client(){
        
    }

    public String getgiro() {
        return giro;
    }

    public void setgiro(String giro) {
        this.giro = giro;
    }
    
    
}
