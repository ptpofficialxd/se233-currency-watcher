module se233.chapter2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;
    requires org.apache.commons.io;


    opens se233.chapter2 to javafx.fxml;
    exports se233.chapter2;
}