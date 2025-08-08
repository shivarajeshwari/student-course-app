package managementSystem;

import java.util.ArrayList;
import java.util.List;

public class Student {

		private int id;
		private String name;
		private long phNo;
		private List<Course> enrolledCourses;
		
		Student(int id, String name, long phNo){
			  this.id = id;
			  this.name = name;
			  this.phNo = phNo;
		      this.enrolledCourses = new ArrayList<>();
		}
		
		public int getId(){
			return id;
		}
		
		public String getName() {
			return name;
		}
		
		public long getphNo() {
			return phNo;
		}
		
		 public List<Course> getEnrolledCourses() {
		        return enrolledCourses;
		    }

		    public void printEnrolledCourses() {
		        System.out.print("Courses enrolled by " + name + ": ");
		        if(enrolledCourses.size() == 0) {
		        	System.out.println("Not enrolled in any Course");
		        	return;
		        }
		        for (Course c : enrolledCourses) {
		            System.out.println("- " + c.getName());
		        }
		    }
	}

