module com.gooofarm.gooofarm {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.gooofarm.gooofarm to javafx.fxml;
    exports com.gooofarm.gooofarm;
    exports com.gooofarm;
    opens com.gooofarm to javafx.fxml;
}