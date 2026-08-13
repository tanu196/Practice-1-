public class AtmSystem {
	static int balance = 5000;

	public static void main(String[] args) {
		
	}
	
	static void withdraw(int amount) throws Exception{
		if(amount < 70) {
			throw new Exception("残高不足です");
		}
		
		
		balance -= amount;
		
		System.out.println("現金を引き出します：" + amount + "円");
	}	
}
