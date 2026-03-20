package expriment2;

import java.util.*;
public class Student {
	
	    int rollNo;
	    String name;
	    double marks;

	    Student(int rollNo, String name, double marks) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.marks = marks;
	    }

	 
	    public int compareTo(Student s) {
	        return this.rollNo - s.rollNo;
	    } 

	   
	    public String toString() {
	        return rollNo + " " + name + " " + marks;
	    }
	}


	class SortByName implements Comparator<Student> {
	    public int compare(Student a, Student b) {
	        return a.name.compareTo(b.name);
	    }
	}

	
	class SortByMarks implements Comparator<Student> {
	     public int compare(Student a, Student b) {
	        return Double.compare(b.marks, a.marks); 
	    }
	}

	 class StudentManagement {
	    public static void main(String[] args) {

	        ArrayList<Student> list = new ArrayList<>();

	        list.add(new Student(103, "Riya", 78.5));
	        list.add(new Student(101, "Anu", 85.0));
	        list.add(new Student(104, "Sneha", 92.3));
	        list.add(new Student(102, "Priya", 88.7));

	        System.out.println("Original List:");
	        for(Student s : list)
	            System.out.println(s);

	  
	        Collections.sort(list, new SortByName());
	        System.out.println("\nSorted by Name:");
	        for(Student s : list)
	            System.out.println(s);

	        
	        Collections.sort(list, new SortByMarks());
	        System.out.println("\nSorted by Marks (Descending):");
	        for(Student s : list)
	            System.out.println(s);
	    }
	}
	