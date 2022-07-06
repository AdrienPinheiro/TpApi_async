package JokeTP;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class JokeReader {
    static Path path = Paths.get("src/resources", "jokes.txt");

    public static void main(String[] args) throws IOException {
        int choiceMenu;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1 - Selectionner une blague");
            System.out.println("2 - Ajouter une blague");
            System.out.println("99 - Sortir");
            choiceMenu = scan.nextInt();
            switch (choiceMenu) {
                case 1 -> {
                    List<String> listJoke = allLines();
                    System.out.println("Veuillez choisir une blague (entre 1 et "+listJoke.size()+"), seulement des nombres entiers");
                    int choice = scan.nextInt();
                    String blagueChoice = choiceJoke(choice);
                    System.out.println(blagueChoice);
                }
                case 2 -> {
                    System.out.println("Quelle est la blague ?");
                    scan.nextLine();
                    String quest = scan.nextLine();
                    System.out.println("Et la réponse ?");
                    String resp = scan.nextLine();
                    boolean blague = addJoke(quest, resp);
                    if (!blague) System.out.println("Problème lors d'ajout de la blague");
                    if (blague) System.out.println("Votre blague a été ajouté !");
                }
                case 99 -> {
                    System.out.println("Aurevoir ! :D");
                }
                default -> {
                    System.out.println("Vous n'avez pas selectionné le bon menu.");
                }
            }
        } while (choiceMenu != 99);
    }

    public static List<String> allLines() throws IOException {
        List<String> content = Files.readAllLines(path);
        List<String> contentSelect = new ArrayList<String>();
        for(int i = 0; i < content.size();i = i + 2){
            contentSelect.add(content.get(i) +" "+ content.get(i + 1));
        }
        return contentSelect;
    }
    public static String choiceJoke(int choice) throws IOException {
        List<String> contentSelect = allLines();
        String jokeChoice = contentSelect.get(choice-1);
        return jokeChoice;
    }
    public static boolean addJoke(String quest, String resp) throws IOException{
        List<String> contentSelect = allLines();
        String blague = contentSelect.size()+1 + ". " + quest + "\n";
        String response = "Réponse : " + resp + "\n";
        Files.writeString(path, blague, StandardOpenOption.APPEND);
        Files.writeString(path, response, StandardOpenOption.APPEND);
        return true;
    }
}
