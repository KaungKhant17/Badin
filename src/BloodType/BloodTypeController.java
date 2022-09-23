 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BloodType;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;


/**
 * FXML Controller class
 *
 * @author Aspire
 */
public class BloodTypeController implements Initializable {

    @FXML
    private JFXButton bloodTypeNextBtn;
    @FXML
    private JFXButton BloodTypeMenuBtn;
    
    @FXML
    private ComboBox<String> bloodTypeCboBox;
    
    @FXML
    private AnchorPane bloodTypePane;
   
     ComboBox<String> cbo ;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("AB");
        list.add("O");
        ObservableList<String> l = FXCollections.observableList(list);
        cbo = bloodTypeCboBox;
        cbo.setItems(l);
        
        
    
    } 
 
    private void loadView(String url) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(url));

        bloodTypePane.getChildren().clear();
        bloodTypePane.getChildren().add(root);

    }   


    @FXML
    private void loadBloodTypeNextView(ActionEvent event) throws IOException {
        
        if ("A".equals(cbo.getValue())) {
            
            loadView("/forA/forA.fxml");
            
        }
        else if ("B".equals(cbo.getValue())){
            
            loadView("/forB/forB.fxml");
            
        }
         else if ("AB".equals(cbo.getValue())){
            
            loadView("/forAB/forAB.fxml");
            
        }
         else if ("O".equals(cbo.getValue())){
            
            loadView("/forO/forO.fxml");
            
        }
         else{
             
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please Choose!");
            alert.show();
             
         }
         
    }

    @FXML
    private void loadBloodTypeMenuView(ActionEvent event) throws IOException {
        
        loadView("/Menu/Menu.fxml");
         
    }
    
}
