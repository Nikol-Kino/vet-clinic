package main.java.com.magicvet.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Client {
    private static final DateTimeFormatter FORMATTERUSERDATE = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    private String firstName;
    private String lastName;
    private String email;
    private Pet pet;
    private Dog dog;

    private LocalDateTime registrationClientDate = LocalDateTime.now();

    @Override
    public String toString (){
        return "Client {"
                + "\n\tFirst name: " + firstName
                + "\n\tLast name: " + lastName
                + "\n\temail: " + email
                + "\n\tRegistration Date: " + registrationClientDate.format(FORMATTERUSERDATE)
                +"\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(firstName, client.firstName)
                && Objects.equals(lastName, client.lastName)
                && Objects.equals(email, client.email)
                && Objects.equals(pet, client.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, pet);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}




