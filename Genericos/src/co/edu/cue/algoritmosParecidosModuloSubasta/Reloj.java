package co.edu.cue.algoritmosParecidosModuloSubasta;

public class Reloj {

    private String marcaReloj;
    private String material;

    public Reloj(String marcaReloj, String material) {
        this.marcaReloj = marcaReloj;
        this.material = material;
    }

    public Reloj() {
    }

    public String getMarcaReloj() {
        return marcaReloj;
    }

    public void setMarcaReloj(String marcaReloj) {
        this.marcaReloj = marcaReloj;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
