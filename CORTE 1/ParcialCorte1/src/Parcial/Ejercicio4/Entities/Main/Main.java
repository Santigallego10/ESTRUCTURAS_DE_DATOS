package Parcial.Ejercicio4.Entities.Main;

import Parcial.Ejercicio4.Entities.Modulo;
import Parcial.Ejercicio4.Entities.Segment;
import Parcial.Ejercicio4.Entities.UniTurno;
import Parcial.Ejercicio4.Entities.User;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Modulo> modules = new ArrayList<>();
        Map<Integer, User> waitList1 = new TreeMap<>();
        Map<Integer, User> waitList2 = new TreeMap<>();
        Map<Integer, User> waitList3 = new TreeMap<>();
        Modulo modulo1 = new Modulo(1, waitList1);
        Modulo modulo2 = new Modulo(2, waitList2);
        Modulo modulo3 = new Modulo(3, waitList3);

        modules.add(modulo1);
        modules.add(modulo2);
        modules.add(modulo3);

        UniTurno uniTurno = new UniTurno("UniTurnos",modules);

        System.out.println(uniTurno.getModulos().get(0).getNumber());

        while (true){
            String x = JOptionPane.showInputDialog("BIENVENIDO A LA TERMINAL DE TURNOS DE LA UNIVERSIDAD: \n Ingrese el numero de opcion segun lo que desea hacer: \n 1.Solicitar turno \n 2.Ver turnos \n 3.Ver estadisticas \n 4.Mover Turnos");
            switch (x){
                case "1":
                    uniTurno = createTurn(uniTurno);
                    break;
                case "2":
                    listTurns(uniTurno);
                    break;
                case "3":
                    getStats(uniTurno);
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "OPCION NO DISPONIBLE POR AHORA :(");
                    //uniTurno = moveTurns(uniTurno);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion invalida");
                    break;
            }
        }



    }

    private static UniTurno moveTurns(UniTurno uniTurno) {
        User findedUser = null;
        String cedula = JOptionPane.showInputDialog("Ingrese la cedula del usuario que desea mover: ");
        for (int i=0;i < uniTurno.getModulos().size() -1;i++){
            if(uniTurno.getModulos().get(i).getWaitList().isEmpty()){
                break;
            }else {
                for (int j = 0; j < uniTurno.getModulos().get(i).getWaitList().size()-1; j++) {
                    if(uniTurno.getModulos().get(i).getWaitList().get(j).equals(cedula)){

                    }
                }
            }

        }
        System.out.println(findedUser.getId());

        return uniTurno;
    }

    private static void getStats(UniTurno uniTurno) {
        int cont = 0;
        String cadena = "INFORMACION DE LOS MODULOS \n ----------------";
        for (Modulo mod:uniTurno.getModulos()) {
            mod.contTeachers();
            mod.contStudents();
            cadena = cadena + "Modulo "+(cont+1)+" ----------- \n Cantidad de usuarios en fila: "+mod.getWaitList().size()+"\n Cantidad de estudiantes: "+mod.getStudents()+"\n Cantidad de docentes: "+mod.getTeachers()+"\n ----------------";
            cont++;
            System.out.println(cont);
        }
        JOptionPane.showMessageDialog(null, cadena);

    }

    private static int contStudents(UniTurno uniTurno, int i) {
        int cont = 0;
        Modulo mod = uniTurno.getModulos().get(i);
        if(!mod.getWaitList().isEmpty()){
            for (int j = 0; j < mod.getWaitList().size()-1; j++) {
                if (mod.getWaitList().get(j).getSegment() == Segment.ESTUDIANTE){
                    cont++;
                }
            }
        }
        return cont;
    }

    private static int contTeachers(UniTurno uniTurno, int i) {
        int cont = 0;
        Modulo mod = uniTurno.getModulos().get(i);
        if(!mod.getWaitList().isEmpty()) {
            for (int j = 0; j < mod.getWaitList().size() - 1; j++) {
                if (mod.getWaitList().get(j).getSegment() == Segment.DOCENTE) {
                    cont++;
                }
            }
        }
        return cont;
    }

    private static void listTurns(UniTurno uniTurno) {
        String cadena = "LISTA DE TURNOS: \n";
        for (Modulo mod:uniTurno.getModulos()) {
            cadena = cadena + "Modulo "+mod.getNumber() +" = "+ mod.getWaitListString() + "\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }

    private static UniTurno createTurn(UniTurno uniTurno) {
        User user = new User();
        Boolean flag = true;
        while (flag){
            String rol = JOptionPane.showInputDialog("Ingrese el numero segun su segmento: \n 1.Estudiante \n 2.Profesor");
            switch (rol){
                case "1":
                    user.setSegment(Segment.ESTUDIANTE);
                    flag = false;
                    break;
                case "2":
                    user.setSegment(Segment.DOCENTE);
                    flag = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                    flag = true;
                    break;
            }
        }
        String id = JOptionPane.showInputDialog("Ingrese su cedula");
        user.setId(id);

        int random = (int) (Math.random()*3);
        int turns = 0;
        turns = uniTurno.getModulos().get(random).getWaitList().size();
        uniTurno.getModulos().get(random).getWaitList().put(turns+1,user);

        JOptionPane.showMessageDialog(null, "SU TURNO HA SIDO GENERADO CORRECTAMENTE CON LA SIGUIENTE INFORMACION: \n Segmento: "+user.getSegment()+ "\n Cedula: "+user.getId()+"\n modulo: "+(random++));
        return uniTurno;
    }
}
