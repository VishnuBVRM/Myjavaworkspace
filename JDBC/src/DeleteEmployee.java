import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteEmployee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver, url, user, password;
		
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/emp12634";
		user = "root";
		password = "Root";
		
		String DeleteQuery = "alter  table employee delete cloumn mobile";
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter employee mobile: ");
		String name = in.next();
		
		//1. Loading driver
		//Class.forName(driver);
		
		//2. Establish connection
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3. Create  Prepared statement object
		PreparedStatement st = con.prepareStatement(DeleteQuery);
		st.setString(1,name);
		
		//4. Process Query (SELECT)
		ResultSet rs = st.executeQuery(DeleteQuery);
		if(rs.next()) {
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("email"));
			System.out.println(rs.getLong("mobile"));
			System.out.println(rs.getDouble("salary"));
			System.out.println("--------------------------");
		}else {
			System.out.println("no Mobile found");
		}
		
		//5. Close Resources
		rs.close();
		st.close();
		con.close();
		}
}
