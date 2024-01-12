package main.java.com.magicvet.component;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Client;
import main.java.com.magicvet.model.Pet;
import main.java.com.magicvet.service.ClientService;
import main.java.com.magicvet.service.PetService;


public class ApplicationRunner {

    private final ClientService clientService = new ClientService();
    private final PetService petService = new PetService();

    public void run (){
        if (Authenticator.auth()){
            Client client = clientService.registerNewClient();

            if (client != null){
                String createPetNow;

                do {
                    System.out.println("Do you want to adding your pet now? (yes / no)");
                    createPetNow = Main.SCANNER.nextLine();
                    if (createPetNow.equals("no")){
                        System.out.println("The program is closed.");
                        break;
                    }
                }while (!createPetNow.equals("yes"));

                if (createPetNow.equals("yes")) {
                    System.out.println("Adding a new pet!");
                    Pet pet = petService.registerNewPet();

                    if (pet != null){
                        client.setPet(pet);
                        pet.setOwnerName(client.getFirstName() + " " + client.getLastName());
                        System.out.println("Pet has been added.");
                    }
                    System.out.println(client);
                }
            }
        }
    }
}
