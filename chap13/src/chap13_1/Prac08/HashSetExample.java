package chap13_1.Prac08;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1, "È«±æµ¿"));
		set.add(new Student(2, "½Å¿ë±Ç"));
		set.add(new Student(1, "Á¶¹Î¿ì"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + " : " + student.name);
		}
	}

}
