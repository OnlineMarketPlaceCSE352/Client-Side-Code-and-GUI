package Client; // Matches your folder name exactly

import Client.Models.Product;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Launcher extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Marketplace Client");

        Label header = new Label("Distributed Marketplace Login");
        TextField userField = new TextField();
        userField.setPromptText("Username");

        PasswordField passField = new PasswordField();
        passField.setPromptText("Password");

        Button loginBtn = new Button("Login");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(header, userField, passField, loginBtn);

        loginBtn.setOnAction(e -> {
            System.out.println("Login attempt: " + userField.getText());
        });

        Scene scene = new Scene(layout, 350, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
        //Product p = new Product("nitendo switch",499.9,"mario");
    }
}