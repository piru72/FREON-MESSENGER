/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freon_messenger;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author parve
 */
public class ClientController implements Initializable {

    @FXML
    private Button exitButton;
    @FXML
    private AnchorPane scenePane;
    @FXML
    private TextField textMessage;
    @FXML
    private Button sendButton;
    Stage stage;
    @FXML
    private TextArea textArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void exitAction(ActionEvent event) {
        stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
    }

    @FXML
    void sendAction(ActionEvent event) {

        try {
            
            String message = textMessage.getText();
            System.out.println(message);
            textArea.setText(textArea.getText() + "\n\t\t\t" + message);
            textMessage.setText("");
        } catch (Exception e) {
            System.out.println("Please handle the exception");
        }

    }

}
