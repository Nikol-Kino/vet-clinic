package main.java.com.magicvet.model;

public class Cat extends Pet{
    private int age;
    public Cat(){}
    public Cat(int age){
        super(age);
    }
    public Cat(String type, HealthState healthState){
        super(type, healthState);
    }
}
