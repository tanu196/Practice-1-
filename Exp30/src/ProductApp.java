
public class ProductApp {

	public static void main(String[] args) {

		System.out.println("＝＝＝商品登録と税率登録＝＝＝");
		Product.showTaxRate();
		Product.showProductCount();

		Product p1 = new Product("ノート", 120);
		Product p2 = new Product("ボールペン", 180);
		Product p3 = new Product("USBメモリ", 980);

		p1.showInfo();
		p2.showInfo();
		p3.showInfo();

		System.out.println("\n===商品登録数と税率＝＝＝");
		Product.showTaxRate();
		Product.showProductCount();
	}

}
