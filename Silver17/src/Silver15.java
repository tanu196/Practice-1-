import java.util.HashMap;
import java.util.Map;
public class Silver15 {
	public static void main(String[] args) {
		Map<String , Integer> scores = new HashMap<>();
		scores.put("Kevin", 12);
		System.out.println(scores.put("Aline", 80));//putは上書きすることができるそしてこのメソッドは入れる前の確認して同じキーがなかったらnullを返すあったら古い値を返す
		scores.put("James", 99);
		scores.put("Name", 53);
		System.out.println(scores.size());
		
		Integer oldScore = scores.put("Aline", 85);
		System.out.println(oldScore);
		System.out.println(scores.get("Aline"));
		
		System.out.println(scores.get("James"));//基本的にない時はnullを返す
	}
}