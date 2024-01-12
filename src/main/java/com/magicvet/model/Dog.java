package main.java.com.magicvet.model;

import java.util.Comparator;
import java.util.Objects;

public class Dog extends Pet {

    public static final String XS = "XS";
    public static final String S = "S";
    public static final String M = "M";
    public static final String L = "L";
    public static final String XL = "XL";

    public Dog(){

    }
    public Dog (int age){
        super(age);
    }
    public Dog(String size){
        this.size = size;
    }

    private Pet pet;
    private String size;



    @Override
    public String toString(){

        return    "\nPet: " + getType()
                + "\nSex: " + getSex()
                + "\nAge: " + getAge()
                + "\nName: " + getName()
                + "\nOwner name: " + getOwnerName()
                + "\nSize: " + size
                + "\n";
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
