
public class EmployeeAssignedToRegion extends Employee {

	private int region = 0;

	public EmployeeAssignedToRegion() {
		super();

		this.region = 0;
	}

	public EmployeeAssignedToRegion(int id, String idNumber, String firstName, char middleIntial, String lastName,
			String dateOfBirth, double salary, int region) {
		super(id, idNumber, firstName, middleIntial, lastName, dateOfBirth, salary);

		setRegion(region);
	}

	public EmployeeAssignedToRegion(int id, String idNumber, String firstName, char middleIntial, String lastName,
			String dateOfBirth, int region) {
		this(id, idNumber, firstName, middleIntial, lastName, dateOfBirth, 0.0, region);

	}

	public EmployeeAssignedToRegion(int id, String idNumber, String firstName, String lastName, String dateOfBirth,
			double salary, int region) {
		this(id, idNumber, firstName, ' ', lastName, dateOfBirth, salary, region);

	}

	public int getRegion() {
		return region;
	}

	public void setRegion(int region) {
		this.region = region;
	}
	
	@Override
	public String toString() {
		String temp = "";
		temp += super.toString();
		temp += "\nregion : " + region;
		return temp;
	}

}
