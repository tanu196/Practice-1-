
public class Product {
	private String name;
	private int price;
	private int productCount;
	static double taxRate;
	
	static {
		System.out.println("Peoductクラスが読み込まれました");
		System.out.println("注意：フィールドは初期化されていません");
		taxRate = 0.05;
		System.out.println("消費税率を設定しました。現在の税率は" + taxRate + "です");
	}
	
	
	
	{
		this.name = "未設定";
		this.price = 0;
		productCount++;
		System.out.println(productCount);
	}
}
