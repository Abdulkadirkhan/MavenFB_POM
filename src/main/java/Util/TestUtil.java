package Util;

import Core.Page;

public class TestUtil extends Page {

	
	//Validating if the Run mode in Excel file is set as Yes or No
			public static boolean isExecutable(String tcid, Xls_Reader excel){
				
				for(int rowNum=2; rowNum<=excel.getRowCount("test_suite"); rowNum++){
					if(excel.getCellData("test_suite","TCID", rowNum).equals(tcid)){
						if(excel.getCellData("test_suite","Runmode", rowNum).equalsIgnoreCase("Y")){
							return true;
						}
						else{
							return false;
						}
							
					}
				}
				return false;
			}
			
}
