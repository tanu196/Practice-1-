import java.util.Arrays;
import java.util.List;
public class Silver13 {
	public static void main(String[] args) {
		String[] str = {"O" , "P" , "Q"};
		List<String> list1 = Arrays.asList(str);
		List<Integer> list2 = Arrays.asList(8 , 11 , 7 );
		
		System.out.println(Arrays.toString(str));
		str[1] = "Piano";
		System.out.println(Arrays.toString(str));
		list1.set(0 , "Orange");
		System.out.println(list1);
		
		
	}
}
