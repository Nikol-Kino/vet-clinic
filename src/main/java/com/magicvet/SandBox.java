package main.java.com.magicvet;

import main.java.com.magicvet.comparator.AnimalAgeComparator;
import main.java.com.magicvet.comparator.DogSizeComparator;
import main.java.com.magicvet.model.Cat;
import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;

import java.util.Arrays;

public class SandBox {

    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog(Dog.M),
                new Dog(Dog.S),
                new Dog(Dog.XL),
                new Dog(Dog.XL),
                new Dog(Dog.XS),
                new Dog(Dog.S),

        };

        Arrays.sort(dogs, new DogSizeComparator());

        for (Dog dog: dogs){
            System.out.println(dog.getSize());
        }

        Pet[] pets = {new Cat(3),
                new Cat(5),
                new Cat(3),
                new Dog(9),
                new Cat(11),
                new Cat(12),
                new Dog(14)
        };

        Arrays.sort(pets, new AnimalAgeComparator());

        for (Pet pet: pets){
            System.out.println(pet.getAge());
        }
    }

}
