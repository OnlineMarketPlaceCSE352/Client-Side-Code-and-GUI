package Client;

import Client.Network.NetworkClient;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        Scanner s = new Scanner(new URL("رابط_الملف_الخاص_بك").openStream());
        int port = Integer.parseInt(s.next().trim());

        // 2. تفعيل الشبكة بالرقم الجديد
        NetworkClient.initialize(port);

        // 3. فتح الواجهة
        Parent root = FXMLLoader.load(getClass().getResource("UI/login-view.fxml"));
        stage.setScene(scene);
        stage.show();
    }
}
