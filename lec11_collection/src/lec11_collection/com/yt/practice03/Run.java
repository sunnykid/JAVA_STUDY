package lec11_collection.com.yt.practice03;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("김철수",40));
		System.out.println(studentList.get(0).getName());
	}

}
