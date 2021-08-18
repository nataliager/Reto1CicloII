/*
 * Reto 1 ciclo II misiìn TIC 2022.
 * Fecha de creaciòn: 29/07/2021
 * Ultima fecha de modificaciòn: 
 */
package reto1_cicloii;
import java.util.Scanner;

/**
 *
 * @author Natalia Giraldo
 */
public class Reto1_cicloII {

    public static void etapas(int edad_paco)
    {
        //Definición de edades
        int edad_hugo = (edad_paco * 2 ) + 4; //edad de Hugo
        int edad_luis = (edad_paco + edad_hugo) / 5;  //edad de Luis
        System.out.println(edad_paco + " " + edad_hugo + " " + edad_luis);

        //Definición de las etapas
        String etapa = "";
        
        if ( edad_luis >= 0 && edad_luis <= 20){
            etapa = "uno";
        }else if (edad_luis >= 21 && edad_luis <= 30){
            etapa = "dos";
        }else if (edad_luis >= 31 && edad_luis <= 50){
            etapa = "tres";
        }else {
            etapa = "cuatro";
        }
        System.out.println(etapa);

    }//Fin de la clase etapas
    
     public static void main(String[] args) 
     {
        // Llamado de la función etapas
        Scanner sc = new Scanner(System.in); 
        int edad_paco = sc.nextInt(); //Obtener por consola edad de paco
        etapas(edad_paco);
      
    }//Fin del metodo main
    
}