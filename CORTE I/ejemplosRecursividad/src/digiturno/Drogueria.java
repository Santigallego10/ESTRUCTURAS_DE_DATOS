package digiturno;

import java.util.ArrayList;
import java.util.Date;

public class Drogueria {
    private String nombreDrog;
    private String nit;
    private ArrayList<CasillaDeTurnos> listaDeTurnos = new ArrayList<>();
    private ArrayList<Cliente> listaDeClientes = new ArrayList<>();


    public Drogueria(String nombreDrog, String nit, ArrayList<CasillaDeTurnos> listaDeTurnos, ArrayList<Cliente> listaDeClientes) {
        this.nombreDrog = nombreDrog;
        this.nit = nit;
        this.listaDeTurnos = listaDeTurnos;
        this.listaDeClientes = listaDeClientes;
    }

    public Drogueria() {

    }


    public String getNombreDrog() {
        return nombreDrog;
    }

    public void setNombreDrog(String nombreDrog) {
        this.nombreDrog = nombreDrog;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<CasillaDeTurnos> getListaDeTurnos() {
        return listaDeTurnos;
    }

    public void setListaDeTurnos(ArrayList<CasillaDeTurnos> listaDeTurnos) {
        this.listaDeTurnos = listaDeTurnos;
    }

    public ArrayList<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }




    public void crearCliente(String nombre, String apellido, String identificacion, String TipoDeAfiliacion){

        Cliente cliente = new Cliente();

        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setIdentificacion(identificacion);
        cliente.setTipoDeAfiliacion(TipoDeAfiliacion);
        listaDeClientes.add(cliente);


    }

    public void crearTurno(String numeroDeTurno, String fechaDeAsignacion, String horaDeAsignacion, String casillaDeAtencion){

       CasillaDeTurnos turno = new CasillaDeTurnos();

       turno.setNumeroDeTurno(numeroDeTurno);
       turno.setFechaDeAsignacion(fechaDeAsignacion);
       turno.setHoraDeAsignacion(horaDeAsignacion);
       turno.setCasillaDeAtencion(casillaDeAtencion);
       listaDeTurnos.add(turno);

    }


public void solicitarTurno(String identificacionCliente,int  i){



      if (listaDeClientes.get(i).getIdentificacion().equals(identificacionCliente)){
          System.out.println(listaDeTurnos.get(i));
      }else{
          System.out.println("No es un usuario registrado");
          solicitarTurno(identificacionCliente, i +1);
      }


  }



}















