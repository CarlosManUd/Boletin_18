package boletin18_3;

/**
 *
 * @author cfigueirasvalverde
 */
class Alumnos {
    
   private int notas;
   private String nome;

    public Alumnos(int notas, String nome) {
        this.notas = notas;
        this.nome = nome;
    }

    public Alumnos() {
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return"Alumno: " + nome + ", " + notas;
    }
    
    
}