package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
	 public static void main(String[] args) {
		 ArrayList<String> studentNames = new ArrayList<>();


	        studentNames.add("Neha Dubey");
	        studentNames.add("Pallu patil");
	        studentNames.add("Nisha vade");
	        studentNames.add("Michael Brown");


	        System.out.println("Student Names: " + studentNames);


	        String firstStudent = studentNames.get(0);
	        System.out.println("First student: " + firstStudent);


	        studentNames.set(2, "Emma Wilson");
	        System.out.println("Student Names after updating index 2: " + studentNames);


	        studentNames.remove(1);
	        System.out.println("Student Names after removing element at index 1: " + studentNames);


	        studentNames.remove("Michael Brown");
	        System.out.println("Student Names after removing 'Michael Brown': " + studentNames);


	        System.out.println("Iterating over the Student Names:");
	        for (String student : studentNames) {
	            System.out.println(student);
	        }


	        int size = studentNames.size();
	        System.out.println("Size of the Student Names list: " + size);


	        studentNames.clear();
	        System.out.println("Student Names after clearing all elements: " + studentNames);
	    }
	}