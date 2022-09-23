/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YarThiPhwar;

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
public class YatThiPhwarController implements Initializable {

    @FXML
    private JFXTextField birthDayField;
    @FXML
    private ComboBox<String> cboMonthBox;
    @FXML
    private JFXButton backBtn;
    @FXML
    private JFXButton yarThiBtn;
    @FXML
    private AnchorPane YarThiPane;
    
     ComboBox<String> cbo;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
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
        cbo = cboMonthBox;
        cbo.setItems(l);
        
        
        
    }    
    
    
      private void loadView(String url) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(url));

        YarThiPane.getChildren().clear();
        YarThiPane.getChildren().add(root);
        
      }

    @FXML
    private void loadMenuView(ActionEvent event) throws IOException {
        
        loadView("/Menu/Menu.fxml");
        
    }

    @FXML
    private void loadYarThiView(ActionEvent event) {
        
        
        if(!(birthDayField.getText().isEmpty() || cboMonthBox.getValue() == null)){
            
            try {
                
                int day = Integer.parseInt(birthDayField.getText());
                
                if((cbo.getValue() == "March" && day >= 21) || (cbo.getValue()=="April" && day <= 19 )){
                    
                    loadView("/YarThiPhwar/Aries/Aries.fxml");
                    
                }
                else if( (cbo.getValue() == "April" && day >= 20) || (cbo.getValue()=="May" && day <= 21 ) ){
                    
                    loadView("/YarThiPhwar/Taurus/Taurus.fxml");
                    
                }
                else if( (cbo.getValue() == "May" && day >= 22 ) || (cbo.getValue()=="June" && day <= 21 ) ){
                    
                    loadView("/YarThiPhwar/Gemini/Gemini.fxml");
                    
                }
                else if( (cbo.getValue() == "June" && day >= 22 ) || (cbo.getValue()=="July" && day <= 22 ) ){
                    
                    loadView("/YarThiPhwar/Cancer/Cancer.fxml");
                    
                }
                else if( (cbo.getValue() == "July" && day >= 23 ) || (cbo.getValue()=="August" && day <= 22 ) ){
                    
                    loadView("/YarThiPhwar/Leo/Leo.fxml");
                    
                }
                else if( (cbo.getValue() == "August" && day >= 23 ) || (cbo.getValue()=="September" && day <= 22 ) ){
                    
                    loadView("/YarThiPhwar/Virgo/Virgo.fxml");
                    
                }
                else if( (cbo.getValue() == "September" && day >= 23 ) || (cbo.getValue()=="October" && day <= 22 ) ){
                    
                    loadView("/YarThiPhwar/Libra/Libra.fxml");
                    
                }
                else if( (cbo.getValue() == "October" && day >= 23 ) || (cbo.getValue()=="November" && day <= 22 ) ){
                    
                    loadView("/YarThiPhwar/Scorpio/Scoprio.fxml");
                    
                }
                else if( (cbo.getValue() == "November" && day >= 23 ) || (cbo.getValue()=="December" && day <= 21 ) ){
                    
                    loadView("/YarThiPhwar/Sagittarius/Sagittarius.fxml");
                    
                }
                else if( (cbo.getValue() == "December" && day >= 22 ) || (cbo.getValue()=="January" && day <= 20 ) ){
                    
                    loadView("/YarThiPhwar/Capricorn/Capricorn.fxml");
                    
                }
                else if( (cbo.getValue() == "January" && day >= 21 ) || (cbo.getValue()=="February" && day <= 18 ) ){
                    
                    loadView("/YarThiPhwar/Aquarius/Aquarius.fxml");
                    
                }
                else if( (cbo.getValue() == "February" && day >= 19 ) || (cbo.getValue()=="March" && day <= 20 ) ){
                    
                    loadView("/YarThiPhwar/Pisces/Pisces.fxml");
                    
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
    
}
