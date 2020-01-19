


public class EmployeeMain {

	public static void main(String[] args) {
		
		//test for git 
		//Try from here
		
		Employee emp1 = new Employee(1,"1","David", 'B', "Banner", "1/1/1960", 100000.00);
		
		Employee emp2 = new Employee(2,"2","Thor", "Odinson", "1/1/1660", 10.00);
		
		Employee emp3 = new Employee(3,"3","John", 'J', "Doe", "1/1/1340");
		
		System.out.println(emp1);
		
		System.out.println();
		System.out.println();
		
		System.out.println(emp1.getDateOfBirth());
		
		System.out.println(emp2.getMiddleIntial());
		
		System.out.println(emp3.getSalary());

	}

}
