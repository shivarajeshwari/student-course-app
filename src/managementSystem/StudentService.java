package managementSystem;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class StudentService {
	
	public StudentService() {
	    avaliableCourses();
	}
	
    static  List<Student> students = new ArrayList<>();
	static List<Course> courses = new ArrayList<>();
	
	int id;
	
	private boolean doIdExist(int id) {
		for(Student s: students ) {
			if(s.getId() == id) {
				return true;
			}
		}
		return false;
	}

	public void registerStudent(Scanner sc) {
		int id; 
	
		while(true)
		{
			System.out.print("Enter your ROLLNUMBER: ");	
			id = sc.nextInt();
			sc.nextLine();
		
			if(doIdExist(id)) {
				System.out.println("ID already EXISTS");
			}
			else {
				registerStudent(sc,id);
				return;
			}
		}
	}

		private void registerStudent(Scanner sc, int id) {
			String name="";Long phNo;
		
			System.out.print("Enter your NAME: ");
			name = sc.nextLine();
		
			System.out.print("Enter your PHONE NUMBER: ");
			phNo = sc.nextLong();
		
			students.add(new Student(id,name, phNo));
			
			System.out.println("Successfully Registered");
		}
	
	public void viewStudentDetails(Scanner sc) {
		boolean exists = false;
		System.out.println("Enter your ROLLNUMBER: ");
		id =  sc.nextInt();
		
		for(Student s: students ) {
			if(s.getId() == id) {
				exists = true;
				System.out.println("ID: "+s.getId());
				System.out.println("Name: "+s.getName());
				System.out.println("phNo: "+s.getphNo());
				System.out.println("Courses: ");
				s.printEnrolledCourses();
				                       //--------------------courses enrolled----------//
				break;
			}
		}
		if(!exists)System.out.println("Invalid/ID does not exist");
	}

	public void enrollInCourse(Scanner sc) {
		System.out.println("Enter your ROLLNUMBER: ");
		id =  sc.nextInt();
		sc.nextLine();
		if(!doIdExist(id)) {
			System.out.println("Please!!! first register  as a student");
			return;
		}
		
		
			String name; boolean courseFound=false;
			System.out.println();
			System.out.println("Avaliable Courses: ");
			System.out.println("|  ID  |  NAME  |  DURATION  |  INSTRUCTOR  |  FEE  |");
			for(Course c : courses) {
				System.out.println(c.getId()+" "+c.getName()+" "+c.getDuration()+" "+c.getInstructor()+" "+c.getFee());
			}
			System.out.print("Enter the COURSENAME you want to enroll in: ");
			name = sc.nextLine();
			
		for (Course ch : courses) {
			 if (ch.getName().equalsIgnoreCase(name)) {
			 courseFound = true;
	            for (Student student : students) {
	                if (student.getId() == id) {
	                    student.getEnrolledCourses().add(
	                        new Course(ch.getId(), ch.getName(), ch.getDuration(), ch.getInstructor(), ch.getFee())
	                    );
	                    System.out.println("Enrolled in course: " + ch.getName());
	                    break;
	                }
	            }
	            break;
	        }
	    }

	    if (!courseFound) {
	        System.out.println("Course with name '" + name + "' not found.");
	    }
	    
	}
	
	private  void avaliableCourses() {  // want to add new courses call method;
		if (!courses.isEmpty()) return; 
		courses.add(new Course(1, "Java", "3 Months", "Mr. Sharma", 5000));
	    courses.add(new Course(2, "Python", "2 Months", "Ms. Priya", 4000));
	    courses.add(new Course(3, "Web Development", "4 Months", "Mr. Khan", 6000));
	    courses.add(new Course(4, "C++", "2 Months", "Mr. Verma", 4500));
	}


//public List<Student> getStudents() { return students; }
//public List<Course> getCourses() { return courses; }

}
