module com.example.chartbuild {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chartbuild to javafx.fxml;
    exports com.example.chartbuild;
}