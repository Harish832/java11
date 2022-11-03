//First run this code to create a database in your device!!!!
package javaapplication7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBcreate {

    public static void main(String[] args) {
       try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
         Statement stmt = conn.createStatement();){
           stmt.execute("CREATE DATABASE ebookshop");
           System.out.println("Done");
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
    
}
