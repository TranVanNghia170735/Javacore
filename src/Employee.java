
import java.util.Scanner;

import com.employee.utils.BirthDayException;
import com.employee.utils.EmailException;
import com.employee.utils.FullNameException;
import com.employee.utils.PhoneException;
import com.employee.utils.Validator;

public abstract class Employee {
	private int id;
	private String fullName;
	private String birthDay;
	private String phone;
	private String email;
	private int employeeType;
	public static int employeeCount = 0;
	
    public Employee() {
    	
    }

	public Employee(int id, String fullName, String birthDay, String phone, String email, int employeeType) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.phone = phone;
		this.email = email;
		this.employeeType = employeeType;
	}
	
	public void enterInformation(Scanner sc) {
		do {
			System.out.println("Enter id: ");
			id =  Integer.parseInt(sc.nextLine());
			try {
				this.setId(id);
			} catch (Exception e) {
			  System.out.println("Id exist");
			  continue;
			}
			break;
		} while (true);
		
		do {
			System.out.println("Enter FullName :");
			fullName = sc.nextLine();
			try {
				this.setFullName(fullName);
			} catch (Exception e) {
				System.out.println("FullName is not contain number: ");
				continue;
		
			}
			break;
		} while (true);
		
		do {
			System.out.println("Enter BirthDay: ");
			birthDay = sc.nextLine();
			try {
				this.setBirthDay(birthDay);
			} catch (Exception e) {
				System.out.println("Birthday format (YYYY-mm-dd):");
				continue;
			}
			break;
		} while (true);
		
		do {
			System.out.println("Enter Phone: ");
			phone   = sc.nextLine();
			try {
				this.setPhone(phone);
			} catch (Exception e) {
				System.out.println("Phone Number  contain 10 digit: ");
				continue;
			}
			break;
		} while (true);
		
		
		do {
			System.out.println("Enter Email: ");
			email   = sc.nextLine();
			try {
				this.setEmail(email);
			} catch (Exception e) {
				continue;
			}
			break;
		} while (true);
		
			
		System.out.println("Enter Employee Type: ");
		employeeType = Integer.parseInt(sc.nextLine());
		
	}
	
	
	public abstract void showMe();
	
	public int getId() {
		return id;
	}


	public String getFullName() {
		return fullName;
	}

	public String getBirthDay() {
		return birthDay;
	}


	public String getPhone() {
		return phone;
	}


	public String getEmail() {
		return email;
	}


	public int getEmployeeType() {
		return employeeType;
	}


	public void setId(int id)throws FullNameException {
		if(Validator.isExist(id)) {
			this.id = id;
		}else {
			throw new FullNameException("ID InValid");
		}
		
	}


	public void setFullName(String fullName) throws FullNameException {
		if(Validator.isName(fullName)) {
			this.fullName = fullName;
		}else {
			throw new FullNameException("Full Name InValid");
		}
		
		
	}


	public void setBirthDay(String birthDay)throws BirthDayException {
		if(Validator.isBirthDay(birthDay)) {
			this.birthDay = birthDay;
		}else {
			throw new BirthDayException("BirthDay InValid");
		}
		
	}

	public void setPhone(String phone)throws PhoneException {
		if(Validator.isPhone(phone)) {
			this.phone = phone;
		}else {
			throw new PhoneException("Phone InValid");
		}
		
	}



	public void setEmail(String email)throws EmailException {
		if(Validator.isEmail(email)) {
			this.email = email;
		}else {
			throw new EmailException("Email InValid");
		}
		
	}

	public void setEmployeeType(int employeeType) {
		this.employeeType = employeeType;
	}








	
	
	
	
	
	
	
}
