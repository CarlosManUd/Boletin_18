package boletin_18;

import java.util.Random;

/**
 *
 * @author cfigueirasvalverde
 */
class NumerosRand {
    public int[] nAleatorios = new int[6];
    
    public void arrayAleatorio(){
        Random rand = new Random();
        int nRand=0;
        
        for(int i = 0;i<nAleatorios.length; i++){
            nRand = rand.nextInt(51); //generamos numeros aleatorios entre 1 y 50
            nAleatorios[i]=nRand; //guardamos el número en el array
            System.out.println(nAleatorios[i]);
            
        }
    }
    
    public void arrayReves(){
        for(int i=5;i>-1;i--){
            System.out.println(nAleatorios[i]);//mostramos el array os revés
        }
    }
}