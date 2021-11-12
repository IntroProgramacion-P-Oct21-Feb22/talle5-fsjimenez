/*
Elaborar una solución que permita leer los datos de un automóvil (marca, origen 
y costo) imprima el impuesto por pagar y el precio de venta (incluido el 
impuesto). Si el origen es Alemania el impuesto es 20%, si es de Japón el 
impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%
 */
package problema3;


import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String marca;
        String origen;
        double impuesto;
        double precio_venta;
        double descuento;
        double porcentaje_1 = 20;
        double porcentaje_2 = 30;
        double porcentaje_3 = 15;
        double porcentaje_4 = 8;
               
        impuesto = 30;
        
        System.out.println("Introdizca la marca del automóvil:");
        marca = entrada.nextLine();
                
        System.out.println("Introdizca el origen del automóvil:");
        origen = entrada.nextLine();
        
        System.out.println("Introdizca el costo del automóvil:");
        precio_venta = entrada.nextDouble();
        
        if (origen.equals("Alemania")) {
            impuesto = (precio_venta * porcentaje_1)/100;      
            precio_venta = precio_venta + impuesto;}
            
        if (origen.equals("Japon")) {
               impuesto = (precio_venta * porcentaje_2)/100;      
               precio_venta = precio_venta + impuesto; 
            }
        
        if (origen.equals("Italia")) {
               impuesto = (precio_venta * porcentaje_3)/100;      
               precio_venta = precio_venta + impuesto; 
            }
        
        if (origen.equals("USA")) {
               impuesto = (precio_venta * porcentaje_4)/100;      
               precio_venta = precio_venta + impuesto; 
            }
        
    
        System.out.printf("El precio de venta es: %.2f\n", precio_venta);
        System.out.printf("El impuesto a pagar es: %.2f\n", impuesto);
    }
    
}
