import java.util.Scanner;


public class Experience extends Employee{
	
	private int expInYear;
	private String proSkill;
    		
	public Experience() {
		super();
	}

	public Experience(int id, String fullName, String birthDay, String phone, String email, int employeeType,
			int expInYear, String proSkill) {
		super(id, fullName, birthDay, phone, email, employeeType);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}

	public void enterInformation (Scanner sc) {
		super.enterInformation(sc);
		System.out.println("Enter ExpInYear");
		expInYear = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter ProSkill");
		proSkill  = sc.nextLine();
		
		
	}

	@Override
	public void showMe() {
		System.out.println("Display information Employee Experience: ");
		System.out.println("ID: " +super.getId());
		System.out.println("FullName: " +super.getFullName());
		System.out.println("BirthDay: " +super.getBirthDay());
		System.out.println("Phone: " +super.getPhone());
		System.out.println("Email: " +super.getEmail());
		System.out.println("Employee Type: " +super.getEmployeeType());
		System.out.println("ExpInYear: " +expInYear);
		System.out.println("Pro Skill: " +proSkill);
	}
	

	public int getExpInYear() {
		return expInYear;
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}

	
	
	








	
	

}
