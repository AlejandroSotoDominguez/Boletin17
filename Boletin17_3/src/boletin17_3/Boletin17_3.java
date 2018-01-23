
package boletin17_3;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Boletin17_3 {

    public static void main(String[] args) {
        Notas array = new Notas();
        int[] notas = new int[5];
        String alumnos[] = {"Alex","Pablo","Dani","Iván","Alberto"};
        array.generarNumeros(notas);
        
        for(int i=0;i<notas.length;i++){
            for(int j=0;j<alumnos.length;j++){ 
                
            }
        }
        System.out.println("Alumno: "+alumnos[1]+"\nNota: "+notas[1]);
        
        array.evaluarNotas(notas,alumnos);
        
        array.ordenar(notas);
        
        String nombre = JOptionPane.showInputDialog("Introduce un nombre");
        
        int notaAlumno = 0;
        for(int i=0;i<notas.length;i++){
            for(int j=0;j<alumnos.length;j++){
                if(alumnos[i]==nombre){
                    notaAlumno = notas[i];
                }
            }    
        }
        System.out.println(notaAlumno);
        
    }
    
}
