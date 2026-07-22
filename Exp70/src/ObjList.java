import java.util.ArrayList;
public class ObjList {
	public static void main(String[] args) {
		Ingredient recipe1 = new Ingredient();
		recipe1.setIngredient("砂糖", 100);
		
		Ingredient recipe2 = new Ingredient();
		recipe2.setIngredient("無塩バター", 50);
		
		ArrayList<Ingredient> recipeList = new ArrayList<>();	
		recipeList.add(recipe1);
		recipeList.add(recipe2);
		
		Ingredient recipe3 = new Ingredient("牛乳" , 150);
		Ingredient recipe4 = new Ingredient("はちみつ" , 30);
		recipeList.add(recipe3);
		recipeList.add(recipe4);
		
		recipeList.add(new Ingredient("牛乳" , 5000));   //コンストラクタで代入してからリストに加える
		
		
		
		System.out.println(recipeList);
	}

}
