module com.example.labo9diegomejia {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labo9diegomejia to javafx.fxml;
    exports com.example.labo9diegomejia;
}