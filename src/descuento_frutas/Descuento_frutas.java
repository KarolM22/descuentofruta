/*
 * 4.	Una frutería ofrece las manzanas con descuento según la siguiente tabla:
		NUM. DE KILOS COMPRADOS		% DESCUENTO
			  0      -   2					  0%
			  2.01 -   5 					10%
			  5.01 - 10					15%
			10.01 en adelante				20%

Determinar cuánto pagara una persona que compre manzanas es esa frutería.


 */
package descuento_frutas;

import java.util.Scanner;

/**
 *
 * @author karol martinez 
 */
public class Descuento_frutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
         final int precioskilos=6000;
         int kilos, totalpagar; 
         
        System.out.println("Cuantos kilos de manzanas va a comprar");
        kilos=leer.nextInt();
        
        if (kilos<=2){
            totalpagar=kilos*precioskilos;
        
        }
        else {
        if ((kilos>2)&&(kilos<=5)){
            totalpagar=(int)((kilos*precioskilos)-(kilos*precioskilos)*0.1);
        
        
        }
        else {
            if ((kilos>5)&&(kilos<=10)){
                totalpagar=(int)((kilos*precioskilos)-(kilos*precioskilos)*0.15);
            
            
            }
            else 
            { 
                totalpagar=(int)((kilos*precioskilos)-(kilos*precioskilos)*0.2);
            }
            
        }
                
                }
       
        System.out.println("su total apaagr es :"+totalpagar);
    }
    
}
