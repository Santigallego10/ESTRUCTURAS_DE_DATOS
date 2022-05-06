package digiturno;

public class Cliente {

    private String nombre;
    private String apellido;
    private String identificacion;
    private String tipoDeAfiliacion;

    public Cliente(String nombre, String apellido, String identificacion, String tipoDeAfiliacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.tipoDeAfiliacion = tipoDeAfiliacion;
    }

    public Cliente() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoDeAfiliacion() {
        return tipoDeAfiliacion;
    }

    public void setTipoDeAfiliacion(String tipoDeAfiliacion) {
        this.tipoDeAfiliacion = tipoDeAfiliacion;
    }
}
