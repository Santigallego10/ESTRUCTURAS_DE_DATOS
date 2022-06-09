package co.edu.cue.algoritmosParecidosModuloSubasta;

public class Joya {

    private String nombreJoya;
    private String peso;

    public Joya(String nombreJoya, String peso) {
        this.nombreJoya = nombreJoya;
        this.peso = peso;
    }

    public Joya() {
    }

    public String getNombreJoya() {
        return nombreJoya;
    }

    public void setNombreJoya(String nombreJoya) {
        this.nombreJoya = nombreJoya;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
}
