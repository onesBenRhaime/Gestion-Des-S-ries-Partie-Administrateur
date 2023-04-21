/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author BAZINFO
 */
public class TestConx {
       public static void main(String[] args) {
        // TODO code application logic here 
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
               Connection    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TEST", "test");
           System.out.println("Connexion etablie");
        } 
      
        
        catch (Exception e) {
            System.out.println("Probleme de connexion");
            e.printStackTrace();
                    }
    }
}
