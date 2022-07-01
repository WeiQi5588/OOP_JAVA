package com.concordia.oop;

/**
 * @Author: Wei Qi
 * @Package: com.concordia.oop
 */

// Class definition
public class Student {
	// attribute definition
	private String name;
	private String studentId;
	private String gender;
	private int age;
	private String email;

	// No arguments constructor
	public Student() {
	}

	// constructor with arguments
	public Student(String name, String studentId, String gender, int age, String email) {
		this.name = name;
		this.studentId = studentId;
		this.gender = gender;
		this.age = age;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", studentId='" + studentId + '\'' +
				", gender='" + gender + '\'' +
				", age=" + age +
				", email='" + email + '\'' +
				'}';
	}

	public void study(){
		System.out.println("study function");
	}

	public int registerCourse(){
		return 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
