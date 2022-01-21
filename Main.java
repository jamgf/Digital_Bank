
public class Main {
	public static void main(String[] args) {
		Client john = new Client();
		john.setName("John Johnes");
		
		
		Account ca = new Checking_account(john);
		Account sa = new Saving_account(john);
		
		ca.deposit(560.0);
		sa.deposit(340.0);
		ca.transfer(45.0, sa);
		sa.withdraw(78.0);
		
		ca.printExtract();
		
		sa.printExtract();
		
	}
}
