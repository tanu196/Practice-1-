
public class Main {
	public static void main(String[] args) {
		int score = 50;
		Student taro = new Student();
		taro.name = "太郎";
		
		Teacher teacher = new Teacher();
		
		System.out.println("呼び出し元のscore：" + score);
		teacher.chageScore(score);
		System.out.println("呼び出し元のscore" + score);
		
		System.out.println("ーーーーーーーーー");
		
		System.out.println("呼び出し元のname" + taro.name);
		teacher.rename(taro);
		System.out.println("呼び出し元のname：" + taro.name);
	}

}
