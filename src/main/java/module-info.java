module com.ubp.edu.ar.clinicaapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.ubp.edu.ar.clinicaapp to javafx.fxml;
    exports com.ubp.edu.ar.clinicaapp;
}