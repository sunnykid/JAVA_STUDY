package com.yt.ex01.run;

import com.yt.ex01.src.ReadExample;
import com.yt.ex01.src.WriteExample;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WriteExample fw = new WriteExample();
		ReadExample re = new ReadExample();
		
		//fw.fileWrite();
		re.readFile();
	}

}
