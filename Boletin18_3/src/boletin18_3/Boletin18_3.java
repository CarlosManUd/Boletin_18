package boletin18_3;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin18_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Alumnos[] DAM1 = new Alumnos[30];
    Alumnos[] suspensos = new Alumnos[30];
    Alumnos[] aprobados = new Alumnos[30];
    
    Notas dam = new Notas();
    
    dam.creaArray(DAM1);
     System.out.println("**MOSTRANDO ARRAY DAM1**");
     
    dam.mostrar(DAM1);
     System.out.println("**MOSTRANDO SUSPENSOS**");
     
    dam.suspensos(DAM1,suspensos);
    dam.mostrar(suspensos);
    System.out.println("**MOSTRANDO APROBADOS**");
    
    dam.aprobados(DAM1, aprobados);
    dam.mostrar(aprobados);
    System.out.println("***MOSTRANDO ALUMNO***");
    
    dam.amosarAlumno(DAM1, "Alumno 5");
    System.out.println("***MOSTRANDO ALUMNO POR TECLADO***");
    
    dam.amosarAlumno(DAM1);
    System.out.println("***MOSTRANDO MAXIMA NOTA***");
    
    dam.calcNotaMax(DAM1);
    System.out.println("***MOSTRANDO MEDIA***");
    
    dam.calcMedia(DAM1);
    System.out.println("***MOSTRANDO ORDEN NOTAS***");
    
    dam.sortNotas(DAM1);
    
    dam.mostrar(DAM1);
    }
    
}
