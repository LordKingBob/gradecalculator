module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens com.cookiebytes.gradecalculator to javafx.fxml;
    exports com.cookiebytes.gradecalculator;
}