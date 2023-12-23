package main.java.com.magicvet.model;

import java.util.Objects;

public class Dog extends Pet{
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
