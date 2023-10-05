package productDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BusinessLogic {
	void createData() throws SQLException {
		Connection connection = ConectDB.setupConnection();
		String query ="INSERT INTO Product ( id, name,cost, Dscription ) VALUES( ?,?, ?,?)";
//		String query = "insert values into employee(? ,? ,?)  ";
		PreparedStatement myStmt = connection.prepareStatement(query);
		myStmt.setInt(1, 666);
		myStmt.setString(2, "Nagasree");
		myStmt.setInt(3, 666);
		myStmt.setString(4, "Management");

		int success = myStmt.executeUpdate();
		System.out.println("Added Successfully " + success);
     	}
		void readData() throws SQLException {
			Connection connection=ConectDB.setupConnection();
			
			 java.sql.Statement statement;
			 statement = connection.createStatement();
	         ResultSet resultSet;
	         resultSet = statement.executeQuery(
	             "select * from Product where id>=111");
	         int id;
	         String name;
	         int  cost;
	         String Dscription;
	         while (resultSet.next()) {
	             id = resultSet.getInt("id");
	             name = resultSet.getString("name");
	             cost= resultSet.getInt("cost");
	             Dscription=resultSet.getString("Dscription");
	             System.out.println("id : " + id
	                                + " name : " + name +" cost:"+cost+" Dscription:"+ Dscription);
	         }
		}
	         
	         void updateData() throws SQLException {
	 			Connection connection = ConectDB.setupConnection();
	 			String query = "update Product set name =? where id=? ";
	 			PreparedStatement myStmt = connection.prepareStatement(query);
	 			myStmt.setString(1,"Shampoo");
	 			myStmt.setInt(2, 222);
	 			boolean success = myStmt.execute();
	 			System.out.println("Updated Successfully " + success);
	 		}

	 		void deletData() throws SQLException {
	 			Connection connection = ConectDB.setupConnection();
	 			String query = "delete from Product where id = ? ";
	 			PreparedStatement myStmt = connection.prepareStatement(query);
	 			myStmt.setInt(1, 333);
	 			boolean success = myStmt.execute();
	 			System.out.println("Deleted Successfully " + success);


}
}
