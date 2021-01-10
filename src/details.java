/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author bansal
 */
public class details {
    public Connection db;
    public details(){
        try{
            db=DriverManager.getConnection("jdbc:mysql://localhost/db_testimg","root","");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
