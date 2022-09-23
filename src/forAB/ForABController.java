/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forAB;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Aspire
 */
public class ForABController implements Initializable {

    @FXML
    private AnchorPane AbPane;
    @FXML
    private JFXButton AbBackBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
        private void loadView(String url) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(url));

        AbPane.getChildren().clear();
        AbPane.getChildren().add(root);
        root.parentProperty();

    }   

    @FXML
    private void loadAbBackView(ActionEvent event) throws IOException {
        
        loadView("/BloodType/BloodType.fxml");
        
    }
    
}
