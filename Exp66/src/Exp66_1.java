import java.util.ArrayList;
import java.util.Arrays;
public class Exp66_1 {
	public static void main(String[] args) {
		ArrayList<String> recipe = new ArrayList<>();
		recipe.add("sugar");
		recipe.add("butter");
		recipe.add("fresh cream");
		recipe.add("water");
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(123);
		
		System.out.println(recipe);
		System.out.println(num);
		
		ArrayList<String> recipe2 = new ArrayList<>(Arrays.asList("suger" , "butter"));		
		recipe2.add(2, "aiuu");
		System.out.println(recipe2);
		
		recipe.add(2 , "num");
		System.out.println(recipe);
		recipe.remove(3);
		System.out.println(recipe);
		recipe.remove("sugar");
		System.out.println(recipe);
		recipe2.set(0, "sugerCream");
		System.out.println(recipe2);
		System.out.println(recipe.size());
		System.out.println(recipe2.size());
		System.out.println(recipe2.get(0));
	}

}
