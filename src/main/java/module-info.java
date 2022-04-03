module com.nischay.pokequiz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nischay.pokequiz to javafx.fxml;
    exports com.nischay.pokequiz;
}