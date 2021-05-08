
public class Ýnstructor extends User {
	
	
	private String myCourse;
    public Ýnstructor() {
		
	}
	

	public Ýnstructor(int id, String firstName, String lastName, String email, String password,String myCourse) {
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