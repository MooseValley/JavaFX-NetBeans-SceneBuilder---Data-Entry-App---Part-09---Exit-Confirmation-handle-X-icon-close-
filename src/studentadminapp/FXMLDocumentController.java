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
import javafx.scene.control.Label;

/**
 *
 * @author MichaelO
 */
public class FXMLDocumentController implements Initializable, IExitable 
{

    private Label label;
    @FXML
    private Button addStudentButton;
    @FXML
    private Button displayAllStudentsButton;
    @FXML
    private Button addCourseButton;
    @FXML
    private Button displayAllCoursesButton;
    @FXML
    private Button exitButton;
    @FXML
    private Button addCourseEnrolmentsButton;
    @FXML
    private Button addTestDataButton;
    @FXML
    private Label headerLabel;
    @FXML
    private Button displayAllCourseEnrolmentsButton;

    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void addStudentButtonHandler(ActionEvent event) throws Exception
    {
        Utility.changeToScene (getClass(), event, "StudentAddFXML.fxml");
    }

    @FXML
    private void displayAllStudentsButtonHandler(ActionEvent event) throws Exception
    {
        Utility.changeToScene (getClass(), event, "StudentDisplayAllFXML.fxml");
    }

    @FXML
    private void addCourseButtonHandler(ActionEvent event) throws Exception
    {
        Utility.changeToScene (getClass(), event, "CourseAddFXML.fxml");
    }

    @FXML
    private void displayAllCoursesButtonHandler(ActionEvent event) throws Exception
    {
        Utility.changeToScene (getClass(), event, "CourseDisplayAllFXML.fxml");
    }

    @FXML
    private void exitButtonHandler(ActionEvent event)
    {
        //System.exit (0); // Exit app
        this.exitClick();
    }

    @FXML
    private void addCourseEnrolmentsButtonHandler(ActionEvent event) throws Exception
    {
        Utility.changeToScene (getClass(), event, "EnrolmentAddFXML.fxml");
    }

    @FXML
    private void addTestDataButtonHandler(ActionEvent event)
    {
        // Create some Students:
        StudentAddFXMLController.studentsArrayList.add (new Student ("Moose",   "112233", "Moose_Software@yahoo.com.au") );
        StudentAddFXMLController.studentsArrayList.add (new Student ("Frankie", "998877", "Frankie@hotmail.com") );
        StudentAddFXMLController.studentsArrayList.add (new Student ("Bella",   "222233", "Bella@gmail.com") );

        // Create some Courses:
        CourseAddFXMLController.coursesArrayList.add (new Course("COIT11134", "Object Oriented Programming") );
        CourseAddFXMLController.coursesArrayList.add (new Course("COIT11222", "Programming Fundamentals") );
        CourseAddFXMLController.coursesArrayList.add (new Course("COIT20256", "Data Structures and Algorithms") );

        // Create Enrolments:
        EnrolmentAddFXMLController.enrolmentsArrayList.add
            (new Enrolment (StudentAddFXMLController.studentsArrayList.get(0),
                            CourseAddFXMLController.coursesArrayList.get(2) ) );
    }

    @FXML
    private void displayAllCourseEnrolmentsButtonHandler(ActionEvent event) throws Exception
    {
        Utility.changeToScene (getClass(), event, "EnrolmentDisplayAllFXML.fxml");
    }

}
