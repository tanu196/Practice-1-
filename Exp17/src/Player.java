public class Player {
	String name;
	int hp;
	
	
	Player(String name , int hp){
		this.name = name;
		this.hp = hp;
	}
	
	void join (Game game) {
		game.addPlayer(this);
	}
	
	void showStatus() {
		System.out.println(name + "HP:" + hp);
	}
}
