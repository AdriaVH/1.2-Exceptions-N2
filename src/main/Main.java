package main;

import classes.Input;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        byte age = Input.readByte("Introdueix la teva edat: ");
        int year = Input.readInt("Introdueix l'any: ");
        float weight = Input.readFloat("Introdueix el teu pes (en kg): ");
        double height = Input.readDouble("Introdueix la teva alçada (en metres): ");
        char gender = Input.readChar("Introdueix el teu sexe (M/F): ");
        String name = Input.readString("Introdueix el teu nom: ");
        boolean isMarried = Input.readBoolean("Estàs casat? (y/n): ");

        System.out.println("\nANSWERS:\n");
        System.out.println("Edat: " + age);
        System.out.println("Any: " + year);
        System.out.println("Pes: " + weight + " kg");
        System.out.println("Alçada: " + height + " metres");
        System.out.println("Sexe: " + gender);
        System.out.println("Nom: " + name);
        System.out.println("Està casat: " + (isMarried ? "Yes" : "No"));

    }
}