module com.example.moviedle {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;

    opens com.example.moviedle to javafx.fxml;
    exports com.example.moviedle;
}