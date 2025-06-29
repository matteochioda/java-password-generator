import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) throws Exception {
        
        // Scan
        Scanner scan = new Scanner(System.in);


        // Nome
        System.out.print("Inserisci il tuo nome: ");

        String name = scan.nextLine();

        
        // Cognome
        System.out.print("Inserisci il tuo cognome: ");

        String surname = scan.nextLine();

        
        // Colore Preferito
        System.out.print("Inserisci il tuo colore preferito: ");

        String favouriteColor = scan.nextLine();


        // Colore Preferito
        System.out.print("Inserisci la tua data di nascita (dd/mm/yyyy): ");

        String dateOfBirth = scan.next();


        //Stampare risultati
        System.out.println();

        // Stampa Nome
        String outputName = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println("Nome: " + outputName);

        // Stampa Cognome
        String outputSurname = surname.substring(0, 1).toUpperCase() + surname.substring(1);
        System.out.println("Cognome: " + outputSurname);

        // Stampa Colore
        System.out.println("Colore Preferito: " + favouriteColor);

        // Stampa Data di Nascita
        System.out.println("Data di nascita: " + dateOfBirth);

        String[] separateDateOfBirth = dateOfBirth.split("/");

        int day = Integer.parseInt(separateDateOfBirth[0]);
        int month = Integer.parseInt(separateDateOfBirth[1]);
        int year = Integer.parseInt(separateDateOfBirth[2]);


        // Stampa Password
        System.out.println();

        System.out.println("Password: " + outputName.replace(" ", "") + "-" + outputSurname.toLowerCase().replace(" ", "") + "-" + favouriteColor.toLowerCase().replace(" ", "") + "-" + (day + month + year));
    }

}
