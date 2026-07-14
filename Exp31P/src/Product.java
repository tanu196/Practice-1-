public class Product {
	private String name;
	private int price;
	private static double discountRate;
	private static int productCount;

	static {
		System.out.println("キャンペーン情報を読み込んでいます...");
		String campaign = "大感謝祭";
		switch (campaign) {
		case "通常":
			discountRate = 0.0;
			break;
		case "セール":
			discountRate = 0.1;
			break;
		case "大感謝祭":
			discountRate = 0.3;
			break;
		default:
			discountRate = 0.0;
			break;
		}
		productCount = 0;
		System.out.println("現在の割引率は" + (int) (discountRate * 100) + "％です。");
	}
	{
		System.out.println("新し商品を登録します。");
		productCount++;
	}

	public Product(String name , int price) {
			this.name = name;
			this.price = price;
		}
	
	public void showInfo() {
		int discounted = (int)(price*(1-discountRate));
		System.out.println(name + "定価" + price + "円→ 割引後 " + discounted + "円");
	}

}
