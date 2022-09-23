/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Menu;

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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Aspire
 */
public class MenuController implements Initializable {

    @FXML
    private StackPane menuPane;
    @FXML
    private JFXButton maHarBokeBtn;
    @FXML
    private JFXButton bloodTypeBtn;
    @FXML
    private JFXButton netKhatBtn;
    @FXML
    private JFXButton ChangeYear;
    @FXML
    private JFXButton yarThiPhwarBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
        private void loadView(String url) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(url));

        menuPane.getChildren().clear();
        menuPane.getChildren().add(root);

    }   

    @FXML
    private void loadmaHarBokeView(ActionEvent event) throws IOException {
        
        loadView("/MaHarBoke/MaHarBoke.fxml");
        
    }

    @FXML
    private void loadBloodTypeView(ActionEvent event) throws IOException {
        
        loadView("/BloodType/BloodType.fxml");
        
    }

    @FXML
    private void loadNetKhatView(ActionEvent event) throws IOException {
        
        loadView("/NetKhat/NetKhat.fxml");
        
    }

    @FXML
    private void loadChangeYearView(ActionEvent event) throws IOException {
        
        loadView("/ChangeBirthday/ChangeBirthday.fxml");
        
    }

    @FXML
    private void loadYarThiPhwarView(ActionEvent event) throws IOException {
        
        loadView("/YarThiPhwar/yatThiPhwar.fxml");
        
    }
    
}
