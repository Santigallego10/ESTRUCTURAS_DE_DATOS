package Ejercicio4;

public class Info {
    private int code;
    private String name;
    private Enum Types;

    public Info(int code, String name, Enum types) {
        this.code = code;
        this.name = name;
        Types = types;
    }

    public Info() {
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Enum getTypes() {
        return Types;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypes(Enum types) {
        Types = types;
    }

    @Override
    public String toString() {
        return "Info{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", Types=" + Types +
                '}';
    }
}
