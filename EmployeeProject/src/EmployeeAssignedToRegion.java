
public class EmployeeAssignedToRegion extends Employee {

	Region reg;
	

	public EmployeeAssignedToRegion() {
		super();

		this.reg = reg.ALASKA;
	}

	public EmployeeAssignedToRegion(int id, String idNumber, String firstName, char middleIntial, String lastName,
			String dateOfBirth, double salary, int region) {
		
		
		super(id, idNumber, firstName, middleIntial, lastName, dateOfBirth, salary);
		
		reg = Region.values()[region];

		
	}

	public EmployeeAssignedToRegion(int id, String idNumber, String firstName, char middleIntial, String lastName,
			String dateOfBirth, int region) {
		this(id, idNumber, firstName, middleIntial, lastName, dateOfBirth, 0.0, region);

	}

	public EmployeeAssignedToRegion(int id, String idNumber, String firstName, String lastName, String dateOfBirth,
			double salary, int region) {
		
		
		this(id, idNumber, firstName, ' ', lastName, dateOfBirth, salary, region);
		
		

	}

	public int getNumRegion() {
		return reg.ordinal();
	}
	
	public String getStringRegion() {
		
		return reg.toString();
	}

	public void setRegion(String region) {
		 reg = Region.valueOf(region);
	}
	
	@Override
	public String toString() {
		String temp = "";
		temp += super.toString();
		temp += "\nregion : " + getStringRegion() ;
		return temp;
	}

}
