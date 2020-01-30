package boletin18_2;

import java.util.Random;

/**
 *
 * @author cfigueirasvalverde
 */
class Notas {
    
    private int[] notas = new int[30];

    public void creaArray() {
        Random rand = new Random();
        for (int i = 0; i < notas.length; i++) {
            notas[i] = rand.nextInt(11);  //generamos numeros al azar entre el 1 y 10
            System.out.println(notas[i]);
        }
    }

    public void AprobSuspen() {
        int suspensos = 0;
        int aprobados = 0;
        for (int ele : notas) {
            if (ele < 5) {
                suspensos++;
            } else {
                aprobados++;
            }
        }
        System.out.println(suspensos + " suspensos");
        System.out.println(aprobados + " aprobados");

    }

    public void calcMedia() {
        int total = 0;
        int notasT = 0;
        for (int ele : notas) {
            total += ele;
            notasT++;
        }
        System.out.println("La nota media de la clase es: " + total / notasT);
    }

    public void calcNotaMax() {
        int notaMax = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notaMax) {
                notaMax = notas[i];
            }
        }
        System.out.println("La nota más alta es: " + notaMax);
    }
}