package App;

public class House {

    private int number;
    private type houseType;

    public House(){

    }

    public House(int number, type houseType) {
        this.number = number;
        this.houseType = houseType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public type getHouseType() {
        return houseType;
    }

    public void setHouseType(type houseType) {
        this.houseType = houseType;
    }

    @Override
    public String toString() {
        return "House{" +
                "number=" + number +
                ", houseType=" + houseType +
                '}';
    }
}
