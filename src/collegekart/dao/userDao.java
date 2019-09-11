
package collegekart.dao;

import collegekart.dbutil.DBConnection;
import collegekart.pojo.userPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author JAIN
 */
public class userDao {
        public static boolean registerStudent(userPojo obj) throws SQLException{ //note:-dao me try catch nhi lagate hai kyunki wo data base ko handle krta hai isliye message display wo nhi kr skta(front end hi krta hai) isliye isme throws lagayenge
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps =conn.prepareStatement("insert into users values(?,?,?,?,?,?)");
        ps.setInt(1,obj.getUserid());
        ps.setString(2,obj.getUsername());
        ps.setString(3,obj.getUserpassword());
        ps.setString(4,obj.getUseraddress());
        ps.setDouble(5,obj.getUmob());
        ps.setString(6,obj.getUsercollege());
        
        int count=ps.executeUpdate();
        return count==1;//alternative of if else(return result of count==1)
    }
    
}
