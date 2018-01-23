
package boletin17_2;

import java.util.Arrays;

public class Notas {
    
    public void generarNumeros(int[] numeros){
        for(int i=0;i<numeros.length;i++){
            numeros[i] = (int) (Math.random()*10)+1;   
        }
        System.out.println(Arrays.toString(numeros));
    }
    
    public void evaluarNotas(int[] numeros){
        int aprobados = 0;
        int suspensos = 0;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i] >=5){
                aprobados++;
            }else{
                suspensos++;
            }
        }
        System.out.println("Aprobados: "+aprobados+" "+"Suspensos: "+suspensos);
    }
    
    public void notaMedia(int[] numeros){
        int total=0;
        int media;
        for(int i=0;i<numeros.length;i++){
            total += numeros[i];
        }
        media=total/30;
        System.out.println("Nota media: "+media);
    }
    
    public void notaAlta(int[] numeros){
        int mayor=0;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]>mayor){
                mayor=numeros[i];
            }
        }
        System.out.println("Nota más alta: "+mayor);
    }
    
}