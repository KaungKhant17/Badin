/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaHarBoke;

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
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Aspire
 */
public class MaHarBokeController implements Initializable {

    @FXML
    private StackPane maHarPane;
    @FXML
    private JFXTextField birthDateField;
    @FXML
    private ComboBox<String> cboDayBox;
    @FXML
    private JFXButton maHarNextBtn;
    
    ComboBox<String> cbo;
    @FXML
    private JFXButton backBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        List<String> list = new ArrayList<>();
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        list.add("Sunday");
        ObservableList<String> l = FXCollections.observableList(list);
        
        cbo = cboDayBox;
        cbo.setItems(l);
        
       
        
        
    }    

    @FXML
    private void loadMaharBokeView(ActionEvent event) throws IOException{
        
        
            
            if (!(birthDateField.getText().isEmpty() || cbo.getValue() == null )) {
                                 
                try {
                    
                    int b = Integer.parseInt(birthDateField.getText());
                    int year = b % 7;
                  
                    if (year == 0 )
                {
                    if ( cbo.getValue() == "Monday")
                    {
                        loadView("/MaHarBoke/thightPhwar/thightPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Tuesday")
                    {
                        loadView("/MaHarBoke/maranaPhwar/maranaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Wednesday")
                    {
                        loadView("/MaHarBoke/aDipadiPhwar/aDipadiPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Thursday")
                    {
                        loadView("/MaHarBoke/yarzaPhwar/yarzaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Friday")
                    {
                        loadView("/MaHarBoke/aHtunPhwar/aHtunPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Saturday")
                    {
                        loadView("/MaHarBoke/bingaPhwar/bingaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Sunday")
                    {
                        loadView("/MaHarBoke/putiPhwar/putiPhwar.fxml");
                    }

                }

                else if (year == 1)
                {
                    if (cbo.getValue() == "Monday")
                    {
                        loadView("/MaHarBoke/putiPhwar/putiPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Tuesday")
                    {
                        loadView("/MaHarBoke/thightPhwar/thightPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Wednesday")
                    {
                        loadView("/MaHarBoke/maranaPhwar/maranaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Thursday")
                    {
                        loadView("/MaHarBoke/aDipadiPhwar/aDipadiPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Friday")
                    {
                        loadView("/MaHarBoke/yarzaPhwar/yarzaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Saturday")
                    {
                        loadView("/MaHarBoke/aHtunPhwar/aHtunPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Sunday")
                    {
                         loadView("/MaHarBoke/bingaPhwar/bingaPhwar.fxml");
                    }

                }

                else if (year == 2)
                {
                    if (cbo.getValue() == "Monday")
                    {
                         loadView("/MaHarBoke/bingaPhwar/bingaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Tuesday")
                    {
                        loadView("/MaHarBoke/putiPhwar/putiPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Wednesday")
                    {
                        loadView("/MaHarBoke/thightPhwar/thightPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Thursday")
                    {
                        loadView("/MaHarBoke/maranaPhwar/maranaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Friday")
                    {
                        loadView("/MaHarBoke/aDipadiPhwar/aDipadiPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Saturday")
                    {
                        loadView("/MaHarBoke/yarzaPhwar/yarzaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Sunday")
                    {
                        loadView("/MaHarBoke/aHtunPhwar/aHtunPhwar.fxml");
                    }

                }

                else if (year == 3)
                {
                    if (cbo.getValue() == "Monday")
                    {
                        loadView("/MaHarBoke/aHtunPhwar/aHtunPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Tuesday")
                    {
                        loadView("/MaHarBoke/bingaPhwar/bingaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Wednesday")
                    {
                        loadView("/MaHarBoke/putiPhwar/putiPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Thursday")
                    {
                        loadView("/MaHarBoke/thightPhwar/thightPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Friday")
                    {
                        loadView("/MaHarBoke/maranaPhwar/maranaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Saturday")
                    {
                        loadView("/MaHarBoke/aDipadiPhwar/aDipadiPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Sunday")
                    {
                        loadView("/MaHarBoke/yarzaPhwar/yarzaPhwar.fxml");
                    }

                }
                else if (year == 4)
                {
                    if (cbo.getValue() == "Monday")
                    {
                       loadView("/MaHarBoke/yarzaPhwar/yarzaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Tuesday")
                    {
                       loadView("/MaHarBoke/aHtunPhwar/aHtunPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Wednesday")
                    {
                        loadView("/MaHarBoke/bingaPhwar/bingaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Thursday")
                    {
                        loadView("/MaHarBoke/putiPhwar/putiPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Friday")
                    {
                        loadView("/MaHarBoke/thightPhwar/thightPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Saturday")
                    {
                         loadView("/MaHarBoke/maranaPhwar/maranaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Sunday")
                    {
                        loadView("/MaHarBoke/aDipadiPhwar/aDipadiPhwar.fxml");
                    }

                }
                else if (year == 5)
                {
                    if (cbo.getValue() == "Monday")
                    {
                        loadView("/MaHarBoke/aDipadiPhwar/aDipadiPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Tuesday")
                    {
                        loadView("/MaHarBoke/yarzaPhwar/yarzaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Wednesday")
                    {
                        loadView("/MaHarBoke/aHtunPhwar/aHtunPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Thursday")
                    {
                        loadView("/MaHarBoke/bingaPhwar/bingaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Friday")
                    {
                       loadView("/MaHarBoke/putiPhwar/putiPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Saturday")
                    {
                        loadView("/MaHarBoke/thightPhwar/thightPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Sunday")
                    {
                        loadView("/MaHarBoke/maranaPhwar/maranaPhwar.fxml");
                    }

                }
                else if (year == 6)
                {
                    if (cbo.getValue() == "Monday")
                    {
                        loadView("/MaHarBoke/maranaPhwar/maranaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Tuesday")
                    {
                        loadView("/MaHarBoke/aDipadiPhwar/aDipadiPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Wednesday")
                    {
                        loadView("/MaHarBoke/yarzaPhwar/yarzaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Thursday")
                    {
                        loadView("/MaHarBoke/aHtunPhwar/aHtunPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Friday")
                    {
                       loadView("/MaHarBoke/bingaPhwar/bingaPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Saturday")
                    {
                        loadView("/MaHarBoke/putiPhwar/putiPhwar.fxml");
                    }
                    else if (cbo.getValue() == "Sunday")
                    {
                        loadView("/MaHarBoke/thightPhwar/thightPhwar.fxml");
                    }

                }
                    
                  
                }
                catch (NumberFormatException e) {
                    
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText(null);
                    alert.setContentText("Invalid Input!");
                    alert.show();
                    return;
            
                    
                 }
               
     
                }
            else {
                
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Please Fill!");
                alert.show();
                return;
                
            }
           
        
    }
    
    private void loadView(String url) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(url));

        maHarPane.getChildren().clear();
        maHarPane.getChildren().add(root);

    }   

    @FXML
    private void loadMenuView(ActionEvent event) throws IOException {
        
        loadView("/Menu/Menu.fxml");
        
    }
    
    
}
