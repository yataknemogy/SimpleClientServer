import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static Socket clientSocket;
    public static ServerSocket server;
    public static BufferedReader in;
    public static BufferedWriter out;

    public static void main(String[] args) throws IOException {
        try {
            server = new ServerSocket(3345);
            System.out.println("Server Start!");
            clientSocket = server.accept();
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            // и отправлять
            out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

            String word = in.readLine();
            System.out.println(word);
            out.write("It server, you wrote " + word + "\n");
            out.flush();
        } finally {
            clientSocket.close();
            in.close();
            out.close();
        }
    }
}
