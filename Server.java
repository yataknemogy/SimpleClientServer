import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static Socket clientSocket;
    private static ServerSocket server;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {
        try {
            try {
                server = new ServerSocket(3345);
                System.out.println("Server Start!");
                clientSocket = server.accept();
                try {
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    // и отправлять
                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

                    String word = in.readLine();
                    System.out.println(word);
                    out.write("It server, you wrote " + word + "\n");
                    out.flush();

                }
                finally {
                    clientSocket.close();
                    in.close();
                    out.close();
                }
            }
            finally {
                System.out.println("Server closed!");
                server.close();
            }
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }
}
