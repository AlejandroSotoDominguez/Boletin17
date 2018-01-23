
package boletin17_3;

import java.util.Arrays;

public class Boletin17_3 {

    public static void main(String[] args) {
        Notas array = new Notas();
        int[] notas = new int[5];
        String alumnos[] = {"Alex","Pablo","Dani","Iván","Alberto"};
        array.generarNumeros(notas);
        
        System.out.println("Alumno: "+alumnos[1]+"\nNota: "+notas[1]);
        
        array.evaluarNotas(notas,alumnos);
        
        array.ordenar(notas,alumnos);
      
        
    }
    
}
