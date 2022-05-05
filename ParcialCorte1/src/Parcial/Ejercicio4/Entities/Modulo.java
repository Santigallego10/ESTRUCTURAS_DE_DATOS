package Parcial.Ejercicio4.Entities;

import java.util.Map;
import java.util.TreeMap;

public class Modulo {
    private int number;
    private int students;
    private int teachers;
    private Map<Integer, User> waitList = new TreeMap<>();

    public Modulo(){

    }

    public void contTeachers(){
        int cont = 0;
        for (User user:waitList.values()) {
            if(user.getSegment() == Segment.DOCENTE){
                cont++;
            }
        }
        this.teachers = cont;
    }

    public void contStudents(){
        int cont = 0;
        for (User user:waitList.values()) {
            if(user.getSegment() == Segment.ESTUDIANTE){
                cont++;
            }
        }
        this.students = cont;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public int getTeachers() {
        return teachers;
    }

    public void setTeachers(int teachers) {
        this.teachers = teachers;
    }

    public Modulo(int number, Map<Integer, User> waitList) {
        this.number = number;
        this.waitList = waitList;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Map<Integer, User> getWaitList() {
        return waitList;
    }

    public String getWaitListString() {
        String cadena = "";
        for (User user:this.waitList.values()) {
            cadena = cadena + user.getId() +", ";
        }
        return cadena;
    }

    public void setWaitList(Map<Integer, User> waitList) {
        this.waitList = waitList;
    }
}
