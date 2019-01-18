/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsola;

import java.util.Arrays;

/**
 *
 * @author xp
 */
public class EjemplosConsola {

    //declaro un array de ints de instancia
    int[] listaNumeros ={200, 31, 27, 2, 5, 99};
    int[] listaNumeros2 ={-11, 5, -34, 7,209, 33, 77, 7 };
    int[] listaNumeros3 ={0, 2000, -4, 1581, 5, 999, 777, 9};
    int[] listaNumeros4 = {-5, -5, -200, -10, -60, -400};
    /*
    el método máximos va a calcular el máximo y el segundo máximo de una lista de números
    */
    private int[] maximos (int[] lista){
        //declaramos un array de dos elementos para guardar el máximo y el segundo máximo
        int [] listaMaximos = {lista[0], lista[1]};
        
        for (int i=0; i< lista.length; i++){
            if ( lista[i] >= listaMaximos[0]){
                //si llega aquí, es que el número que estoy 
                //comparando es mayor o igual que el que tengo primero en la 
                //lista de máximos
                if (i!=0) { //desplazo sólo a la derecha si no estoy justo en la primera posición
                    listaMaximos[1] = listaMaximos[0]; //desplazo a la derecha el que había como máximo
                } 
                listaMaximos[0] = lista[i];  //pongo en la primera posición al nuevo máximo
            }
            else  if ( lista[i] >= listaMaximos[1]){ //compruebo si el número que estoy leyendo es mayor que 
                                                     //el SEGUNDO de la lista de máximos
                listaMaximos[1] = lista[i];  //pongo en la SEGUNDA posición al nuevo SEGUNDO máximo
            }
        }
        
        return listaMaximos;
    }
                 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemplosConsola ramon = new EjemplosConsola();
       
        System.out.println( Arrays.toString( ramon.maximos(ramon.listaNumeros)) );
        
        System.out.println( Arrays.toString( ramon.maximos(ramon.listaNumeros2)) );
        
        System.out.println( Arrays.toString( ramon.maximos(ramon.listaNumeros3)) );
        
        System.out.println( Arrays.toString( ramon.maximos(ramon.listaNumeros4)) );
    }
    
}
