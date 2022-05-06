package co.edu.cue.procesoDeAtencion;

import java.util.ArrayList;

public class Universidad {
    private  String nombreUniversidad;
    private TerminalDeLlamado terminalDeLlamado;
    ArrayList<Estudiante> estudiantes =new ArrayList<>();
    ArrayList<Docente> docentes = new ArrayList<>();

    public Universidad() {
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public TerminalDeLlamado getTerminalDeLlamado() {
        return terminalDeLlamado;
    }

    public void setTerminalDeLlamado(TerminalDeLlamado terminalDeLlamado) {
        this.terminalDeLlamado = terminalDeLlamado;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(ArrayList<Docente> docentes) {
        this.docentes = docentes;
    }


    Estudiante estudiante = new Estudiante();
    public void crearEstudiante(){
        estudiante.getCedula();
        estudiantes.add(estudiante);

    }


    Docente docente = new Docente();
    public  void crearDocente(){
        docente.getCedula();
        docentes.add(docente);
    }




    public void solicitarTurno( String cedula, String segmento){

        if(segmento.equals(estudiante)){

        }
    }





}