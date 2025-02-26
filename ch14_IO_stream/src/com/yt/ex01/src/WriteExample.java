package com.yt.ex01.src;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public void fileWrite() throws Exception {
		OutputStream os = new FileOutputStream("d:/temp/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
	}
}
