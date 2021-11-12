/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Solución que permita calcular y mostrar el valor a cancelar de una planilla 
de luz. Se debe ingresar el valor de costo por kilovatio/hora y el número de 
kilovatios consumidos en el mes. Si el usuario tiene edad mayor a 65 años, se 
debe descontrar el 10% */

package problema1;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double valorKilovatioHora;
        double kilovatiosConsumidosMes;
        int edad;
        double porcentaje = 10;
        double descuento;
        double costoPlanilla;
        
        System.out.println("Ingrese el costo de kilovatio por hora:");
        valorKilovatioHora = entrada.nextDouble();
        
        System.out.println("Ingrese el número de kilovatios consumidos en el mes:");
        kilovatiosConsumidosMes = entrada.nextDouble();
        
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        
        costoPlanilla = kilovatiosConsumidosMes * valorKilovatioHora;
        
        if (edad > 65) {
        descuento = (porcentaje * costoPlanilla)/100;
        costoPlanilla = costoPlanilla - descuento;
        }
        
        System.out.printf("El costo de la planilla es de: " + "%.2f\n", 
                costoPlanilla);                  
                
    }
    
}
