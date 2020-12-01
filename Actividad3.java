package Arrays;

import java.util.Scanner;

public class Actividad3 {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int cant;
        String palabra, op;
        float cal = 0;

        System.out.println("Cantidad de alumnos: ");
        cant = le.nextInt();
        
        String datosAlumno[][] = new String[cant][2];
        float calificaciones[][] = new float[cant][6];
        
        System.out.println("Datos del alumno (Matricula/Nombre)");
        for (int columnas = 0; columnas < cant; columnas++) {
            for (int filas = 0; filas < 2; filas++) {
                System.out.print("Dato: ");
                datosAlumno[columnas][filas] = le.next();
            }
        }
        
        for (int columnas = 0; columnas < cant; columnas++) {
            for (int filas = 0; filas < 5; filas++) {
                System.out.println("Calificacion " + (filas + 1) + " del alumno");
                calificaciones[columnas][filas] = le.nextFloat();
                cal = cal + calificaciones[columnas][filas];
            }
            calificaciones[columnas][5] = cal / 5;
            cal = 0;
        }
        
        System.out.println("Buscar por matricula o nombre");
        op = le.next();
        System.out.println("Buscar: ");
        palabra = le.next();
        if (op.equalsIgnoreCase("matricula")) {
            for (int i = 0; i < cant; i++) {
                if (palabra.equals(datosAlumno[i][0])) {
                    System.out.println("La matricula: " + palabra + " pertenece al alumno " + datosAlumno[i][1]
                            + " y su calificaciones son: (La ultima calificación es el promedio)");
                    for (int columna = 0; columna < 6; columna++) {
                        System.out.print(calificaciones[i][columna] + "-");
                    }
                }else {
                    System.out.println("Matricula no encontrada");
                }
            }
        }
        
        if (op.equalsIgnoreCase("nombre")) {
            for (int i = 0; i < cant; i++) {
                if (palabra.equalsIgnoreCase(datosAlumno[i][1])) {
                    System.out.println("La matricula: " + datosAlumno[i][0] + " pertenece al alumno " + palabra
                            + " y su calificaciones son: (La ultima calificación es el promedio)");
                    for (int columna = 0; columna < 6; columna++) {
                        System.out.print(calificaciones[i][columna] + "-");
                    }
                }else{
                    System.out.println("Nombre invalido");
                }
            }
        }
    }
}
