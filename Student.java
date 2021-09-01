package SchoolManagementSystem;
/**
 * keep track of student's
 * name, grade and fees paid
 */
public class Student {
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * to create a new student by initially 
	 * fees for each student is $30k
	 * initial fees paid 0 
	 * @param id
	 * @param name
	 * @param grade
	 */
	
	public Student(int id, String name, int grade){
		
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
			
	}
	
	public void setGrades(int grade) {
		this.grade = grade;
	}
	
	public void payFees(int fees){
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}
	
}
