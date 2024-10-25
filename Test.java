/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class Test {
    
    public static void main(String[] args) {
        
        
        
        
        ConsolaPortatil consolaPortatil1 = new ConsolaPortatil(10, "NINTENDO", "SWITCH", 300_000);
        ConsolaPortatil consolaPortati2 = new ConsolaPortatil(12, "PLAYSTATION", "PSP", 600_000);
        ConsolaSobremesa consolaSobremesa1 = new ConsolaSobremesa(4, "NINTENDOO", "N64", 200_000);
        ConsolaSobremesa consolaSobremesa2 = new ConsolaSobremesa(4, "PLAYSTATIONN", "1", 300_000);
        
        RegistroConsola registro = new RegistroConsola();
        registro.agregarConsola(consolaPortatil1);
        registro.agregarConsola(consolaPortati2);
        registro.agregarConsola(consolaSobremesa1);
        registro.agregarConsola(consolaSobremesa2);
        registro.listar();
        registro.clasificacionConsolas();
        System.out.println((registro.eliminarConsola("NINTENDO"))?"CONSOLA ELIMINADA":"CONSOLA NO ELIMINADA");
        registro.eliminarConsola("NINTENDO");
        registro.listar();
        System.out.println("CANTIDAD DE CONSOLAS CARAS "+registro.obtenerConsolasCaras());
        
        
    }
    
}
