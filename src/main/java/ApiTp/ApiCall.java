package ApiTp;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

public class ApiCall {
    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    private static HttpRequest apiCall(String city){
        String apiKey = "8118ed6ee68db2debfaaa5a44c832918";
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&lang=fr&units=metric&appid="+ apiKey;
        return HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .setHeader("Content-Type", "application/json; charset=UTF-8")
                .build();
    }

    public static CompletableFuture<HttpResponse<String>> resultCall(String city) throws IOException, InterruptedException {
        return httpClient.sendAsync(apiCall(city), HttpResponse.BodyHandlers.ofString());
    }
}
