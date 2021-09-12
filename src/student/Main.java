package student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String args[]) {
		
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student(101,"Kim",23);
		al.add(s1);
		Student s2 = new Student(102,"Choi",21);
		al.add(s2);
		al.add(new Student(103,"Park",28));
		al.add(new Student(104,"Lee",26));
		al.add(new Student(105,"Yeon",24));
		al.add(new Student(106,"Jung",21));
		al.add(new Student(107,"Kim",26));
		al.add(new Student(108,"Lee",26));
		al.add(new Student(109,"Lee",22));
		al.add(new Student(110,"Park",20));
		Collections.sort(al);
		
		for(Student s : al) {
			System.out.println(s.toString());
		}
		
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al,Collections.reverseOrder());
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i).toString());
		}
	}
}
