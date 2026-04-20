package Client.Network;

import java.io.*;
import java.net.Socket;

public class NetworkClient {
    private final String HOST = "localhost";
    private final int PORT = 8080;
    private static NetworkClient instance;
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    private NetworkClient() {
        try {
            this.socket = new Socket(HOST, PORT);
            this.out = new ObjectOutputStream(socket.getOutputStream());
            this.in = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            System.err.println("Could not connect to server: " + e.getMessage());
        }
    }

}

