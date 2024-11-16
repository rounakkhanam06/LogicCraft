package Employee;

import java.util.Scanner;

public class BonusCal {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the employee's salary: ");
	double salary = scanner.nextDouble();

   	System.out.print("Enter the employee's experience: ");
        int experience = scanner.nextInt();

  	double bonus = (experience > 20) ? (0.20 * salary) : (0.10 * salary);
        System.out.println("The bonus for the employee is:"+ bonus);
        scanner.close();
	
}
}
