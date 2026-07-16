public class Pet {
	private String name;
	private int energy;
	private int hunger;
	private int mood;
	private int foodCost;
	private static int ownerMoney = 1000;

	public Pet(String name) {
		this.name = name;
		energy = 60;
		hunger = 60;
		mood = 60;
		foodCost = 120;
	}

	public static int getOwnerMoney() {
		return ownerMoney;
	}

	public void selfIntoro() {
		System.out.println("僕の名前は" + name + "だよ");
	}

	public void feed() {
		hunger += 25;
		energy -= 10;
	}

	public void play() {
		mood += 15;
		energy -= 10;
	}

	public void rest() {
		energy += 30;
	}

	public void work() {
		ownerMoney += 200;
		energy -= 30;
	}

	public void observeNormal() {
		System.out.println("A____A"); //① 
		System.out.println("|・ㅅ・|");
		System.out.println("|っ c|");
		System.out.println("| |");
		System.out.println("U￣￣U");
		System.out.println("【観察結果】"); //② 

		System.out.println("元気：" + energy + "満腹度" + hunger + "機嫌：" + mood);
	}

	public void observeSleep() {
		String art = " ";
		art = """
				／￣￣＼
				（ ；・ω・）…ねむい
				|| っ c
				||
				￣Ｕ￣Ｕ
				""";

		System.out.println(art);
		System.out.println("【観察結果】"); //② 

		System.out.println("元気：" + energy + "満腹度" + hunger + "機嫌：" + mood);

	}

	public void observeHungry() {
		String art = "";
		art = """
				A____A
				|｀ㅅ´| ぐぅ…
				|っ c|
				| |
				U￣￣U
				""";
		System.out.println(art);
		System.out.println("【観察結果】"); //② 

		System.out.println("元気：" + energy + "満腹度" + hunger + "機嫌：" + mood);

	}

	public void observeEnergy() {
		String art = "";
		art = """
				A____A
				|・ㅅ・| にゃっ♪
				|っ c|
				| ^ |
				  U￣￣U
				  """;
		System.out.println(art);
		System.out.println("【観察結果】"); //② 

		System.out.println("元気：" + energy + "満腹度" + hunger + "機嫌：" + mood);

	}

	private void checkGameOver() {
		if (energy <= 0) {
			System.out.println("ゲームオーバー");
		}
	}
}
