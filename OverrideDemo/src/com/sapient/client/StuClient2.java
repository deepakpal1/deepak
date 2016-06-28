package com.sapient.client;

import com.sapient.beans.Student;

public class StuClient2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student(1001, "ram", 89);
		Student stu2 = new Student(1001, "tom", 89);
		stu = null;
		stu2 = null;

		System.gc();
		System.out.println("line 3");
		System.out.println("line 4");
	}

}
