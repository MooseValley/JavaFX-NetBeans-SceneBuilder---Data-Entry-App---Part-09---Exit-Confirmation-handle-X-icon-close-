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
public class StudentException extends RuntimeException
{
   public StudentException ()
   {
      this ("Error: something went wrong creating a course");
   }

   public StudentException (String message)
   {
      super (message);
   }

   public StudentException (String message, Throwable cause)
   {
      super (message, cause);
   }
    
}
