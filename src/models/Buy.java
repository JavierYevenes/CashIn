/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author james
 */
public class Buy {
    private int Barcode;
    private String Desc;
    private String Precio;
    private String Medida;

    public Buy(int Barcode, String Desc, String Precio, String Medida) {
        this.Barcode = Barcode;
        this.Desc = Desc;
        this.Precio = Precio;
        this.Medida = Medida;
    }

    public Buy() {
    }
    

    public int getBarcode() {
        return Barcode;
    }

    public void setBarcode(int Barcode) {
        this.Barcode = Barcode;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getMedida() {
        return Medida;
    }

    public void setMedida(String Medida) {
        this.Medida = Medida;
    }
    
    
}
