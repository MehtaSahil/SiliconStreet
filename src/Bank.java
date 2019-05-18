
public class Bank {

	private int accountValue;
	
	public Bank() {	
		accountValue = 0;
	}
	
	public boolean deposit(int depositAmount) {
		accountValue += depositAmount;
		
		return true;
	}
	
	public boolean withdraw(int withdrawlAmount) {
		if (withdrawlAmount > accountValue) {
			System.out.println("Insufficient funds to make this withdrawl.");
			return false;
		}
		
		accountValue -= withdrawlAmount;
		return true;
	}
	
	public int getAccountValue() {
		return accountValue;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		
		s.append("The current account value is: ");
		s.append(accountValue);
		
		return s.toString();
	}
}
