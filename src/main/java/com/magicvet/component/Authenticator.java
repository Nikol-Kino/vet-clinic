package main.java.com.magicvet.component;

import main.java.com.magicvet.Main;

import java.util.Scanner;

public class Authenticator {
    private static String PASSWORD = "d";

    public static boolean auth(){
        boolean accepted = false;
        for (int i = 0; i < 3; i++){
            System.out.print("Password: ");
            String input = Main.SCANNER.nextLine();

            if (PASSWORD.equals(input)){
                accepted = true;
                break;
            }else {
                System.out.println("access denied. Please check your password");
            }
        }
        System.out.println(accepted ? "Wellcome to the vet" : "Application has been blocked");

        return accepted;
    }

}
