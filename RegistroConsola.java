
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class RegistroConsola {
    private ArrayList<Consola> listadoConsolas;

    public RegistroConsola() {
        listadoConsolas = new ArrayList<>();
    }
    
    public boolean buscarConsola(String marca){
        for (Consola i : listadoConsolas) {
            if (marca.equalsIgnoreCase(i.getMarca())) {
                return true;
            }
        }
        return false;
    }
    
    public boolean agregarConsola(Consola consola){
        if (buscarConsola(consola.getMarca())==true) {
            System.out.println("CONSOLA YA EXISTENTE");
            return false;
        } else {
            listadoConsolas.add(consola);
            System.out.println("CONSOLA AGREGADA");
            return true;  
        }
    
    }
    
    public void listar(){
        System.out.println("LISTADO DE CONSOLAS");
        System.out.println("-------------------");
        for (Consola i : listadoConsolas) {
            System.out.println(i.toString()+" precio final $ "+i.calculaPrecioFinal());
            
        }
    
    }
    
    public boolean eliminarConsola(String marca){
        for (Consola i : listadoConsolas) {
            if (marca.equalsIgnoreCase(i.getMarca())) {
                listadoConsolas.remove(i);
                return true;
            }
        }
        return false;
        
    }
    
    public int obtenerConsolasCaras(){
        int cantidad=0;
        for (Consola i : listadoConsolas) {
            if (i.getPrecio()>500_000) {
                cantidad++;  
            }
        }
        return cantidad;
        
    }
    
    public void clasificacionConsolas(){
        int cantidadPortatil=0, cantidadSobremesa=0;
        for (Consola i : listadoConsolas) {
            if (i.clasificacionConsola().equalsIgnoreCase("PORTATIL")) {
                cantidadPortatil++; 
            }else if (i.clasificacionConsola().equalsIgnoreCase("SOBREMESA")) {
                cantidadSobremesa++;
            }
        }
        System.out.println("CANTIDAD DE CONSOLAS PORTÁTILES "+cantidadPortatil);
        System.out.println("CANTIDAD DE CONSOLAS DE SOBREMESA "+cantidadSobremesa);
    }
    
    
    
    
}
