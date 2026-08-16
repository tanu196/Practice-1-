import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CartWriter {
	public static void main(String[] args) {
		ArrayList<Item> cart = new ArrayList<>();
		
		Item item1 = new Item(1,"ノートPC" , 1);
		cart.add(item1);
		
		Item item2 = new Item(2,"マウス" , 1);
		cart.add(item2);
		Item item3 = new Item(3,"キーボード" , 1);
		cart.add(item3);
		Item item4 = new Item(4,"USBメモリ" , 1);
		cart.add(item4);
		
		
		String filename = "cart.dat";
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cart.dat"))){
			oos.writeObject(cart);
			
		}catch(IOException e) {
			System.out.println("エラー" + e.getMessage());
		}
		
	}

}
