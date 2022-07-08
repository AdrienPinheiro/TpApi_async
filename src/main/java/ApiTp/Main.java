package ApiTp;

import ApiTp.bo.Humidity;
import ApiTp.bo.Root;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.http.HttpResponse;

import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quelle ville voulez-vous regarder ?");
        String city = scan.nextLine();
        try{
            CompletableFuture<HttpResponse<String>> data = ApiCall.resultCall(city);
            Root root = new ObjectMapper().readValue(data.get().body(), Root.class);
            System.out.println("A "+root.getName() + ", il fait " + root.getHumidity().getTemp_max() + " degré max toute la journée !");

        } catch (IOException | InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
