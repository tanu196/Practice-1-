import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exp67_1 {
	public static void main(String[] args) {
		ArrayList<String> recipe = new ArrayList<>();
		
		recipe.add("suger");
		recipe.add("butter");
		recipe.add("fresh cream");
		recipe.add("water");
		System.out.println(recipe);
		ArrayList<String> recipe2 = new ArrayList<>(Arrays.asList("suger" , "butter" , "fresh cream" , "water"));

		System.out.println(recipe2);
		recipe.add(2, "milk");
		System.out.println(recipe);
		recipe2.set(2, "milk");
		System.out.println(recipe2);
		recipe2.set(0, "granulated suger");
		System.out.println(recipe2);
		System.out.println("必要な材料は" + recipe2.size()+ "種類です");
		System.out.println("二つ目の材料は" + recipe2.get(2) + "です");
		Collections.sort(recipe);
		System.out.println(recipe);
		
		ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(100,45,35,87,95,94));
		Collections.sort(num1);
		System.out.println(num1);
		
		Collections.sort(recipe,Collections.reverseOrder());
		System.out.println(recipe);
		Collections.sort(num1,Collections.reverseOrder());
		System.out.println(num1);
		
		for(String s : recipe) {
			System.out.print(s + " ");
		}
		System.out.println();
		for(int i = 0; i < recipe.size(); i++) {
			System.out.print(recipe.get(i) + " ");
		}
	}

}
