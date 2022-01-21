
public abstract class Account implements IAccount{
	
	protected static final int STANDARD_BRANCH = 1;
	
	protected int bank_branch;
	protected int idNumber;
	protected double balance;
	protected Client client;
	
	public Account(Client client) {
		this.client = client;
	}
	
	public int getBank_branch() {
		return bank_branch;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	
	public double getBalance() {
		return balance;
	}

	@Override
	public void withdraw(double value) {
		this.balance -= value;
		
	}

	@Override
	public void deposit(double value) {
		this.balance += value;
		
	}

	@Override
	public void transfer(double value, Account destinyAccount) {
		this.withdraw(value);
		destinyAccount.deposit(value); 
		
	}

	@Override
	public void printExtract() {
			
			System.out.println("Client: " + client.getName());
			System.out.println("Branch: " + bank_branch);
			System.out.println("Account number: " + idNumber);
			System.out.println("Balance amount: " + balance);
				
	}
	
	
	
}
