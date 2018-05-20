package DataDriven;

import java.util.ArrayList;

public class TestUtil {
	static Xls_Reader reader;
	
	
	public static ArrayList<Object[]> getDataFromExcel(){

			ArrayList<Object[]> myData = new ArrayList<Object[]>();
			
			try {
				reader = new Xls_Reader("D:\\Projects\\TestNG\\src\\DataDriven\\TestData.xlsx");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			     reader.setCellData("RegTestData", "email", 3, "pol@gmail.com");
			     for (int rowNum = 2; rowNum <= reader.getRowCount("RegTestData"); rowNum++) {
				
					String firstName = reader.getCellData("RegTestData", "firstName", rowNum);
					String lastName = reader.getCellData("RegTestData", "lastName", rowNum);
					String email = reader.getCellData("RegTestData", "email", rowNum);
					String Password = reader.getCellData("RegTestData", "Password", rowNum);
					

					Object ob[] = { firstName,lastName,email, Password};
					myData.add(ob);
					
			}
			return myData;
		
	}
	
	
	
	

}