// Key: acf0b605
package br.com.alura.poo;

import br.com.alura.poo.exception.IllegalYearException;
import br.com.alura.poo.models.Movies;
import br.com.alura.poo.models.Title;
import br.com.alura.poo.models.TitleApi;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApi {
  public static void main(String[] args) throws IOException, InterruptedException {
    var scanner = new Scanner(System.in);
    var search = "";
    var movieList = new ArrayList<Movies>();

    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    while(!search.equalsIgnoreCase("exit")){
      System.out.println("Digite o nome do filme: ");
      search = scanner.nextLine();

      String url = "https://www.omdbapi.com/?apikey=acf0b605&t=" + search;

      HttpClient client = HttpClient.newHttpClient();

      HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create(url))
              .build();

      HttpResponse<String> response = client
              .send(request, BodyHandlers.ofString());

      String movie = response.body();
      System.out.println(response.body());


      try {
        Movies myMovie = new Movies(gson.fromJson(movie, TitleApi.class));
        movieList.add(myMovie);
        System.out.println(myMovie);
      }
      catch (NumberFormatException | IllegalYearException e){
        System.out.println("\nIncorrect release year format:\n" + e.getMessage());
      }
      catch (IllegalArgumentException e){
        System.out.println("\nEndereço de busca inválido:\n" + e.getMessage());
      }
    }

    var writer = new FileWriter("movies.json");
    writer.write(gson.toJson(movieList));
    writer.close();
  }
}
