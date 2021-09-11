/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentadminapp;

/**
 *
 * @author MichaelO
 */
public class Enrolment 
{
    private Student student;
    private Course course;
    
    public Enrolment()
    {
    }
    
    public Enrolment(Student student, Course course)
    {
        this.student = student;
        this.course = course;
    }
    
    
    private Student getStudent()
    {
        return student;
    }
    
    private Course getCourse()
    {
        return course;
    }
    
    @Override
    public String toString()
    {
        return student.getName() + " (" + student.getStudId() + ")" + 
                " enrolled in: " + 
                course.getCode() + " " + course.getName() ;
    }
      
    
    
}
