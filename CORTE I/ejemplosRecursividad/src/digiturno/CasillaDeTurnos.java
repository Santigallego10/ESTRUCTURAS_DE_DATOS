package digiturno;

import java.util.ArrayList;
import java.util.Date;


public class CasillaDeTurnos {
    private String numeroDeTurno;
    private String fechaDeAsignacion;
    private String horaDeAsignacion;
    private String casillaDeAtencion;

    public CasillaDeTurnos(String numeroDeTurno, String fechaDeAsignacion, String horaDeAsignacion, String casillaDeAtencion) {
        this.numeroDeTurno = numeroDeTurno;
        this.fechaDeAsignacion = fechaDeAsignacion;
        this.horaDeAsignacion = horaDeAsignacion;
        this.casillaDeAtencion = casillaDeAtencion;
    }

    public CasillaDeTurnos() {

    }

    public String getNumeroDeTurno() {
        return numeroDeTurno;
    }

    public void setNumeroDeTurno(String numeroDeTurno) {
        this.numeroDeTurno = numeroDeTurno;
    }

    public String getFechaDeAsignacion() {
        return fechaDeAsignacion;
    }

    public void setFechaDeAsignacion(String fechaDeAsignacion) {
        this.fechaDeAsignacion = fechaDeAsignacion;
    }

    public String getHoraDeAsignacion() {
        return horaDeAsignacion;
    }

    public void setHoraDeAsignacion(String horaDeAsignacion) {
        this.horaDeAsignacion = horaDeAsignacion;
    }

    public String getCasillaDeAtencion() {
        return casillaDeAtencion;
    }

    public void setCasillaDeAtencion(String casillaDeAtencion) {
        this.casillaDeAtencion = casillaDeAtencion;
    }
}
