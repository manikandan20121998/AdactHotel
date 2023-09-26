package org.stepdefinition;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.helper.File_ReaderManager;
import org.junit.BeforeClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.core.event.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
    @Before()
	public void BeforeScenario() throws IOException {

		System.out.println(".....BeforeScenario....");
		System.out.println(new Date());
//		String browser = File_ReaderManager.getInstanceCR().getBrowser();
		 chromebrowser();
		String url = File_ReaderManager.getInstanceCR().getUrl();
	      urllaunch(url);
	      maximize();
	      implicitywait(10);
	}
	@After()
	public void AfterScenario(Scenario sc) throws IOException {

		System.out.println(".....AfterScenario....");
		System.out.println("ending................."+new Date());
		String name = sc.getName();
		Status status = sc.getStatus();
		if (sc.isFailed()) {
			screenshotwithbyte(sc);
			
		}
	}
}
