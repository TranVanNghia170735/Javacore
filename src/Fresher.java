import java.util.Scanner;

public class Fresher extends Employee{
	private String graduationDate;
	private String graduationRank;
	private String education;
	
	public Fresher() {
		
	}
		
	public Fresher(int id, String fullName, String birthDay, String phone, String email, int employeeType,
			String graduationDate, String graduationRank, String education) {
		super(id, fullName, birthDay, phone, email, employeeType);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}
    
	public void enterInformation (Scanner sc) {
		super.enterInformation(sc);
		System.out.println("Enter GraduationDate");
		graduationDate = sc.nextLine();
		
		System.out.println("Enter GranduationRank");
		graduationRank  = sc.nextLine();
		
		System.out.println("Enter Education");
		education   = sc.nextLine();
		
		
	}

	@Override
	public void showMe() {
		System.out.println("Display information Employee Fresher: ");
		System.out.println("ID: " +super.getId());
		System.out.println("FullName: " +super.getFullName());
		System.out.println("BirthDay: " +super.getBirthDay());
		System.out.println("Phone: " +super.getPhone());
		System.out.println("Email: " +super.getEmail());
		System.out.println("Employee Type: " +super.getEmployeeType());
		System.out.println("Graduation Date: " +graduationDate);
		System.out.println("Graduation Rank " +graduationRank);
		System.out.println("Education " +education);
		
	}
	

}
