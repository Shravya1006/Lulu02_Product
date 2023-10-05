package productDatabase;

import java.sql.SQLException;



public class ProductTester {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		BusinessLogic bl= new BusinessLogic();
	bl.createData();
	bl.readData();
	
       bl.deletData();
        
 	bl.updateData();
	bl.readData();

	}

}
