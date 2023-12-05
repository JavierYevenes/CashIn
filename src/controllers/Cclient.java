/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;
import models.Client;
import java.util.ArrayList;

/**
 *
 * @author Javier Yévenes
 */
public class Cclient {
    ArrayList<Client>giro;

    public Cclient(){
        giro = new ArrayList();
    }
    
    public void addgiro(Client cl){
        giro.add(cl);
    }
}
