package Arrays;

import java.util.Scanner;

public class Actividad1 {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        String palabra = "";
        int val = 0;
        String[] palabras = {"Perro", "Gato", "Caballo", "Vaca", "Burro", "Gallo", "Borrego", "Ardilla", "Pajaro", "Pez"};
        
        System.out.println("Ingrese una palabra para buscar en el array: ");
        palabra = le.nextLine();
        
        for (int i = 0; i < palabras.length; i++) {
            if (palabra.equalsIgnoreCase(palabras[i])) {
                System.out.println("La palabra: " + palabra + " fue encontrada en la posición: " + i + " del array");
                val = 1;
            }
        }
        if (val == 0) {
            System.out.println("La palabra: " + palabra + " no fue encontrada en el array");
        }
    }
}
