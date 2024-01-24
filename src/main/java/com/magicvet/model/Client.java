package main.java.com.magicvet.model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private static final DateTimeFormatter FORMATTERUSERDATE = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    private String firstName;
    private String lastName;
    private String email;

    private List<Pet> pets = new ArrayList<>();

    private final LocalDateTime registrationClientDate = LocalDateTime.now();

    @Override
    public String toString (){
        return "Client {"
                + "\n\tFirst name: " + firstName
                + "\n\tLast name: " + lastName
                + "\n\temail: " + email
                +"\n\tpets: " + pets
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
                && Objects.equals(pets, client.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, pets);
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

    public List<Pet> getPets() {
        return pets;
    }

    public void setPet(List<Pet> pets) {
        this.pets = pets;
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }

}




