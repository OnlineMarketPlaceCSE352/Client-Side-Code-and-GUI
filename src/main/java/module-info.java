module ClientModule {
    requires javafx.controls;
    requires javafx.fxml;

    // This allows JavaFX to access the 'Client' package
    opens Client to javafx.graphics, javafx.fxml;
    exports Client;
}