package main.java.com.magicvet.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Pet{
    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
    private String type;
    private String sex;
    private String age;
    private String name;
    private String ownerName;
    private HealthState healthState;

    private final LocalDateTime registrationDate = LocalDateTime.now();

    public Pet(){}
    public Pet(String age){
        this.age = age;
    }
    public Pet (String type, HealthState healthState){
        this.type = type;
        this.healthState = healthState;
    }

    @Override
    public String toString(){
        return  "Pet: {"
                + "\n\tType: " + type
                + "\n\tSex: " + sex
                + "\n\tAge: " + age
                + "\n\tName: " + name
                + "\n\tOwner name: " + ownerName
                + "\n\tRegistration Date: " + registrationDate.format(FORMAT)
                + "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(type, pet.type) && Objects.equals(sex, pet.sex) && Objects.equals(age, pet.age) && Objects.equals(name, pet.name) && Objects.equals(ownerName, pet.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sex, age, name, ownerName);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public HealthState getHealthState(){
        return healthState;
    }

    public enum HealthState {
        VERYBAD(1),
        BAD(2),
        MEDIUM(3),
        LIGHT(4),
        PERFECT(5),
        UNKNOWN(0)
        ;


        private final int stateValue;

        HealthState(int stateValue){
            this.stateValue = stateValue;
        }

        public int getStateValue() {
            return stateValue;
        }
    }

}
