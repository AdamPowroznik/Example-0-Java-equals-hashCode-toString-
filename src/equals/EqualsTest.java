package equals;

public class EqualsTest {

	public static void main(String[] args) {
		Employee alice1 = new Employee("Alicja Adamczuk", 75000, 1987, 12, 15);
		Employee alice2 = alice1;
		Employee alice3 = new Employee("Alicja Adamczuk", 75000, 1987, 12, 15);
		Employee bob = new Employee("Bartosz Borkowski", 50000, 1989, 7, 1);
		
		System.out.println("alice1 == alice2: " + (alice1 == alice2));
		System.out.println("alice1 == alice3: " + (alice1 == alice3));
		System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
		System.out.println("alice1.equals(bob): " + alice1.equals(bob));
		System.out.println("bob.toString(): " + bob.toString());
		
		Menager carl = new Menager("Karol Krakowski", 80000, 1987, 12, 15);
		Menager boss = new Menager("Karol Krakowski", 80000, 1987, 12, 15);
		boss.setBonus(5000);
		System.out.println("boss.toString(): "+ boss);
		System.out.println("carl.equals(boss): " + carl.equals(boss));
		System.out.println("boss.hashCode(): " + boss.hashCode());
	}

}
