module com.jmarques.friendsplit {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires validatorfx;

    opens com.jmarques.friendsplit to javafx.fxml;
    exports com.jmarques.friendsplit;
}