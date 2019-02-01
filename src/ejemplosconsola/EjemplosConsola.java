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
        
        //empiezo a comparar desde la posicion 1, no desde la 0
        for (int i=1; i< lista.length; i++){
            if ( lista[i] >= listaMaximos[0]){
                //si llega aquí, es que el número que estoy 
                //comparando es mayor o igual que el que tengo primero en la lista de máximos
                listaMaximos[1] = listaMaximos[0]; //desplazo a la derecha el que había como máximo
                listaMaximos[0] = lista[i];  //pongo en la primera posición al nuevo máximo
            }
            else  if ( lista[i] >= listaMaximos[1]){ //compruebo si el número que estoy leyendo es mayor que                                                      //el SEGUNDO de la lista de máximos
                listaMaximos[1] = lista[i];  //pongo en la SEGUNDA posición al nuevo SEGUNDO máximo
            }
        }       
        return listaMaximos;
    }
    
    private boolean palindromo(String cadena){
        //primera fase: creo un nuevo String que sea una copia del 
        //que me pasan pero quitándole los espacios en blanco
        String auxiliar = "";
        for (int i=0; i< cadena.length(); i++){
            if (cadena.charAt(i) != ' '){
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }
        
        //ahora en auxiliar tengo el string pero sin espacios en blanco
        //declaro dos indices para que digan qué posiciones estoy comparando
        int indiceIzq = 0;
        int indiceDer = auxiliar.length()-1;
        
        //mientras sean iguales los caracteres en esas posiciones la palabra será un palindromo
        //en el momento en el que una de esas comparaciones falle, es que no es palíndromo
        
        //además, si el indice izquierdo es mayor que el derecho, ya he chequeado toda la frase
        while (auxiliar.charAt(indiceIzq) == auxiliar.charAt(indiceDer) && indiceIzq <= indiceDer){
            indiceIzq++;
            indiceDer--;
        }
        boolean resultado = true;
        if (indiceIzq < indiceDer){ // si esto se cumple es que la palabra no es un palíndromo
            resultado = false;
            System.out.println("NO ES UN PALINDROMO ");
        }
        else{
            System.out.println("SI ES UN PALINDROMO ");
        }
    return resultado; 
    }
    
    private void palindromoV2(String cadena){
        String auxiliar = "";
        for ( int i=0; i< cadena.length(); i++){
            if (cadena.charAt(i) != ' '){
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }
        //aquí ya tengo en el string auxiliar todas las letras
        //de la palabra original pero sin espacios en blanco
        
        int indiceIzq = 0;
        int indiceDer = auxiliar.length() - 1; 
        
        while (auxiliar.charAt(indiceIzq) == auxiliar.charAt(indiceDer)  
                && indiceIzq <= indiceDer){
            indiceIzq++;
            indiceDer--;
        }
        
        if (indiceIzq < indiceDer){
            System.out.println("La cadena " + cadena + " NO es un Palíndromo");
        }
        else {
            System.out.println("La cadena " + cadena + " SI es un Palíndromo");
        }
        
    }
    
    
    private boolean esIsograma(String palabra){
       for (int i=0; i<palabra.length()-1; i++){
           for (int j=i+1; j<palabra.length(); j++){
               if (palabra.charAt(j) == palabra.charAt(i)){
                   return false;
               }
           }
       }
       //si ha recorrido los dos bucles for enteros, es que 
       //la palabra no tiene letras repetidas
       return true;
    }
    
    private void imprimeMes(int numx){
        if (numx >7){
            numx = 7;
        }
        int contador = 0;
        //pintara tantas xx como numX sea
    
        for (int j=1; j<numx; j++){
            System.out.print("XX ");
            contador = contador + 1;
        }
        for (int i=1; i<=31; i++){
            if (contador <=7){
                if (i<=9){
                    System.out.print("0" + i);
                    System.out.print(" ");
                }}
            if (i>9){
                System.out.print(i);
                System.out.print(" ");
            }
            contador = contador + 1;
        
            if(contador==7){
                System.out.println("");
                contador = 0;
            }
        }
        for(int x=contador; x<7; x++){
            System.out.print("XX ");
        }
        
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemplosConsola ejercicios = new EjemplosConsola();
       
//        System.out.println( Arrays.toString( ramon.maximos(ramon.listaNumeros)) );
//        System.out.println( Arrays.toString( ramon.maximos(ramon.listaNumeros2)) );  
//        System.out.println( Arrays.toString( ramon.maximos(ramon.listaNumeros3)) ); 
//        System.out.println( Arrays.toString( ramon.maximos(ramon.listaNumeros4)) );
//        
//        ramon.palindromo("ACASO HUBO BUHOS ACA") ;
//        ramon.palindromo("ACdfgfgddfgASO HUBO BUHOS ACA") ;
//        ramon.palindromo("TACOCAT") ;
//        ramon.palindromo("TACCAT") ;
        
        
//        ejercicios.palindromoV2("ACASO HUBO BUHOS ACA") ;
//        ejercicios.palindromoV2("ACdfgfgddfgASO HUBO BUHOS ACA") ;
//        ejercicios.palindromoV2("TACOCAT") ;
//        ejercicios.palindromoV2("TACCAT") ;
//        
//        System.out.println("TACCAT  " +ejercicios.esIsograma("TACCAT")) ;
//        System.out.println("murcielago  " +ejercicios.esIsograma("murcielago")) ;
//        System.out.println("murcielagoo  " +ejercicios.esIsograma("murcielagoo")) ;
//        
        for (int i=7; i<14; i++){
            ejercicios.imprimeMes(i);
            System.out.println();
            System.out.println();
        }
        
    }
    
}
