/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentadminapp;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author MichaelO
 */
public class CourseAddFXMLController implements Initializable {

    @FXML
    private Button addCourseButton;
    @FXML
    private Button clearAllButton;
    @FXML
    private Button returnToMainMenu;
    @FXML
    private TextField codeTextField;
    @FXML
    private TextField nameTextField;

    
    static ArrayList<Course> coursesArrayList = new ArrayList<Course>();
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addCourseButtonHandler(ActionEvent event)
    {
        boolean dataValid = true;
        
        String codeStr = codeTextField.getText().trim();
        String nameStr = nameTextField.getText().trim();
       
        try
        {
            Course c = new Course (codeStr, nameStr);

            coursesArrayList.add (c);
         
            JOptionPane.showMessageDialog (null, "Success: course created.");
        }
        catch (CourseException err)
        {
            JOptionPane.showMessageDialog (null, err.getMessage() );
        }
    }

    @FXML
    private void clearAllButtonHandler(ActionEvent event) 
    {
        codeTextField.setText ("");
        nameTextField.setText ("");
    }
    
    @FXML
    private void returnToMainMenuHandler(ActionEvent event) throws Exception 
    {
       Utility.changeToScene (getClass(), event, "FXMLDocument.fxml");
    }
    
}
