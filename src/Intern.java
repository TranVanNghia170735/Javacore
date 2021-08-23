
import java.util.Scanner;

public class Intern extends Employee{
	private String majors;
	private String semester;
	private String universityName;
			
	  public Intern() {
		  
	  }
	
	public Intern(int id, String fullName, String birthDay, String phone, String email, int employeeType, String majors,
			String semester, String universityName) {
		super(id, fullName, birthDay, phone, email, employeeType);
		this.majors = majors;
		this.semester = semester;
		this.universityName = universityName;
	}
	
	
	public void enterInformation (Scanner sc) {
		super.enterInformation(sc);
		System.out.println("Enter Major : ");
		majors = sc.nextLine();
		
		System.out.println("Enter Semester :");
		semester  = sc.nextLine();
		
		System.out.println("Enter UniversityName: ");
		universityName   = sc.nextLine();
		
		
	}

	@Override
	public void showMe() {
		System.out.println("Display information Employee Intern: ");
		System.out.println("ID: " +super.getId());
		System.out.println("FullName: " +super.getFullName());
		System.out.println("BirthDay: " +super.getBirthDay());
		System.out.println("Phone: " +super.getPhone());
		System.out.println("Email: " +super.getEmail());
		System.out.println("Employee Type: " +super.getEmployeeType());
		System.out.println("Major: " +majors);
		System.out.println("Semester: " +semester);
		System.out.println("University Name: " +universityName);
		
	}
	
	

}
