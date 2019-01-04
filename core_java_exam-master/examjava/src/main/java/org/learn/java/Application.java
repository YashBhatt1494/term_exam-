package org.learn.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//import com.kroger.studentapp.Student;

public class Application {
	
	static {
		
	}

	private static List containsString(List<Student> studentsList, String s) {
		List<Student> tempList =new ArrayList<Student>();
		for(Student student : studentsList) {		
			if(student.getFirstName().contains(s))
				tempList.add(student);
		}
		return tempList;
	}
	
	
	private static List<Student> unicSet(List<Student> studentsList) {
		HashMap<String, Student> hMap =new HashMap<String, Student>();
		List<Student> returnList = new ArrayList<Student>();
		
		for(Student student : studentsList) {	
			if(!hMap.containsKey(student.getFirstName()+student.getLastName()+student.getPermanentAddress())) {
				hMap.put(student.getFirstName()+student.getLastName()+student.getPermanentAddress(),student);
				returnList.add(student);
			}
		}
		Collection<Student> returnSet =  hMap.values();		
		return returnList;
	}
	
	
	private static List<Student> removeAddress(List<Student> studentsList) {
		for(Student student : studentsList) {
			student.setMailingAddress(null);
			student.setPermanentAddress(null);
		}
		return studentsList;
	}
	
	public static void main(String[] args) {
		Address a1Yash =new Address(123, "zbcd", "new bedford", "MA", 1234);
		Address a2Yash =new Address(234, "zbcd", "new bedford", "MA", 1234);
		Address a1Raj =new Address(123, "zbcd", "new bedford", "MA", 1234);
		Address a2Raj =new Address(234, "zbcd", "new bedford", "MA", 12334);
		Address a1Sulay =new Address(123, "zbcd", "new bedford", "MA", 2656);
		Address a2Sulay =new Address(234, "zbcd", "new bedford", "MA", 2456);
		Address a1Jash =new Address(123, "zbcd", "new bedford", "MA", 2656);
		Address a2Jash =new Address(234, "zbcd", "new bedford", "MA", 2456);
		
		
		Student s1 = new Student("Yash", "Bhatt", a1Yash, a2Yash);
		Student s2 = new Student("Vaj", "Vora", a2Raj, a1Raj);
		Student s3 = new Student("Aulay", "Shah", a2Sulay, a1Sulay);
		Student s4 = new Student("Jash", "Shah", a2Sulay, a1Sulay);
		Student s5 = new Student("Jash", "Shah", a1Yash, a1Sulay);
		
		List<Student> students = Arrays.asList(new Student[] {s1,s2,s3,s4,s5});
		System.out.println(students);
		
		// Que (c)//TODO: sort the list using last name of the student
		Collections.sort(students, new Comparator<Student>() {

			public int compare(Student o1, Student o2) {	
				return o1.getFirstName().compareTo(o2.getFirstName());
		}});

		System.out.println(students);
		
		
		//Que (d) //TODO: sort the list using the zip code of the mailing address
		Collections.sort(students, new Comparator<Student>() {

			public int compare(Student o1, Student o2) {
				return new Integer(o1.getMailingAddress().getZipcode()).compareTo(new Integer(o2.getMailingAddress().getZipcode()));
		}});
		
		System.out.println(students);
		
		//Que (e)//TODO: find a student(s) by the last name which contain a given string
		List<Student> filteredList = containsString(students, "ash");
		System.out.println(filteredList);
		
		
		////TODO: create a set of students (may be five items) where unique student should be defined by their
		List<Student> unicSet = unicSet(students); 
		System.out.println(unicSet);
		
		
		////TODO: remove all of the addresses (may be set it to null) of all students and return them in a list 
		List<Student> removeAdderssList = removeAddress(students);
		System.out.println(removeAdderssList);
		
		
		
		
		System.out.println(students);
		
		//TODO: create a list of students (may be five items)
		//TODO: sort the list using last name of the student
		//TODO: sort the list using the zip code of the mailing address
		//TODO: find a student(s) by the last name which contain a given string
		
		
		//TODO: create a set of students (may be five items) where unique student should be defined by their
		//1)last name, 2)first name and 3)permanent address
		//TODO: remove all of the addresses (may be set it to null) of all students and return them in a list
		
	}

}
