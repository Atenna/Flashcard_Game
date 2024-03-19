module com.ivankaelde.newproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    opens com.ivankaelde.newproject;
    exports com.ivankaelde.newproject;
    exports com.ivankaelde.newproject.controller;
    opens com.ivankaelde.newproject.controller;
}
