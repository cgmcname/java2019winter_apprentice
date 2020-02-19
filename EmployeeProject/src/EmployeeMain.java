
public class EmployeeMain {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "1", "David", 'B', "Banner", "01/01/1960", 100000.00);

		Employee emp2 = new Employee(2, "2", "Thor", "Odinson", "01/01/1660", 10.00);

		Employee emp3 = new Employee(3, "3", "John", 'J', "Doe", "01/01/1340");
		
		EmployeeAssignedToRegion guy = new EmployeeAssignedToRegion(1, "1", "David", "Banner", "01/01/1960", 100000.00, 4);
		
		int check = 0;

		//System.out.println(emp1);

		//System.out.println();
		//System.out.println();

		//System.out.println(emp1.getDateOfBirth());

		//System.out.println(emp2.getMiddleIntial());

		//System.out.println(emp3.getSalary());
		
		check = emp3.calculateAge();
		
		System.out.println(check);

	}

}
