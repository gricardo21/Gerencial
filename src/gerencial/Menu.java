/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerencial;

/**
 *
 * @author alexr
 */
public class Menu {
    
    public void Menu_Principal(){
        
        System.out.println("==========MENU PRINCIPAL==========");
        System.out.println("1. Sistema de costeo");
        System.out.println("2. Analisis de modelo");
        System.out.println("3. Costo e ingreso ");
        System.out.println("4. Presupuesto maestro");
        System.out.println("5. Medicion del desempeño");
        System.out.println("6. salir");


}
    public void Menu_Sist_costeo()
    {
        System.out.println("1. Costeo directo");
        System.out.println("2. Costeo absorbente");
        System.out.println("3. Regresar al menu anterior");
    }
    
    public void Menu_Datos()
    {
        System.out.println("1. Ingresar datos");
        System.out.println("2. Modificar datos");
        System.out.println("3. Eliminar datos");
        System.out.println("4. Buscar datos");
        System.out.println("5. Regresar al menu anterior");
    }
    
    public void Easter_egg ()throws InterruptedException 
    {
    
          System.out.println("╔═════════════════╗");
        for (int i = 0 ; i < 18 ; i++){
            System.out.print("║");
            Thread.sleep(300);
        }
          System.out.println("");
           Thread.sleep(300);
           System.out.println("╚═════════════════╝");
    
    
    }
    
    public void Menu_bienvenida()
    {
        System.out.println("1. Ingresar como admin ");
        System.out.println("2. Ingresar como usuario");
        System.out.println("3. Salir de la app");
    
    }
    
    public void Admin()
    {
        System.out.println("1. Visualizar reportes");
        System.out.println("2. Exportar documento a Excel");
        
    
    }
    
    
    
    
}
