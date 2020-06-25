package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField textField;
    @FXML
    public Label label;
    @FXML
    public TextArea textArea;

    public void saveTextButton(ActionEvent actionEvent) {
    textArea.appendText(textField.getText() + "\n");
    textField.requestFocus();
    }
}
