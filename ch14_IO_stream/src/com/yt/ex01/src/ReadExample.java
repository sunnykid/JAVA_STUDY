package com.yt.ex01.src;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public void readFile() throws Exception {
		InputStream is = new FileInputStream("d:/temp/test1.db");
		
		while(true) {
			int data = is.read();
			if (data == -1) break;
			System.out.println(data);
		}
		is.close();
	}
}
