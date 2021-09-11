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
import javafx.scene.control.ComboBox;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author MichaelO
 */
public class EnrolmentAddFXMLController implements Initializable {

    @FXML
    private Button addButton;
    @FXML
    private Button clearInputsButton;
    @FXML
    private Button returnToMainMenuButton;
    @FXML
    private ComboBox<Student> studentComboBox;
    @FXML
    private ComboBox<Course> courseComboBox;

    
    static ArrayList<Enrolment> enrolmentsArrayList = new ArrayList<Enrolment>();
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
        
        //studentComboBox.getItems().addAll ("Moose", "Frankie", "Bella");
        
        for (Student s : StudentAddFXMLController.studentsArrayList)
        {
            studentComboBox.getItems().addAll (s);
        }
        
        for (Course c : CourseAddFXMLController.coursesArrayList)
        {
            courseComboBox.getItems().addAll (c);
        }
        
          
        //studentComboBox.setOnAction (e -> printSelectedStudent() );
    }    

    @FXML
    private void addButtonHandler(ActionEvent event) 
    {
        //printSelectedStudent();
        
        try
        {
            Enrolment e = new Enrolment (studentComboBox.getValue(),
                                         courseComboBox.getValue() );
                
            enrolmentsArrayList.add (e);

            JOptionPane.showMessageDialog (null, "Success: Student Course enrolment created: " + "\n" +
                    "* " + e.toString() );

        }
        catch (Exception err)
        {
            JOptionPane.showMessageDialog (null, "Error: please select a Student and a Course.");
        }
    }
    @FXML
    private void clearInputsButtonHandler(ActionEvent event) {
    }

    @FXML
    private void returnToMainMenuButtonHandler(ActionEvent event) throws Exception 
    {
        Utility.changeToScene (getClass(), event, "FXMLDocument.fxml");
    }

    @FXML
    private void courseComboBox(ActionEvent event) {
    }
    
    
    private void printSelectedStudent()
    {
        System.out.println ("Studnet:  " + studentComboBox.getValue()  +
                            ", Course: " + courseComboBox.getValue() );
        
    }
    
}
