package co.edu.cue.procesoDeAtencion;

import java.util.HashMap;
import java.util.Map;

public class TerminalDeLlamado {
    private String cedulaPersona;
    private  String tipoDeSegmento;
    private Map<String,String> Modulo = new HashMap<>();

    public TerminalDeLlamado() {
    }

    public String getCedulaPersona() {
        return cedulaPersona;
    }

    public void setCedulaPersona(String cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
    }

    public String getTipoDeSegmento() {
        return tipoDeSegmento;
    }

    public void setTipoDeSegmento(String tipoDeSegmento) {
        this.tipoDeSegmento = tipoDeSegmento;
    }

    public Map<String, String> getModulo() {
        return Modulo;
    }

    public void setModulo(Map<String, String> modulo) {
        Modulo = modulo;
    }
}
