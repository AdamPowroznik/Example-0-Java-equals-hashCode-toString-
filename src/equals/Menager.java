package equals;

public class Menager extends Employee {
	private double bonus;
	
	public Menager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus = 0;
	}
	
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override public boolean equals(Object otherObject) {
		if(!super.equals(otherObject)) return false;
		Menager other = (Menager) otherObject;
		//if in line 21 say that objects are from the same class
		return bonus == other.bonus;
	}
	
	@Override public int hashCode() {
		return super.hashCode() + 17 * new Double(bonus).hashCode();
	}
	
	@Override public String toString() {
		return super.toString() + "[bonus=" + bonus +"]";
	}
}
