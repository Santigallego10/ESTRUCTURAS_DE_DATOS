package co.edu.cue.algoritmosParecidosModuloSubasta;

public class Pintura {

    private String nombreAutor;
    private String tecnicaPintura;
    private String temaPintura;

    public Pintura(String nombreAutor, String tecnicaPintura, String temaPintura) {
        this.nombreAutor = nombreAutor;
        this.tecnicaPintura = tecnicaPintura;
        this.temaPintura = temaPintura;
    }

    public Pintura() {
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getTecnicaPintura() {
        return tecnicaPintura;
    }

    public void setTecnicaPintura(String tecnicaPintura) {
        this.tecnicaPintura = tecnicaPintura;
    }

    public String getTemaPintura() {
        return temaPintura;
    }

    public void setTemaPintura(String temaPintura) {
        this.temaPintura = temaPintura;
    }
}
