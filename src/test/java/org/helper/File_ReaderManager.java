package org.helper;

import java.io.IOException;

public class File_ReaderManager {
	
	public static Configuration_Reader getInstanceCR() throws IOException {

		Configuration_Reader cr=new Configuration_Reader();
		return cr;
	}

}
