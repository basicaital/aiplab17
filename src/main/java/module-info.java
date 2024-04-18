module com.example.aiplab17 {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.aiplab17 to javafx.fxml;
    exports com.example.aiplab17;
    exports examples;
    opens examples to javafx.fxml;
    opens com.example.aiplab17.task14 to javafx.fxml;
    exports com.example.aiplab17.task14;
    opens com.example.aiplab17.task15;
    exports com.example.aiplab17.task15;

}