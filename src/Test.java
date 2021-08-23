import java.util.Scanner;

import com.employee.utils.FullNameException;




public class Test {

	public static void main(String[] args)  {
		
		/*
		 * Scanner sc = new Scanner(System.in); FunctionEmployee f = new
		 * FunctionEmployee();
		 * 
		 * System.out.println("====Enter information employee===="); f.enterList(sc);
		 * System.out.println("Display information all:  "); f.displayList();
		 * 
		 * System.out.println("Search information employee: ");
		 * System.out.println("Enter EmployeeType: ");
		 * 
		 * int employeeType = Integer.parseInt(sc.nextLine());
		 * f.searchEmployee(employeeType);
		 * 
		 * System.out.println("Delete information employee");
		 * System.out.println("Enter Id:"); int id =Integer.parseInt(sc.nextLine()); try
		 * { f.removeEmployee(id); f.displayList(); } catch (FullNameException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		
		
		Scanner scanner = null;
		Integer choice;
		FunctionEmployee f = new FunctionEmployee();
		try {
			scanner = new Scanner(System.in);

			do {
				System.out.println("Manage Employee");
				System.out.println("1.Add || 2.Update || 3.Delete || 4.Search || 5.Display");
				System.out.println("Select option");
				choice = Integer.parseInt(scanner.nextLine());
				
				switch (choice) {
				case 1:
					System.out.println("====Enter information employee====");

					f.enterList(scanner);

					break;
				case 2:
					System.out.println("Type ID employee:");
					int id1 = Integer.parseInt(scanner.nextLine());
					System.out.println("Type Employee Type:");
					int employeeType1 = Integer.parseInt(scanner.nextLine());
					scanner.nextLine();
					f.updateEmployee(id1, employeeType1, scanner);
					break;
				case 3:
					System.out.println("Delete information employee");
					System.out.println("Enter Id:");
					int id = Integer.parseInt(scanner.nextLine());
					
				    f.removeEmployee(id);					
					break;
					
				case 4:
					System.out.println("Search information employee ");
					System.out.println("Enter EmployeeType: ");
					int employeeType = Integer.parseInt(scanner.nextLine());
					f.searchEmployee(employeeType);
					break;

				case 5:
					System.out.println("Display information all:  ");
					f.displayList();
				default:
					break;
				}
			} while (!(choice == 0));

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		 

	}

}
