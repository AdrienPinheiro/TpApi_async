package ApiTp;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quelle ville voulez-vous regarder ?");
        String city = scan.nextLine();
        try{
            String call = ApiCall.resultCall(city).body();
            List<String> result = List.of(call.split("}"));
            System.out.println(call);
            for (String str : result) {

            }
            //HttpHeaders headers = response.headers();
            //headers.map().forEach((k, v) -> System.out.println(k + ":" + v));
            //System.out.println(response.statusCode());
            //System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
