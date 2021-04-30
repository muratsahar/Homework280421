import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Student student1=new Student();
		student1.setId(1);
		student1.setName("Murat");
		student1.setSurname("Şahar");
		student1.setNationalIdentity("123");
		student1.setTuitionFee(11000);
		
		Instructor instructor1=new Instructor();
		instructor1.setName("Veli");
		instructor1.setSurname("Öğretir");
		
		System.out.println("***Kardeş classların parent class arrayinde tanımlanması**");
		User[] users= {student1,instructor1};
		UserManager userManager=new UserManager();
		userManager.printIDCardforEntryMultiple(users);
		
		System.out.println("**Kardeş sınıfların,parentta olmayan metodları birbirlerinin yerine çalıştırabilmesi***");
		StudentManager studentManager=new StudentManager();
		for(User user:users) {
			studentManager.define(user);
		}
		
		System.out.println("***3. bir sınıfın kendisine gönderilen classa göre çalışması**");
		AdministrativeAffairs administrativeAffairs=new AdministrativeAffairs();
		administrativeAffairs.add(studentManager);
		InstructorManager instructorManager=new InstructorManager();
		administrativeAffairs.add(instructorManager);
}
}