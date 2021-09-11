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
public class StudentDisplayAllFXMLController implements Initializable {

    @FXML
    private TextArea displayTextArea;
    @FXML
    private Button returnToMainMenuButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
        
        // setText(), getText()
        
        String outStr = "ID       Name                Phone                Email"                + "\n" +
                        "-------  ------------------- -------------------- --------------------" + "\n";
        
        for (Student s: StudentAddFXMLController.studentsArrayList)
        {
            outStr += s.toString() + "\n";
        }
        
        outStr += "-> " + StudentAddFXMLController.studentsArrayList.size() + 
                  " students found." + "\n";
        
        displayTextArea.setText (outStr);
        
        displayTextArea.setFont (new Font ("Courier New", 12));
        
        displayTextArea.setEditable (false); // read-only
    }    

    @FXML
    private void returnToMainMenuButtonHandler(ActionEvent event) throws Exception
    {
        Utility.changeToScene (getClass(), event, "FXMLDocument.fxml");
    }
    
}
