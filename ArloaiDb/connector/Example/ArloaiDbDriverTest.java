

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class ArloaiDbDriverTest {
        //
        public ArloaiDbDriverTest() {
                try {
                       Class.forName("org.dnlabs.arloaidb.jdbc.Driver");
                        
                } catch (ClassNotFoundException e) {
                        System.out.println("Error "+e.toString());
                }
        }

        public Connection createDnUnSQlConnection() {
                Connection con = null;
                	{
                        try {
                                con = DriverManager.getConnection(
                                "jdbc:arloaidb://localhost:3107/dndb", "root","root");
                                
                                Statement stmt=con.createStatement();
                                System.out.println("Start "+(new Date()));
                                for(int i=1 ;i<5000;i++){
                                   stmt.execute("insert into dn value {\"field1\":"+i+",\"field2\":\"dibakar nandi"+i+"\",\"field3\":\"dibakar nandi malbazar jalpaiguri\",\"field4\":\"dibakar nandi malbazar jalpaiguri\",\"field5\":\"dibakar nandi malbazar jalpaiguri\",\"field6\":\"dibakar nandi malbazar jalpaiguri\",\"field7\":\"dibakar nandi malbazar jalpaiguri\",\"field8\":\"dibakar nandi malbazar jalpaiguri\",\"field9\":\"dibakar nandi malbazar jalpaiguri\",\"field10\":\"dibakar nandi malbazar jalpaiguri\"}");
                                }
                                
                                System.out.println("Dend "+(new Date()));

                                con.close();
                        }
                         catch (SQLException e) {
                                System.out.println("Connection Error: "+e.toString());
                                e.printStackTrace();
                        }
                }
                return con;
        }
       public static void main(String[] args) throws SQLException {
    	   ArloaiDbDriverTest jdbccOnnectionExample = new ArloaiDbDriverTest();
       	   jdbccOnnectionExample.createDnUnSQlConnection();
        }
        
}
