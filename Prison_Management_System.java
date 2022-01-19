package prison_management_system;

import java.util.*;
import java.sql.*;

public class Prison_Management_System {

    public static void main(String[] args) {
        PrimaryWindow w = new PrimaryWindow();
        w.setVisible(true);

        //the sql connections and operations should have gone here but I could not make it work because
        //the operations that I put in here are carried out immediately as the program starts running even 
        //before the user gets a chance to make inputs from gui
        //So, I have put the sql operations in the jButtonActionPerformed method of each window. So those 
        //operations are performed only after any submit button in gui is pressed.
        //All the input and outputs from various windows are static variables declared at the beginning of the various 
        //WindowX classes, so they can be accessed from
        //main method provided you use the full name eg Window1.fname is prisoner's first name from 
        //prisoner detail input window and so on.
        
        /*
        connection url "jdbc:mysql://localhost:3306/prison"
        userID: "seconduser" 
        password: "shsu"
        Relationship schema of the database "prison" used for this program
        prisoners(firstname,lastname,prisoner_id,age,race,sex,unit,programme)
        covid(prisoner_id,tested_on,status)
        visitors(visitor_id,prisoner_id,visitor_address,date_of_visit)
        exposed(name,id,exp_date)        
         */
 /*
        Window4 is supposed to display the contents of exposed table.
        The exposed table contains the details of the people who shared unit with
        the prisoners whose detail we enter in Window2.
        look into Window3.jButton1ActionPerformed
        towards the end rset3 inside the comment has to populate Window4's jTable1
         */
    }

}
