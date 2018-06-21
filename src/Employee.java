import java.time.LocalDate;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee (String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent/100;
		salary += raise;
	}
	
	
	@Override public boolean equals (Object otherObject) {
		//1. Check if objects are the same
		if(this == otherObject) return true;
		//2. Check if object is explicit parameter is null
		if(otherObject == null) return false;
		//3. Check if classes are the same
		if(getClass() != otherObject.getClass())
			return false;
		//3A.or use instanceof if many subclasses uses the same equals()
		//if(!(otherObject instanceof Employee)) return false;
		//4. Now we know that otherObject isn't null instance of Empleyee
		Employee other = (Employee) otherObject;
		//5. Now compare your fields
		return name.equals(other.name)
				&& salary == other.salary
				&& hireDay.equals(other.hireDay);
	}
}
