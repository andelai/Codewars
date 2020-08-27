package Kata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TripleSorter {

//    static Comparator<Student> byStudent = Comparator.comparing(Student::getGpa).reversed()
//    		.thenComparing((s1, s2) -> { return (String.valueOf(s1.getFullName().charAt((s1.getFullName().indexOf(" "))+1))).compareTo(String.valueOf(s2.getFullName().charAt((s2.getFullName().indexOf(" "))+1)));  })
//    		.thenComparing(Student::getAge);

    //another Eg comparator
//    static final Comparator<Student> sortOrder = Comparator
//            .comparingInt(Student::getGpa).reversed()
//            .thenComparing(s -> s.getFullName().split(" ")[1].charAt(0))
//            .thenComparingInt(Student::getAge);
    
    
    public static String sort(List<Student> students) {
//    	students = students.stream().sorted(byStudent).collect(Collectors.toList());
    	
//    	String ret = "";
//    	for ( Student s : students) {
//    		ret += s.getFullName()+",";
//    	}
//        return ret.substring(0,ret.length()-1);
    	System.out.println(students.stream()
              //  .sorted(sortOrder)
                .map(Student::getFullName)
                .collect(Collectors.joining(",")));
    	return students.stream()
              //  .sorted(sortOrder)
                .map(Student::getFullName)
                .collect(Collectors.joining(","));
    }
    
    public static void main(String[] a) {
    	 List<Student> students = new ArrayList<>();
//         students.add(new Student(23, 88, "David Goodman"));
//         students.add(new Student(25, 82, "Mark Rose"));
//         students.add(new Student(22, 90, "Jane Doe"));
//         students.add(new Student(25, 90, "Jane Dane"));
//         assertEquals("Jane Doe,Jane Dane,David Goodman,Mark Rose",
//                      TripleSorter.sort(students));
//         TripleSorter.sort(students);
    }
}
