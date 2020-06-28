package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Controller {
    @FXML
    public TextField textField;
    @FXML
    public TextArea textArea;

    public void sendTextButton(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
    }

    public void textFieldSendButton(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
    }
}

// @FXML
//    public TextArea textArea;
//
//    public void exitClick(ActionEvent actionEvent) {
//        Stage stage = (Stage) textArea.getScene().getWindow();
//        stage.close();
//    }

