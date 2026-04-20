package Client.Network;

import java.io.*;
import java.net.Socket;

public class NetworkClient {
    private final String HOST = "bore.pub";
    private static int port;
    private static NetworkClient instance;
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    private NetworkClient(int port) {
        try {
            this.socket = new Socket(HOST, port);
            this.out = new ObjectOutputStream(socket.getOutputStream());
            this.in = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            System.err.println("Could not connect to server: " + e.getMessage());
        }
    }
    public static NetworkClient getInstance() {
        if (instance == null) {
            if (port == 0) {
                throw new IllegalStateException("Please call initialize(port) first!");
            }
            instance = new NetworkClient(port);
        }
        return instance;
    }
    public static void initialize(int portNumber) {
        port = portNumber;
    }
    // 6. ميثود الإرسال (Send): تأخذ أي كائن (مثل طلب JSON) وترسله فوراً
    public void sendRequest(Object request) {
        try {
            out.writeObject(request);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 7. ميثود الاستقبال (Receive): تنتظر رد السيرفر وتعيده لك ككائن
    public Object receiveResponse() {
        try {
            return in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

}

