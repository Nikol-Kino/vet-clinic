package main.java.com.magicvet.model;

import java.util.Objects;

public abstract class Pet{

    private String type;
    private String sex;
    private int age;
    private String name;
    private String ownerName;
    private HealthState healthState;

    public Pet(){}
    public Pet(int age){
        this.age = age;
    }
    public Pet (String type, HealthState healthState){
        this.type = type;
        this.healthState = healthState;
    }

    @Override
    public String toString(){
        return  "\nPet: " + type
                + "\nSex: " + sex
                + "\nAge: " + age
                + "\nName: " + name
                + "\nOwner name: " + ownerName;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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
