/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentadminapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;

/**
 * FXML Controller class
 *
 * @author MichaelO
 */
public class EnrolmentDisplayAllFXMLController implements Initializable {

    @FXML
    private Button returnToMainMenuButton;
    @FXML
    private TextArea textArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
        
        String outStr = "";
        
        for (Enrolment e: EnrolmentAddFXMLController.enrolmentsArrayList)
        {
            outStr += e.toString() + "\n";
        }
        
        outStr += "-> " + StudentAddFXMLController.studentsArrayList.size() + 
                  " enrolments found." + "\n";
        
        textArea.setText (outStr);
        
        textArea.setFont (new Font ("Courier New", 12));
        
        textArea.setEditable (false); // read-only
     }    

    @FXML
    private void returnToMainMenuButtonHandler(ActionEvent event) throws Exception 
    {
       Utility.changeToScene (getClass(), event, "FXMLDocument.fxml");
     }
    
}
