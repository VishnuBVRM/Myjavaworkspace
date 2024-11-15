import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CallableStatementDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver, url, user, password;

		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/emp12634";
		user = "root";
		password = "Root";
		String procedure = "{call getAllEmployees()}";
		
		String selectQuery ="select * from employee where email=''";
		// 1. Loading drive
		Class.forName("drive");

		// 2.Estabish connection
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. create CallableStatement Object.
		CallableStatement st = con.prepareCall(procedure);

		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getInt("name"));
			System.out.println(rs.getInt("salary"));
			System.out.println(rs.getInt("gender"));
			System.out.println(rs.getInt("city"));
			System.out.println(rs.getInt("-------------------------------------"));
		}
		//5. close resources.
		rs.close();
		con.close();
		st.close();
	}
}
