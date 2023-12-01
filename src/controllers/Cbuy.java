
package controllers;
import models.Buy;
import java.util.ArrayList;

/**
 *
 * @author Javier Yévenes
 */
public class Cbuy {
    ArrayList<Buy>desc;
    ArrayList<Buy>med;
    
    public Cbuy(){
        desc = new ArrayList();
        med = new ArrayList();
    }
    public void AddProducts(Buy b){
        desc.add(b);
        med.add(b);
    }
}
