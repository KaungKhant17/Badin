/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChangeBirthday;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
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
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Aspire
 */
public class ChangeBirthdayController implements Initializable {

    @FXML
    private JFXButton myanmarYearBtn;
    @FXML
    private JFXButton englishYearBtn;
    @FXML
    private JFXTextField changeBirthDateField;
    @FXML
    private JFXButton backBtn;
    @FXML
    private AnchorPane changePane;
    @FXML
    private ComboBox<String> cYearMonthBox;
    @FXML
    private JFXTextField cYearDayField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        ComboBox month = new ComboBox();
        month = cYearMonthBox;
        
        List<String> list = new ArrayList<>();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("May");
        list.add("June");
        list.add("July");
        list.add("August");
        list.add("September");
        list.add("October");
        list.add("November");
        list.add("December");
        ObservableList<String> l = FXCollections.observableList(list);
        month.setItems(l);
        
        
    }    

    @FXML
    private void loadMyanmarYearView(ActionEvent event) {
        
        if( !( changeBirthDateField.getText().isEmpty() || cYearMonthBox.getValue().isEmpty() || cYearDayField.getText().isEmpty() ) ){
            
            try {
                
                int year = Integer.parseInt(changeBirthDateField.getText());
                int day = Integer.parseInt(cYearDayField.getText());
                
                
                if( year % 400 == 0 ){
                    
                   
                    
                    
                }else {
                    
                    
                    
                    
                }
                
                
                
            } catch (Exception e) {
                
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Invalid Input!");
                alert.show();
                return;
                
                
            }
            
            
            
            
            
        }else{
            
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Please Fill!");
                alert.show();
                return;
             
            
        }
        
    }

    @FXML
    private void loadEnglishYearView(ActionEvent event) {
        
        
          if( !changeBirthDateField.getText().isEmpty() ){
            
            try {
                
                int changeyear = Integer.parseInt(changeBirthDateField.getText());
                
                    
                    int ans = changeyear + 638;
                    String s = String.valueOf(ans);
                    Change("ToEnglish", "ခရစ္ႏွစ္ : "+ s);
                    
                
                
                
                
                
                
            } catch (NumberFormatException e) {
                
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Please Fill!");
                alert.show();
                return;
                
            }
            
            
            
        }else{
            
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Please Fill!");
                alert.show();
                return;
             
            
        }
        
        
    }
    
    public void Change(String title, String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();

    }

     private void loadView(String url) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(url));

        changePane.getChildren().clear();
        changePane.getChildren().add(root);

    }   
    
    @FXML
    private void loadMenuView(ActionEvent event) throws IOException {
        
        loadView("/Menu/Menu.fxml");
        
    }
    
}
