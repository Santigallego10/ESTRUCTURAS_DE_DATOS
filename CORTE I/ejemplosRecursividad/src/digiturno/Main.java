package digiturno;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner scp = new Scanner(System.in);
        String nombre = scp.nextLine();
        String apellido = scp.nextLine();
        String identificacion = scp.nextLine();
        String tipoDeAfiliacion = scp.nextLine();

        Scanner sct = new Scanner(System.in);
        String numeroDeTurno = sct.nextLine();
        String fechaDeAsignacion = sct.nextLine();
        String horaDeAsignacion = sct.nextLine();
        String casillaDeAtencion = sct.nextLine();




        Scanner sc = new Scanner(System.in);
        String identificacionCliente = sc.nextLine();



       Drogueria drogueria = new Drogueria();

       drogueria.crearCliente(nombre, apellido,  identificacion,  tipoDeAfiliacion);
       drogueria.crearTurno(numeroDeTurno,  fechaDeAsignacion,  horaDeAsignacion, casillaDeAtencion);

       drogueria.solicitarTurno( identificacionCliente,0 );










    }
}
