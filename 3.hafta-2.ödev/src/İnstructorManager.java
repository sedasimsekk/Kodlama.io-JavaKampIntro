
public class İnstructorManager extends UserManager{
	
	public void createCourse(İnstructor instructor) {
		
		System.out.println(instructor.getFirstName()+" Kursu Açtı.");
	}
	public void deleteCourse(İnstructor instructor) {
		
	     System.out.println(instructor.getFirstName()+" Kursu Kapattı.");
	}

}

