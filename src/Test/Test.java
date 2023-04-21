
package Test;

import DAO.MyConnection;
import java.sql.Connection;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Connection cnx = MyConnection.getInstance().getCon();

    }
    
}
