
public class Checking_account extends Account{
	
private static int SEQUENCIALCHECKING = 90001;
	
	public Checking_account(Client client) {
		super(client);
		super.bank_branch = STANDARD_BRANCH;
		super.idNumber = SEQUENCIALCHECKING++;
		
	
	}

	
}