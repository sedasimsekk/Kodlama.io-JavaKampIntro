
public class Main {

	public static void main(String[] args) {
		Student student1=new Student(1,"Seda","�im�ek","sedasimsek@gmail.com","123456","Lisans");
		�nstructor instructor1=new �nstructor(1,"Engin","Demiro�","engindemirog@gmail.com","456789","Programlamaya Giri� ��in Kurs");
		
		Student student2=new Student();
		student2.setId(2);
		student2.setFirstName("Yesim");
		student2.setLastName("�im�ek");
		student2.setEmail("yesimsimsek@gmail.com");
		student2.setPassword("753159");
		student2.setEducationLevel("�n lisans");
		
		�nstructor instructor2=new �nstructor();
		instructor2.setId(2);
		instructor2.setFirstName("Kerem");
		instructor2.setLastName("Var�s");
		instructor2.setEmail("keremvar�s@gmail.com");
		instructor2.setPassword("159753");
		instructor2.setMyCourse("Yaz�l�m Geli�tirici Yeti�tirme Kursu");
		
		StudentManager studentManager=new StudentManager();
		studentManager.login(student1);
		studentManager.logout(student1);
		studentManager.selectCourse(student2);
		studentManager.leaveCourse(student2);
		
		�nstructorManager instructorManager=new �nstructorManager();
		instructorManager.login(instructor1);
		instructorManager.logout(instructor1);
		instructorManager.createCourse(instructor2);
		instructorManager.deleteCourse(instructor2);


	}

}
