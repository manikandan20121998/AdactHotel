package org.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class JVMReports {
	
	
 	  public static void generateJVMReportss(String json) {
             //location
		File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReports");
	    	//some configuration
	  Configuration con=new Configuration(loc,"AdactHotel");
			con.addClassifications("BrowserName", "Chrome");
			con.addClassifications("BrowserVersion", "107");
			con.addClassifications("Windows", "10");
			con.addClassifications("Environment", "QA");
			con.addClassifications("Sprint", "20");
			//added to list
			List<String> jsons=new LinkedList<String>();
			jsons.add(json);
			//report generation
			ReportBuilder re=new ReportBuilder(jsons, con);
			re.generateReports();
	
	}

}
