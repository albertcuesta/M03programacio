package m03.ejercicio.pkg01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ALBERT CUESTA
 */
public class M03EJERCICIO01 {

    private static BufferedReader pantalla = new BufferedReader(new InputStreamReader(System.in));
    static int[] array;
    static String input, input2;
    static int posició, valor;

    public static void main(String[] args) throws IOException {
        //damos tamaño al array
        array = new int[100];
        //damos valores aleatorios a la array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 0);
        }

        /*APARTAT A
         SOLICITAR AL USUARIO UNA POSICIÓN Y UN VALOR. INSERTA EN EL VECTOR EN LA POSICION DADA EL VALOR DADO. MOSTRAR POR CONSOLA EL CONTENIDO DEL ARRAY.
         */
        //el usuario nos da una posición del array
        System.out.println(" dime una posición del array ");
        input = pantalla.readLine();
        posició = Integer.parseInt(input);

        //el usuario nos da un valor para introducir en el array
        System.out.println(" dime un valor del array ");
        input2 = pantalla.readLine();
        valor = Integer.parseInt(input2);

        //introducimos el valor que nos da el usuario en la posición del array
        if (posició >= 0 && posició < array.length) {
            array[posició] = valor;
        }

        //mostramos el contenido del array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        /*APARTAT B
         CALCULAR Y MOSTRAR EL VALOR MAS ALTO Y EL VALOR MAS BAJO DEL ARRAY
         */
        //mostramos por pantalla el numero mas grande
        System.out.println("el valor mayor de la array es: " + getMax(array));
         //mostramos por pantalla el numero mas pequeño
        System.out.println("el valor menor de la array es: " + getMin(array));

        /*APARTAT C
         CALCULAR LA MEDIA DE TODOS LOS VALORES Y MOSTRAR LOS VALORES DEL ARRAY QUE SE ENCUENTRAN POR ENCIMA DE ESTA MEDIA
         */
        //mostramos por pantallla el resultado del calcular la media
        System.out.println("la media del array es: " + getMedia(array));
        System.out.println("els numeros per sobre la mitja son: ");

        //mostramos por pantalla los numeros que son mas altos que la media dentro de la array
        for (int i = 0; i < array.length; i++) {
            if (array[i] > getMedia(array)) {
                System.out.println(array[i]);

            }
        }

    }
//calculo el numero maximo

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;

    }
    
//calculo el numero minimo

    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
//calculo de la media 

    public static double getMedia(int[] array) {
        int media = array[0];
        double total = 0;
        for (int i = 1; i < array.length; i++) {
            media += array[i];

        }
        media = media / array.length;
        return media;
    }

}
