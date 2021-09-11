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
public class CourseException extends RuntimeException
{
   public CourseException ()
   {
      this ("Error: something went wrong creating a course");
   }

   public CourseException (String message)
   {
      super (message);
   }

   public CourseException (String message, Throwable cause)
   {
      super (message, cause);
   }
}
