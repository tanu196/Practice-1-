import java.util.ArrayList;
public class Exp67_3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0 ; i <= 10 ; i++) {
			list.add(i);//オートボクシング
		}
		
		System.out.println(list);
		
		for(int i : list) {//オートアンボクシング
			System.out.println(i + " ");
		}
		
	}

}
