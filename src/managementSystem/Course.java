package managementSystem;

	public class Course {
	    private int id;
	    private String name;
	    private String duration;
	    private String instructor;
	    private double fee;
	    
	    Course(int id, String name,String duration, String instructor,double fee){
	    	this.id = id;
	    	this.name = name;
	    	this.duration = duration;
	    	this.instructor = instructor;
	    	this.fee = fee;
	    }
	    
	    public int getId() {
	    	return id;
	    }
	    
	    public String getName() {
	    	return name;
	    }
	    
	    public String getDuration() {
	    	return duration;
	    }
	    
	    public String getInstructor() {
	    	return instructor;
	    }
	    
	    public double getFee() {
	    	return fee;
	    }
	}
