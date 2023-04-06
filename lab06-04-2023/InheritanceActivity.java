package scenario;


class Employee{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	
	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeAddress=employeeAddress;
		this.employeePhone=employeePhone;
	}
	
	public void calculateSalary(double specialAllowance, double hra )
	{
		double salary;
		salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);
		System.out.println("Salary"+salary);
	}
	public void calculateTransportAllowance(double basicSalary) 
	{
		double transportAllowance = 10/100*basicSalary;
		System.out.println(transportAllowance);	
	}
}

class Manager extends Employee{

	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary=basicSalary;
	}
	public void calculateTransportAllowance() {
		double transportAllowance = 15*basicSalary /100;
		System.out.println(transportAllowance);	
		
	}
	@Override
	public String toString() {
		return "Manager [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", employeePhone=" + employeePhone + ", basicSalary=" + basicSalary
				+ ", specialAllowance=" + specialAllowance + ", hra=" + hra + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
 class Trainee extends Employee{

	public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary=basicSalary;
	}
	public void calculateTransportAllowance() {
		double transportAllowance = 15*basicSalary /100;
		System.out.println(transportAllowance);
	}
	@Override
	public String toString() {
		return "Trainee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", employeePhone=" + employeePhone + ", basicSalary=" + basicSalary
				+ ", specialAllowance=" + specialAllowance + ", hra=" + hra + "]";
	}
	
	}
	
	 

public class InheritanceActivity {

	public static void main(String[] args) {
		Manager man1 = new Manager(126534, "Peter", "Chennai India", 237844);
		System.out.println(man1);
		man1.calculateSalary(2456, 45668);
		man1.calculateTransportAllowance();
		
		Trainee tra1 = new Trainee(29846, "Jack", "Mumbai India", 442085);
		System.out.println(tra1);
		tra1.calculateSalary(5486, 15540);
		tra1.calculateTransportAllowance();
		

	}

}
