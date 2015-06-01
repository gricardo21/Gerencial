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
public class Gerencial {

    /**
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
     */
    public void Control_principal () throws IOException, InterruptedException {
        
        BufferedReader en = new BufferedReader(new InputStreamReader(System.in));
        Menu m = new Menu();
        int OpcUsuario=0;
        int OpC=0;
        
        
        do{
        try{
            
        m.Menu_Principal();   
        OpcUsuario= Integer.parseInt(en.readLine());
        }catch(NumberFormatException X){ System.err.println("Intente de nuevo....");}
         
        
        switch(OpcUsuario){
            case 1: 
                int opc=0;
                m.Menu_Sist_costeo();
                opc=Integer.parseInt(en.readLine());
                
                switch(opc)
                { 
                    case 1: m.Menu_Datos();
                            int opc2;
                            opc2=Integer.parseInt(en.readLine());
                        break;
                    case 2: m.Menu_Datos();
                             int opc3;
                             opc3=Integer.parseInt(en.readLine());
                        break;
                    case 3: 
                        break;    }
            case 2:
                break;
            case 3:
                break;
            case 4: 
                break;
            case 5:
                break;
            case 6:
                System.err.println("hasta luego :D ");
            System.exit(0);
            break;
            default:
                System.err.println("opcion no valida...");
                   
   
    }
    
    }while (OpC != 6);
    
    
    }
    

}