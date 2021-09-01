package SchoolManagementSystem;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main (String [] args) {
		
		Teacher matt = new Teacher(1,"Matt",500);
		Teacher derik = new Teacher(2,"Derik",600);
		Teacher canopy = new Teacher(3,"Canopy",650);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(derik);
		teacherList.add(matt);
		teacherList.add(canopy);
		
		Student maguel = new Student(1,"Maguel",3);
		Student robin = new Student(2,"Robin",5);
		Student natly = new Student(3,"Natly",8);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(maguel);
		studentList.add(robin);
		studentList.add(natly);
		
		School ST_Peters = new School(teacherList, studentList);
		
		
		natly.payFees(5000);
		robin.payFees(5000);
		
		//Giving Salary to Teachers
		
		matt.receiveSalary(matt.getSalary());
		System.out.println(ST_Peters.getTotalMoneyEarned());
		

	}
}
