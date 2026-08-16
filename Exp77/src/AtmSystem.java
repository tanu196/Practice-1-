public class AtmSystem {
	
	static int balance = 5000;
	
	public static void main(String[] args) {
		try {
			withdraw(6000);
			
			
		}catch (ZandakaException e) {
			System.out.println("error");
		}
	}
	
	static void withdraw(int amount) throws ZandakaException{
		if(balance < amount) {
			throw new ZandakaException("残高不足です");
		}
	}
}
