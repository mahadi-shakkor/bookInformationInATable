module com.oop.mahadi.bookinformationinatable {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.bookinformationinatable to javafx.fxml;
    exports com.oop.mahadi.bookinformationinatable;
}