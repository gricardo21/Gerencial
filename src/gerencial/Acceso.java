/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gerencial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alexr
 */
public class Acceso {
    
    public static void main (String[] args) throws InterruptedException, IOException{
    
      BufferedReader en = new BufferedReader(new InputStreamReader(System.in));  
      Gerencial g = new Gerencial();
      int opcP=0,a=0;
      int chnc=3;
      String Admin="Admin";
      String AdminPass="1234",Password;
      Menu m =new Menu();
      
        m.Easter_egg();
        System.out.println("================");
        System.out.println(" Ingrese opcion ");
        System.out.println("================");
       
    do{
        try{
            
        m.Menu_bienvenida();
        opcP=Integer.parseInt(en.readLine());
        
        }catch(NumberFormatException X){ System.out.println("Opción No Valida.");}
        
        switch(opcP){
            case 1:
                do{
                    System.out.println("ingrese la contraseña"+Admin);
                    Password=en.readLine();
                    if(Password.equalsIgnoreCase(AdminPass)){
                        System.out.println("contraseña aceptada, Welcome");
                        m.Admin();
                    }else{--chnc;System.out.println("contra incorrecta"+"te quedan"+chnc+"intentos"); }
                    if (chnc==0){
                        System.err.println("se te acabaron los intentos... bye");
                        System.exit(0);
                    }
                a++;
                }while(a<3);
                break;
                
            case 2:
                g.Control_principal();
                opcP=Integer.parseInt(en.readLine());
                break;
                
            case 3:
                System.err.println("hasta luego :D ");
                System.exit(0);
                break;
        }
        
        
    }while(opcP==0 && opcP<3);
    
    }
    
}
