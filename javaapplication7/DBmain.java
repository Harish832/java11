//Run this code only after database creation using DBcreate!!!!
//If you want to know the function of each queries which I created, comment every queries except the one you wish to check and run
//separately....
//table creation query should be run once, else it shows error
//every time you run the entire code drop the created table and run to avoid errors due to presence of same table
package javaapplication7;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DBmain {
   static final String DB_URL = "jdbc:mysql://localhost:3306/ebookshop";
   static final String USER = "root";
   static final String PASS = "";
   public static void main(String[] args) {
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         String query1="CREATE TABLE books(Id int,Title VARCHAR(50),Author VARCHAR(50),Price float,Quantity int)";
         stmt.execute(query1);
          
         String query2="INSERT INTO books VALUES('1001','Java for dummies','Tan Ah Teck','11.11','11')";
         stmt.executeUpdate(query2);
          
         String query3="INSERT INTO books VALUES('1002','More Java for dummies','Tan Ah Teck','22.22','22')";
         stmt.executeUpdate(query3);
          
         String query4="INSERT INTO books VALUES('1003','More Java for more dummies','Mohammad Ali','33.33','33')";
         stmt.executeUpdate(query4);
          
         String query5="INSERT INTO books VALUES('1004','A Cup of Java','Kumar','44.44','44')";
         stmt.executeUpdate(query5);
          
         String query6="INSERT INTO books VALUES('1005','A Teaspoon of Java','Kevin Jones','55.55','55')";
         stmt.executeUpdate(query6);
                 
         String query7="SELECT * FROM books";
         ResultSet rs=stmt.executeQuery(query7);
         while(rs.next())
         {
             String a=rs.getString(1);
             String b=rs.getString(2);
             String c=rs.getString(3);
             String d=rs.getString(4);
             String e=rs.getString(5);
             System.out.println("Id:"+a+"\nTitle:"+b+"\nAuthor:"+c+"\nPrice:"+d+"\nQuantity:"+e);
             System.out.println("-x-x-x-x-x-x-x-x-x-\n");
         }
          
         String query8="SELECT Title, Author, Price, Quantity FROM books WHERE Author = 'Tan Ah Teck'";
         ResultSet rs1=stmt.executeQuery(query8);
         while(rs1.next())
         {
            
             String b=rs1.getString(1);
             String c=rs1.getString(2);
             String d=rs1.getString(3);
             String e=rs1.getString(4);
             System.out.println("\nTitle:"+b+"\nAuthor:"+c+"\nPrice:"+d+"\nQuantity:"+e);
             System.out.println("-x-x-x-x-x-x-x-x-x-\n");
         }
          
         String query9="UPDATE books SET price=price+price*0.5 WHERE Title = 'A Cup of Java'";
         stmt.executeUpdate(query9);
          
         String query10="UPDATE books SET quantity=0 WHERE Title = 'A Teaspoon of Java'";
         stmt.executeUpdate(query10);
          
         String query11="DELETE FROM books WHERE id = '1001'";
         stmt.executeUpdate(query11);
        
         String query12="INSERT INTO books VALUES('8001','Java ABC','Kevin Jones','15.55','55')";
         stmt.executeUpdate(query12);
          
         String query13="INSERT INTO books VALUES('8002','Java XYZ','Kevin Jones','25.55','55')";
         stmt.executeUpdate(query13);
            
         String query14="DELETE FROM books WHERE author = 'Kevin Jones'";
         stmt.executeUpdate(query14);
         
         System.out.println("Database created successfully...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
