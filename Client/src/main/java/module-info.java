module com.client.client {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.client.client to javafx.fxml;
    exports com.client.client;
}