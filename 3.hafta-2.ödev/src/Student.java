
public class Student extends User{
	

	private String educationLevel;
	
	public Student() {
		
	}

	public Student(int id, String firstName, String lastName, String email, String password,String educationLevel) {
		super(id,firstName,lastName,email,password);
		this.educationLevel = educationLevel;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	
}

