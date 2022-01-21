
public class Saving_account extends Account{
	
	private static int SEQUENCIALSAVING = 10001;
	
	public Saving_account(Client client) {
		super(client);
		super.bank_branch = STANDARD_BRANCH;
		super.idNumber = SEQUENCIALSAVING++;
	}

	
}
