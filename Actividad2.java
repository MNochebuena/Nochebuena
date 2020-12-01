package Arrays;

import java.util.Scanner;

public class Actividad2 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);
        int numeros[] = new int[8];
        int cont = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Valor: ");
            numeros[i] = le.nextInt();
            if (numeros[i] % 2 == 0) {
                cont++;
            }
        }

        int numeropar[] = new int[cont];
        cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            int valor;
            if (numeros[i] % 2 == 0) {
                valor = numeros[i];
                numeropar[cont] = valor;
                cont++;
            }
        }

        System.out.println("La longitud del arreglo es de: " + numeropar.length);
        System.out.print("Los valores son: ");
        for (int i : numeropar) {
            System.out.print(i + "-");

        }
    }
}
