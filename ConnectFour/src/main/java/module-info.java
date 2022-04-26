module com.rathin.connectfour {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rathin.connectfour to javafx.fxml;
    exports com.rathin.connectfour;
}