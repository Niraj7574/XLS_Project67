package data;

public class ReadWriteExcelFile {

	public static void main(String[] args) {
		Xls_Reader  d= new Xls_Reader("C:\\QA\\Testing\\wetransfer_build-xml_2022-12-03_2020\\NikulTest.xlsx");
		
		System.out.println(d.getCellData("Data1", "Name", 3));
		System.out.println(d.getCellData("Data1", 1, 2));
		
		String browser = d.getCellData("Data1", "Browser", 2);
		System.out.println(browser);
		
		System.out.println(d.getRowCount("Data1"));
		System.out.println(d.getColumnCount("Data1"));
		
		d.setCellData("Data1", "Name", 11, "Testing11");
		System.out.println(d.getCellData("Data1", "Name", 11));  //Testing11
		System.out.println(d.getRowCount("Data1"));  //11 rows
		
		
		d.addColumn("Data1", "Niraj");
		System.out.println(d.getColumnCount("Data1"));
			

	}

}
