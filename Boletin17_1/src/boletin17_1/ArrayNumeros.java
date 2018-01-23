
package boletin17_1;

import java.util.Arrays;

public class ArrayNumeros {
    
    public void generarNumeros(int[] numeros){
        for(int i=0;i<numeros.length;i++){
            numeros[i] = (int) (Math.random()*50)+1;
        }
    }
    
    public void invertirPosicion(int[] numeros){
        for(int i=0;i<numeros.length/2;i++){
            int posicion = numeros[i];
            numeros[i] = numeros[numeros.length-1-i];
            numeros[numeros.length-1-i] = posicion;
        }
        System.out.println(Arrays.toString(numeros));
    }
    
}