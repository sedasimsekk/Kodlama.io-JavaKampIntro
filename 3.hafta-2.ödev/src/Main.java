
public class Main {

	public static void main(String[] args) {
		Student student1=new Student(1,"Seda","Şimşek","sedasimsek@gmail.com","123456","Lisans");
		İnstructor instructor1=new İnstructor(1,"Engin","Demiroğ","engindemirog@gmail.com","456789","Programlamaya Giriş İçin Kurs");
		
		Student student2=new Student();
		student2.setId(2);
		student2.setFirstName("Yesim");
		student2.setLastName("Şimşek");
		student2.setEmail("yesimsimsek@gmail.com");
		student2.setPassword("753159");
		student2.setEducationLevel("ön lisans");
		
		İnstructor instructor2=new İnstructor();
		instructor2.setId(2);
		instructor2.setFirstName("Kerem");
		instructor2.setLastName("Varıs");
		instructor2.setEmail("keremvarıs@gmail.com");
		instructor2.setPassword("159753");
		instructor2.setMyCourse("Yazılım Geliştirici Yetiştirme Kursu");
		
		StudentManager studentManager=new StudentManager();
		studentManager.login(student1);
		studentManager.logout(student1);
		studentManager.selectCourse(student2);
		studentManager.leaveCourse(student2);
		
		İnstructorManager instructorManager=new İnstructorManager();
		instructorManager.login(instructor1);
		instructorManager.logout(instructor1);
		instructorManager.createCourse(instructor2);
		instructorManager.deleteCourse(instructor2);


	}

}
