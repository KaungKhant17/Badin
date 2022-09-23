/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetKhat;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Aspire
 */
public class NetKhatController implements Initializable {

    @FXML
    private JFXTextField netKhatbirthDateField;
    @FXML
    private JFXButton netKantbackBtn;
    @FXML
    private JFXButton netKahtBtn;
    @FXML
    private StackPane netKhatPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    
      private void loadView(String url) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(url));

        netKhatPane.getChildren().clear();
        netKhatPane.getChildren().add(root);
        
      }

    @FXML
    private void loadNetKhatMenuView(ActionEvent event) throws IOException {
        
        loadView("/Menu/Menu.fxml");
      
    }       

    @FXML
    private void loadNetKahtView(ActionEvent event) throws IOException {
       
         if(!(netKhatbirthDateField.getText().isEmpty())){
             
             try {
                 
                 int n = Integer.parseInt(netKhatbirthDateField.getText());
                 int y = n % 3;
                 
               
                if ( y == 1 ){
                     
                     loadView("/NetKhat/lu/lu.fxml");
                     
                 }else if( y == 2 ){
                     
                     loadView("/NetKhat/nut/nut.fxml");
                     
                 }
                 else if( y == 0 ){
                  
                     loadView("/NetKhat/balu/balu.fxml");
                   
                 }
                 
                 
             } catch (NumberFormatException e) {
                 
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Invalid input!");
                alert.show();
                return;
                 
             }
             
         }
         else{
             
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Please Fill!");
                alert.show();
                return;
             
         }
        
        
    }
    
    
    
        
 }
