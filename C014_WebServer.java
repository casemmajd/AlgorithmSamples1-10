import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class C014_WebServer {

  public static void main(String[] args) throws Exception {
    System.out.println("The URL of this server is http://localhost:8000/test");

    HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
    server.createContext("/test", new MyHandler());
    server.setExecutor(null); // creates a default executor
    server.start();
  }

  static class MyHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange t) throws IOException {
      String response = "{param1: 1, param2: 2}";
      t.getResponseHeaders().set("Content-Type", "applicaiton/json");
      t.sendResponseHeaders(200, response.length()); // Note: the response.length() is bad, it should have been response.getBytes().length. Even then, the getBytes() method must explicitly specify the charset which you then specify in the response header.
      OutputStream os = t.getResponseBody();
      os.write(response.getBytes());
      os.close();
    }
  }
}
