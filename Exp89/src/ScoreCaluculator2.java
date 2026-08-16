import java.util.ArrayList;

public class ScoreCaluculator2<T extends Number> {
	public double getAverage(ArrayList<T> scores) {
		double total = 0.0;
		for (T score : scores) {
			total += score.doubleValue();
		}
		return total / scores.size();
	}
}
