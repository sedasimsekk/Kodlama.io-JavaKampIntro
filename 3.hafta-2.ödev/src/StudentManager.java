
public class StudentManager extends UserManager {
	
	public void selectCourse(Student student) {
		
		System.out.println(student.getFirstName()+" Kursa Kat�ld�.");
	}
	
	public void leaveCourse(Student student) {
		
		System.out.println(student.getFirstName()+" Kurstan Ayr�ld�.");
	}

}
