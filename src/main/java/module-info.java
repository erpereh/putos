module com.example.putos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.putos to javafx.fxml;
    exports com.example.putos;
}