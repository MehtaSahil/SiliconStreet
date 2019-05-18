import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b = new Bank();
		Scanner userIn = new Scanner(System.in);
		
		String key = "DEFAULT";
		
		while (!key.equals("EXIT")) {
			
			key = userIn.nextLine();
			System.out.println("received action: " + key);
			
			switch(key) {
				case "EXIT":
					System.out.println("exiting");
					break;
				case "DEPOSIT":
					System.out.println("Depositing 500");
					b.deposit(500);
					break;
				case "WITHDRAW":
					System.out.println("withdrawing 500");
					b.withdraw(500);
					break;
				default:
					System.out.println("unsupported command");
					break;
			}
			
			System.out.println(b);
		}
		
		System.out.println("FINISHED");
	}

}
