import java.net.URL;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class C013_WebClient {

  public static void main(String[] args) throws MalformedURLException, IOException {
    URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    conn.setRequestProperty("Accept", "application/json");
    System.out.println(conn.getResponseCode() + " " + conn.getResponseMessage());

    InputStreamReader inputStreamReader = new InputStreamReader(conn.getInputStream());
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    String output;
    while ((output = bufferedReader.readLine()) != null) {
      System.out.println(output);
    }
    conn.disconnect();
  }
}
