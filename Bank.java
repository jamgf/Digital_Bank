import java.util.List;

public class Bank {
	
	private String nameBank = "Digital Bank";

	public String getNameBank() {
		return nameBank;
	}

	public void setNameBank(String name) {
		this.nameBank = name;
	}
	
	private List<Account> accounts;

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	
}
