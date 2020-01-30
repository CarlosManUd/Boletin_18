package boletin18_2;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin18_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Notas DAM1 = new Notas();
    DAM1.creaArray();
     System.out.println("*********************************************");
    DAM1.AprobSuspen();
     System.out.println("*********************************************");
    DAM1.calcMedia();
        System.out.println("*********************************************");
    DAM1.calcNotaMax();
    }
    
}