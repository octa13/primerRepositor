/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1modulo5;



/**
 *
 * @author Fernando
 */
public class Arreglo {
    
    
    
/*Método sumarLista que reciba por parámetro un arreglo unidimensional de
enteros y muestre por pantalla la suma y promedio de los mismos.*/
    
    public static void sumarLista( int[]arreglo){

        
       int suma= 0;
     
       for (int numero:arreglo){
       
       suma=suma + numero;
      }
       System.out.println("la suma de los numeros es: "+suma);
       System.out.println("el promedio de los nuemros es de: "+suma/arreglo.length);
    
    
    }
          
/*Método buscarMayor que reciba por parámetro un arreglo bidimensional e
irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.*/
    
  
    
   public static void buscarMayor(int[][]arregloBidimensional){
     
       
    int mayor= Integer.MIN_VALUE;
    for(int[] entero:arregloBidimensional){
       for(int numero:entero){
        
           if (numero>mayor){
               mayor=numero;
           }
       }

    }   
 System.out.println("el numero mayor es: " +mayor);  
       
       
       
   }

  
     

/*Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad
de vocales que tiene la cadena*/


public static void cuentaVocales(String cadena){
    
    







}
}
    

    
    
    
    
    
    
    
    
    
    
    
        
 
             
    
    
    
    

