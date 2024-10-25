/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class ConsolaSobremesa extends Consola {
    
    
    private int numeroControles;
    private float descuentoSobremesa;

    public ConsolaSobremesa(int numeroControles, String marca, String modelo, int precio) {
        super(marca, modelo, precio);
        this.numeroControles = numeroControles;
        this.descuentoSobremesa = 0.1f;
    }

    public int getNumeroControles() {
        return numeroControles;
    }

    public void setNumeroControles(int numeroControles) {
        this.numeroControles = numeroControles;
    }

    public float getDescuentoSobremesa() {
        return descuentoSobremesa;
    }

    public void setDescuentoSobremesa(float descuentoPortatil) {
        this.descuentoSobremesa = descuentoPortatil;
    }
    

    @Override
    public String clasificacionConsola() {
        return "SOBREMESA";

    }

    @Override
    public double calculaPrecioFinal() {
        double PrecioFinal=0;
        double descuentoMoneda = getPrecio()*descuentoSobremesa;
        PrecioFinal = (getPrecio()-descuentoMoneda)*IVA;
        
        return PrecioFinal;
    }
    
    
    
    
    
    
    
}
