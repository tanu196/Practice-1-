public class Ex75 {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		restaurant.order();
	}
}

class Restaurant {
	public void order() {
		try {
			Chef chef = new Chef();
			chef.cook();
			System.out.println("料理提供完了");
		} catch (Exception e) {
			System.out.println("お客様にお詫びします");
		}
	}
}


class Chef {
	public void cook() throws Exception {
		Ingredient ingredient = new Ingredient();
		ingredient.check();
		System.out.println("料理完成");
	}
}


class Ingredient {
	public void check() throws Exception {
		// 材料チェック処理 
		boolean hasIngredient = false;
		if (!hasIngredient) {
			throw new Exception("材料なし");
		}
		System.out.println("材料チェック完了");
	}
}