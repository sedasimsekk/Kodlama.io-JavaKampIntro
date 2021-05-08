
public class ÝnstructorManager extends UserManager{
	
	public void createCourse(Ýnstructor instructor) {
		
		System.out.println(instructor.getFirstName()+" Kursu Açtý.");
	}
	public void deleteCourse(Ýnstructor instructor) {
		
	     System.out.println(instructor.getFirstName()+" Kursu Kapattý.");
	}

}

