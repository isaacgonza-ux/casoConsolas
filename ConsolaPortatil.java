/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class ConsolaPortatil extends Consola {
    
    
    private int autonomiaBateria;
    private float descuentoPortatil;

    public ConsolaPortatil(int autonomiaBateria, String marca, String modelo, int precio) {
        super(marca, modelo, precio);
        this.autonomiaBateria = autonomiaBateria;
        this.descuentoPortatil = 0.07f;
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    public float getDescuentoPortatil() {
        return descuentoPortatil;
    }

    public void setDescuentoPortatil(float descuentoPortatil) {
        this.descuentoPortatil = descuentoPortatil;
    }
    
    
    
    

    @Override
    public String clasificacionConsola() {
        return "PORTATIL";

    }

    @Override
    public double calculaPrecioFinal() {
        double PrecioFinal=0;
        double descuentoMoneda = getPrecio()*descuentoPortatil;
        PrecioFinal = (getPrecio()-descuentoMoneda)*IVA;
        
        return PrecioFinal;
    }
    
    
    
    
    
    
    
}
