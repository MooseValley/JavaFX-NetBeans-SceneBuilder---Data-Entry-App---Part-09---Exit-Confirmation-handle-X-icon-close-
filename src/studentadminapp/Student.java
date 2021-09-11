/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentadminapp;

import javax.swing.JOptionPane;

/**
 *
 * @author MichaelO
 */
public class Student 
{
    private static int lastUsedStudId = 1000;
    
    private int studId;
    private String name;
    private String phone;
    private String email;
    
    public Student() throws Exception
    {
        this ("unknown", "unknown", "unknown@net"); // Call Parameterised Constructor
    }
    
    public Student(String name, String phone, String email) throws StudentException
    {
        if (name.length() == 0)
            throw new StudentException ("Error: Name cannot be blank.");
        else if (phone.length() == 0)
            throw new StudentException ("Error: Phone cannot be blank.");
        else if (email.length() == 0)
            throw new StudentException ( "Error: Email cannot be blank.");
        else if (email.contains("@") == false)
            throw new StudentException ("Error: Email not valid.");
            
        studId = lastUsedStudId;
        lastUsedStudId++;
        this.name = name;
        this.phone = phone;
        this.email = email;       
    }
    
    
    public int getStudId()
    {
        return studId;
    }
    
    public String getName()
    {
        return name;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getEmail()
    {
        return email;
    }
    
    public void setName(String name) throws StudentException
    {
        if (name.length() == 0)
            throw new StudentException ("Error: Name cannot be blank.");
        
       this.name = name;
    }

    public void setPhone(String phone) throws StudentException
    {
        if (phone.length() == 0)
            throw new StudentException ("Error: Phone cannot be blank.");
        
       this.phone = phone;
    }

    public void setEmail(String email) throws StudentException
    {
        if (email.length() == 0)
            throw new StudentException ( "Error: Email cannot be blank.");
        else if (email.contains("@") == false)
            throw new StudentException ("Error: Email not valid.");
        
       this.email = email;
    }
    
    @Override
    public String toString()
    {
        return  String.format ("%8d", studId)  + "  " +
                String.format ("%-20s", name)  +
                String.format ("%-20s", phone) +
                String.format ("%-20s", email);
    }

}
