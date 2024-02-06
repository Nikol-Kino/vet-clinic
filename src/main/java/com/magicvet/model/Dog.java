package main.java.com.magicvet.model;
import java.util.Objects;

public class Dog extends Pet {


    public Dog(){

    }
    public Dog (String age){
        super(age);
    }
    public Dog(Size size){
        this.size = size;
    }
    public Dog(String type, HealthState healthState){
        super(type, healthState);
    }

    private Pet pet;
    private Size size;



    @Override
    public String toString(){
        return  "Pet: {"
                + "\n\tType: " + getType()
                + "\n\tSex: " + getSex()
                + "\tAge: " + getAge()
                + "\n\tName: " + getName()
                + "\tSize: " + getSize()
                + "\t\tOwner name: " + getOwnerName()
                + "\n\tRegistration Date: " + getRegistrationDate().format(FORMAT)
                + "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(size, dog.size) && Objects.equals(pet, dog.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size, pet);
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public enum Size {
        XS(1),
        S(2),
        M(3),
        L(4),
        XL(5),
        UNKNOWN(0);

        private final int value;

        Size (int value){
            this.value = value;
        }

        public static Size fromString(String value) {
            for (Size size : values()){
                if (size.toString().equals(value)){
                    return size;
                }
            }

            System.out.println("Unable to parse value '" + value + "'. using default value " + UNKNOWN);

            return UNKNOWN;
        }
        public int getValue() {
            return value;
        }
    }
}
