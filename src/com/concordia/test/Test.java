package com.concordia.test;


import com.concordia.oop.Student;
import com.concordia.oop1.Person;

/**
 * @Author: Wei Qi
 * @Package: com.concordia.test
 */
public class Test {
	public static void main(String[] args) {

		//Encapsulation - Bad practice
		Person person = new Person();  //instantiate an object of the class People
		person.email = "123456789";
		System.out.println(person.email);



		//Encapsulation - Good practice
		Student student = new Student(); //instantiate an object of the class Student


		student.setAge(1);
		System.out.println(student.getAge());

	}
}
