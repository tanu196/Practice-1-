import java.util.ArrayList;

public class ScoreCalculator<T> {
	public double getAverage(ArrayList<T> scores) {
		double total = 0.0;
		for(T score : scores) {
//			total += scores.doubleValue();
		}
		return total/scores.size();
		
	}
	
	
	
}
