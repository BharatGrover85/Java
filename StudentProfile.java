package java1;

public class StudentProfile {
	public static void main(String[] args) {
		String studentName="Rahul";
		int rollNumber = 86;
		String collegeName= "The Northcap University";
		String courseName = "BCA";
		int semester= 3;
		int JavaMarks= 34;
		int databaseMarks=53;
		int webTechnologyMarks=65;
		int totalMarks = JavaMarks + databaseMarks + webTechnologyMarks;
		double percentage = totalMarks / 3.0;
		char grade='B';
		boolean pass_Status=true;
		
		System.out.println("Student Name: "+studentName);
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("College Name: "+collegeName);
		System.out.println("Course Name: "+courseName);
		System.out.println("Semester: "+semester);
		System.out.println("Java Marks: "+JavaMarks);
		System.out.println("Database Marks: "+databaseMarks);
		System.out.println("Web Technology Marks: "+webTechnologyMarks);
		System.out.println("Total Marks: "+totalMarks);
		System.out.println("Percentage: "+percentage);
		System.out.println("Grade: "+grade);
		System.out.println("Pass Status: "+pass_Status);
	}

}
