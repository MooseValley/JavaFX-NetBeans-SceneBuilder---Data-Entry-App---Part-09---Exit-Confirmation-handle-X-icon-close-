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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author MichaelO
 */
public class StudentAddFXMLController implements Initializable 
{

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField phoneTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private Button addStudentButton;
    @FXML
    private Button clearAllButton;
    @FXML
    private Button returnToMainMenuButton;
    @FXML
    private Label nameLabel;

    
    static ArrayList<Student> studentsArrayList = new ArrayList<Student>();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
        //studentsArrayList = new ArrayList<Student>();
    }    

    @FXML
    private void addStudentButtonHandler(ActionEvent event) 
    {
        boolean dataValid = true;
        
        String nameStr = nameTextField.getText().trim();
        String phoneStr = phoneTextField.getText().trim();
        String emailStr = emailTextField.getText().trim();

        // If all inputs are valid, create a Student object
        // and add them to an array list.
        
        try
        {
            Student s = new Student (nameStr,
                                     phoneStr,
                                     emailTextField.getText().trim() );

            studentsArrayList.add (s);
         
            JOptionPane.showMessageDialog (null, "Success: student created.");
        }
        catch (StudentException err)
        {
            JOptionPane.showMessageDialog (null, err.getMessage() );
        }
    }

    @FXML
    private void clearAllButtonHandler(ActionEvent event) 
    {
        nameTextField.setText ("");
        phoneTextField.setText ("");
        emailTextField.setText ("");        
    }

    @FXML
    private void returnToMainMenuButtonHandler(ActionEvent event) throws Exception 
    {
        Utility.changeToScene (getClass(), event, "FXMLDocument.fxml");
    }
    
}
