
public class Żnstructor extends User {
	
	
	private String myCourse;
    public Żnstructor() {
		
	}
	

	public Żnstructor(int id, String firstName, String lastName, String email, String password,String myCourse) {
		super(id,firstName,lastName,email,password);
		this.myCourse = myCourse;
	}


	public String getMyCourse() {
		return myCourse;
	}


	public void setMyCourse(String myCourse) {
		this.myCourse = myCourse;
	}
	
	

}