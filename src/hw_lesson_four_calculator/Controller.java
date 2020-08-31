package hw_lesson_four_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    public TextField textField;
    @FXML
    private TextArea textArea;

    public void onClickBtn1(ActionEvent actionEvent) {
        textArea.appendText("1\n");
    }
}