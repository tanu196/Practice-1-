import java.util.ArrayList;
public class Exp69_2 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(10);
		
		for(int i : num) {
			if(i % 3 == 0)
			num.remove(num.indexOf(i));
		}
		
		
		
		
		
		
	}

}
