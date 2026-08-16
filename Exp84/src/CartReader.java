import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class CartReader {
	public static void main(String[] args) {
		String filename = "cart.dat";
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cart.dat"))){
			@SuppressWarnings("unchecked")
			ArrayList<Item> cart = (ArrayList<Item>)ois.readObject();
			 System.out.println("カートデータを読み込みました: " + filename); 
			 System.out.println("読み込んだ商品数: " + cart.size()); 
			 System.out.println(); 
			 System.out.println("なにか" + cart);

			 

			 // 全商品を表示 
			 System.out.println("=== カート内の商品一覧 ==="); 
			 for (int i = 0; i < cart.size(); i++) { 
			 System.out.println((i + 1) + ". " + cart.get(i)); 
			 } 

			 

			 // 合計数量を計算 
			 int totalQuantity = 0; 
			 for ( Item item : cart) { 
			 totalQuantity += item.getQuantity(); 
			 } 
			 System.out.println("\n 合計数量: " + totalQuantity + " 個");
		}catch(FileNotFoundException e) {
			System.err.println("ファイルが見つかりません");
		}catch(IOException e) {
			System.err.println("読み込みエラー");
		}catch(ClassNotFoundException e) {
			System.err.println("クラスが見つかりません");
			
		}
		
	}
}
