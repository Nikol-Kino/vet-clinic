package main.java.com.magicvet;
import main.java.com.magicvet.model.Cat;
import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;

import java.util.Arrays;
import java.util.Comparator;

public class SandBox {

    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog(Dog.Size.M),
                new Dog(Dog.Size.S),
                new Dog(Dog.Size.XL),
                new Dog(Dog.Size.XL),
                new Dog(Dog.Size.XS),
                new Dog(Dog.Size.S),

        };
        Arrays.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getSize().getValue() - o2.getSize().getValue();
            }
        });

        for (Dog dog: dogs){
            System.out.println(dog.getSize());
        }

        Pet[] pets = {
                new Dog(4),
                new Cat(5),
                new Dog(2),
                new Cat(1)
        };

        Arrays.sort(pets, new Comparator<Pet>() {
            @Override
            public int compare(Pet pet1, Pet pet2) {
                return pet1.getAge() - pet2.getAge();
            }
        });

        for (Pet pet: pets){
            System.out.println(pet.getAge());
        }

        Pet[] petsHealtState = {
                new Cat("Tommy", Pet.HealthState.BAD),
                new Dog("Javy", Pet.HealthState.LIGHT),
                new Cat("Gatto", Pet.HealthState.MEDIUM),
                new Dog("Giggio", Pet.HealthState.VERYBAD)

        };

        Arrays.sort(petsHealtState, new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.getHealthState().getStateValue() - o2.getHealthState().getStateValue();
            }
        });

        for (Pet petsState : petsHealtState ) {
            System.out.println("Name: " + petsState.getType() + " have a " + petsState.getHealthState() + " health state");
        }
    }

}
