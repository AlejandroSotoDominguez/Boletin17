
package boletin17_2;

public class Boletin17_2 {

    public static void main(String[] args) {
        int[] numeros = new int[30];
        Notas nota1 = new Notas();
        nota1.generarNumeros(numeros);
        nota1.evaluarNotas(numeros);
        nota1.notaMedia(numeros);
        nota1.notaAlta(numeros);
    }
    
}
