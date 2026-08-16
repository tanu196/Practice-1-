public class BunkAccount {
	private String accountHolder;
	private int balance;
	
	public BunkAccount(String accountHolder , int balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public BunkAccount() {
		
	}
	public void withdraw(int amount) throws ZandakaBusokuException {
		
		if(amount < balance) {
			throw new ZandakaBusokuException("残高不足です");
		}
		balance -= amount;
		
		
	}
	
}
