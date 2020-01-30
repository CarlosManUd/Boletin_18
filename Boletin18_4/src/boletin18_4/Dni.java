package boletin18_4;

/**
 *
 * @author cfigueirasvalverde
 */
class Dni {
    private int id;
    private final String []letra ={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    public Dni(int id) {
        this.id = id;
    }

    public Dni() {
    }
    
    public int resto(int id){
        this.id = id;
        int resto;
        resto = id%23;
        return resto;
    }
    
    public void calcularLetra(){
        System.out.println("A letra deste dni é: "+letra[this.resto(id)]);
        }
    }