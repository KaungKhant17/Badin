/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YarThiPhwar.Libra;

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
public class LibraController implements Initializable {

    @FXML
    private AnchorPane LibraPane;
    @FXML
    private JFXButton backLibraBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
     private void loadView(String url) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(url));

        LibraPane.getChildren().clear();
        LibraPane.getChildren().add(root);

    }   

    @FXML
    private void loadYarThiView(ActionEvent event) throws IOException {
        
        loadView("/YarThiPhwar/yatThiPhwar.fxml");
        
    }
    
}
