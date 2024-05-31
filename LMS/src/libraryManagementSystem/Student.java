package libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int id;
	private String name;
	private int year;
	private int mobileNo;
	
	// list of students
	static List<Student> students = new ArrayList<>();
	
	public Student(int id, String name,int year,int mobileNo) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.mobileNo = mobileNo;
		
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	
	
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	/*
	 * methos for new student registration in the LMS
	 * and add it to the students list
	 * with the success notification 
	*/
	public static void registerStudent(int id, String name, int year, int mobileNo) {
		Student student = new Student(id, name, year, mobileNo);
        students.add(student);
        System.out.println("Student registered successfully!!!");
	}
}
