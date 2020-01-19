
public class Employee extends Object {

	private int id;
	private String idNumber;

	private String firstName;
	private char middleIntial;
	private String lastName;

	private String dateOfBirth;
	private double salary;

	Employee() {

		id = 4;
		idNumber = "4hekjewer";

		firstName = "Bob";
		middleIntial = 'G';
		lastName = "What up";

		dateOfBirth = "12-5-34";
		salary = 20000;

	}

	Employee(int id, String idNumber, String firstName, char middleIntial, String lastName, String dateOfBirth,
			double salary) {

		setId(id);
		setIdNumber(idNumber);
		setFirstName(firstName);
		setMiddleIntial(middleIntial);
		setLastName(lastName);
		setDateOfBirth(dateOfBirth);
		setSalary(salary);

	}

	Employee(int id, String idNumber, String firstName, String lastName, String dateOfBirth, double salary) {

		setId(id);
		setIdNumber(idNumber);
		setFirstName(firstName);
		setMiddleIntial(' ');
		setLastName(lastName);
		setDateOfBirth(dateOfBirth);
		setSalary(salary);
		
		

	}
	
	Employee(int id, String idNumber, String firstName, char middleIntial, String lastName, String dateOfBirth) {

		setId(id);
		setIdNumber(idNumber);
		setFirstName(firstName);
		setMiddleIntial(middleIntial);
		setLastName(lastName);
		setDateOfBirth(dateOfBirth);
		setSalary(0.0);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public char getMiddleIntial() {
		return middleIntial;
	}

	public void setMiddleIntial(char middleIntial) {
		this.middleIntial = middleIntial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		String temp = "";
		temp += "\nid : " + id;
		temp += "\nidNumber : " + idNumber;
		temp += "\nfirstName : " + firstName;
		temp += "\nmiddleIntial : " + middleIntial;
		temp += "\nlastName : " + lastName;
		temp += "\ndateOfBirth : " + dateOfBirth;
		temp += "\nsalary : " + salary;
		
		return temp;
	}
	

}
