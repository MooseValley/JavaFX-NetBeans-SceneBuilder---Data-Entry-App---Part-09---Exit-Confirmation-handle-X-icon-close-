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
import static studentadminapp.CourseAddFXMLController.coursesArrayList;

/**
 * FXML Controller class
 *
 * @author MichaelO
 */
public class CourseDisplayAllFXMLController implements Initializable {

    @FXML
    private Button returnToMainMenuButton;
    @FXML
    private TextArea coursesTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
        
        // setText(), getText()
        
        String outStr = "Code       Name               " + "\n" +
                        "---------  -------------------" + "\n";
        
        for (Course s: CourseAddFXMLController.coursesArrayList)
        {
            outStr += s.toString() + "\n";
        }
        
        outStr += "-> " + CourseAddFXMLController.coursesArrayList.size() + 
                  " courses found." + "\n";
        
        coursesTextArea.setText (outStr);
        
        coursesTextArea.setFont (new Font ("Courier New", 12));
        
        coursesTextArea.setEditable (false); // read-only    
    }    

    @FXML
    private void returnToMainMenuButtonHandler(ActionEvent event) throws Exception 
    {
        Utility.changeToScene (getClass(), event, "FXMLDocument.fxml");
    }
    
}
