package Kata;

//public class Student {
//	
//	String name;
//	int gpa;
//	int age;
//	
//	public Student(int age, int gpa, String name) {
//		this.age = age;
//		this.gpa = gpa;
//		this.name = name;
//	}
//	int getGpa() {
//	   return gpa;
//	}
//	int getAge() {
//	   return age;
//	}
//	String getFullName(){
//	   return name;
//  }
//	String getFirstLetterLastName() {
//		return String.valueOf(name.charAt((name.indexOf(" "))+1));
//	}
//}
public class Student {
	  private final String firstName;
	  private final String lastName;
	  public final String studentNumber;
	  
	  public Student(String string, String string2, String string3) {
		this.firstName=string;
		this.lastName=string2;
		this.studentNumber=string3;
	  }
	  
	  
	  public String getFullName() {
	    return firstName + " " + lastName;
	  }
	  public String getCommaName() {
	    return lastName + ", " + firstName;
	  }
	}