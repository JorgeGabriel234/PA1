package com.isil.pe;
import java.util.Scanner;

public class VectoPA1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // 1. Crear el vector
        int[] vector = {28, 15, 34, 21, 19, 40, 12, 26};

        // 2. Mostrar el vector con índices
        System.out.println("VECTOR ORIGINAL");
        System.out.println("Índice   Valor");

        for (int i = 0; i < vector.length; i++) {
            System.out.println(i + "        " + vector[i]);
        }

        // 3. Buscar el mayor y el menor
        int mayor = vector[0];
        int menor = vector[0];

        for (int i = 1; i < vector.length; i++) {

            if (vector[i] > mayor) {
                mayor = vector[i];
            }

            if (vector[i] < menor) {
                menor = vector[i];
            }
        }

        System.out.println("\nValor mayor: " + mayor);
        System.out.println("Valor menor: " + menor);

        // 4. Insertar un nuevo valor
        System.out.print("Ingrese el nuevo valor: ");
        int nuevoValor = entrada.nextInt();

        System.out.print("Ingrese la posición: ");
        int posicion = entrada.nextInt();
        if (posicion < 0 || posicion > vector.length) {
            System.out.println("Posición no válida.");
            return;
        }

        int[] nuevoVector = new int[vector.length + 1];

        // Copiar elementos anteriores a la posición
        for (int i = 0; i < posicion; i++) {
            nuevoVector[i] = vector[i];
        }

        // Insertar el nuevo valor
        nuevoVector[posicion] = nuevoValor;

        // Desplazar los elementos restantes
        for (int i = posicion; i < vector.length; i++) {
            nuevoVector[i + 1] = vector[i];
        }

        // Mostrar vector después de insertar
        System.out.println("\nVECTOR DESPUÉS DE INSERTAR " + nuevoValor);

        for (int i = 0; i < nuevoVector.length; i++) {
            System.out.print(nuevoVector[i] + " ");
        }

        // 5. Ordenar de menor a mayor
        for (int i = 0; i < nuevoVector.length - 1; i++) {

            int posicionMenor = i;

            for (int j = i + 1; j < nuevoVector.length; j++) {

                if (nuevoVector[j] < nuevoVector[posicionMenor]) {
                    posicionMenor = j;
                }
            }

            // Intercambio
            int temporal = nuevoVector[i];
            nuevoVector[i] = nuevoVector[posicionMenor];
            nuevoVector[posicionMenor] = temporal;
        }

        // 6. Mostrar vector ordenado
        System.out.println("\n\nVECTOR ORDENADO");

        for (int i = 0; i < nuevoVector.length; i++) {
            System.out.print(nuevoVector[i] + " ");
        }

        // ACTIVIDAD 3 - MATRICES

// 7. Crear la matriz de ocupación
        int[][] aulas = {
                {25, 30, 18, 22, 28},
                {20, 15, 25, 30, 24},
                {32, 28, 20, 18, 26},
                {15, 22, 30, 25, 20}
        };

// 8. Mostrar la matriz con filas, columnas e índices
        System.out.println("\n\nMATRIZ DE OCUPACIÓN");
        System.out.println("       Horario");

        System.out.println("Aula   0   1   2   3   4");

        for (int i = 0; i < aulas.length; i++) {
            System.out.print(" " + i + "    ");

            for (int j = 0; j < aulas[i].length; j++) {
                System.out.print(aulas[i][j] + "  ");
            }

            System.out.println();
        }

// 9. Calcular el total de estudiantes por aula
        System.out.println("\nTOTAL DE ESTUDIANTES POR AULA");

        for (int i = 0; i < aulas.length; i++) {

            int totalAula = 0;

            for (int j = 0; j < aulas[i].length; j++) {
                totalAula += aulas[i][j];
            }

            System.out.println("Aula " + i + ": " + totalAula + " estudiantes");
        }

// 10. Calcular el total de estudiantes por horario
        System.out.println("\nTOTAL DE ESTUDIANTES POR HORARIO");

        for (int j = 0; j < aulas[0].length; j++) {

            int totalHorario = 0;

            for (int i = 0; i < aulas.length; i++) {
                totalHorario += aulas[i][j];
            }

            System.out.println("Horario " + j + ": " + totalHorario + " estudiantes");
        }

// 11. Encontrar la celda con mayor ocupación
        int mayorOcupacion = aulas[0][0];
        int filaMayor = 0;
        int columnaMayor = 0;

        for (int i = 0; i < aulas.length; i++) {

            for (int j = 0; j < aulas[i].length; j++) {

                if (aulas[i][j] > mayorOcupacion) {
                    mayorOcupacion = aulas[i][j];
                    filaMayor = i;
                    columnaMayor = j;
                }
            }
        }

        System.out.println("\nMAYOR OCUPACIÓN");
        System.out.println("Cantidad de estudiantes: " + mayorOcupacion);
        System.out.println("Aula: " + filaMayor);
        System.out.println("Horario: " + columnaMayor);
    }
}


