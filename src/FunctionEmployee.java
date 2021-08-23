import java.util.ArrayList;
import java.util.Scanner;

import com.employee.utils.BirthDayException;
import com.employee.utils.FullNameException;

public class FunctionEmployee {
	private ArrayList<Employee> listEmployees;
	
	public  FunctionEmployee() {
		listEmployees = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee) {
		listEmployees.add(employee);
	}
	
	
	
	public void enterList(Scanner sc) {
		Employee employee;
		System.out.println("Enter number employee: ");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter detail Employee: ");
		for(int i = 0; i<n; i++) {
			System.out.println("Number employee: " +(i+1) +": ");
			System.out.println("Choose : (0-Exper || 1-Fresher || 2-Intern )");
			
			int choose = sc.nextInt();
			sc.nextLine();
			
			switch (choose) {
			case 0:
				employee = new Experience();
				break;
			
			case 1:
				employee = new Fresher();
				break;
			case 2:
				employee  = new Intern();
			default:
				employee = new Experience();
				break;
			}
			employee.enterInformation(sc);
			addEmployee(employee);
			
		}
		
		
	}
	
	public void displayList() {
		for(Employee e: listEmployees) {			
			e.showMe();
		}
	}
	
	public void searchEmployee(int employeeType) {
		for(Employee e : listEmployees) {
           if(employeeType == e.getEmployeeType()) {
        	   e.showMe();
           }
		}
		
	}
	
	public void removeEmployee(int id) {
		
		for(int i = 0; i< listEmployees.size(); i++) {
			if(listEmployees.get(i).getId() == id) {
				listEmployees.remove(listEmployees.get(i));
			}
		}
     
	}
	
	public void updateEmployee(int id, int employeeType, Scanner sc) {
	
	
		for (int i = 0; i < listEmployees.size(); i++) {
			
			if(listEmployees.get(i).getId() == id) {
				   	
				if(listEmployees.get(i).getEmployeeType() == 0) {
					
			
					/*
					 * System.out.println("Enter FullName");
					 * listEmployees.get(i).setFullName(employee.getFullName());
					 * listEmployees.get(i).setId(employee.getId());
					 * listEmployees.get(i).setBirthDay(employee.getBirthDay());
					 * listEmployees.get(i).setPhone(employee.getPhone());
					 * listEmployees.get(i).setEmail(employee.getEmail());
					 * listEmployees.get(i).setEmployeeType(employee.getEmployeeType());
					 * listEmployees.get(i).
					 */
					Experience employee1 = new Experience();
					System.out.println("Enter Fullname: ");
					String fullName = sc.nextLine();
					
					try {
						employee1.setFullName(fullName);
						listEmployees.get(i).setFullName(employee1.getFullName());
					} 
					 catch (FullNameException e) {
						System.out.println("Error fullName");
					}
				                         
                    
					System.out.println("Enter BirthDay: ");
					String birthDay = sc.nextLine();
					try {
						employee1.setBirthDay(birthDay);
						listEmployees.get(i).setBirthDay(employee1.getBirthDay());
					} catch (BirthDayException e) {
						System.out.println("BirthDay error");
					}
					System.out.println("Enter phone");
					String phone = sc.nextLine();
					try {
						employee1.setPhone(phone);
						listEmployees.get(i).setPhone(employee1.getPhone());
					} catch (Exception e) {
						System.out.println("Phone error");
					}
					
					System.out.println("Enter email: ");
					String email = sc.nextLine();
					
					try {
						employee1.setEmail(email);
						listEmployees.get(i).setEmail(employee1.getEmail());
					} catch (Exception e) {
						System.out.println("Email error");
					}
					
					System.out.println("Enter Employee Type: ");
					int employeeType1 = Integer.parseInt(sc.nextLine());
					
					try {
						employee1.setEmployeeType(employeeType1);
						listEmployees.get(i).setEmployeeType(employee1.getEmployeeType());
					} catch (Exception e) {
						System.out.println("Employee Type Error");
						
					}
				
																																													
                    
				}	
													
			}
		}
	}
	
	
	
	
	
	

}
