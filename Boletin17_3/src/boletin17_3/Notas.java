
package boletin17_3;

import java.util.Arrays;

public class Notas {
    
    public void generarNumeros(int[] notas){
        for(int i=0;i<notas.length;i++){
            notas[i] = (int) (Math.random()*10)+1;   
        }
        System.out.println(Arrays.toString(notas));
    }
    
    public void evaluarNotas(int[] notas,String[] alumnos){
        System.out.println("Alumnos aprobados: ");
        for(int i=0;i<notas.length;i++){
            if(notas[i] >=5){
                System.out.println(alumnos[i]+" "+notas[i]);
            }
        }
    }
    
    public void ordenar(int[] notas){
        for(int i=0;i<notas.length;i++){
            Arrays.sort(notas);
            System.out.println(notas[i]);
        }
        
    }

    
}