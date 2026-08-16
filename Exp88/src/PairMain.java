
public class PairMain {
	public static void main(String[] args) {
		
		
		

	}
	
	
	
	public static<K ,V>boolean arePairsEqual(Pair<K,V>pair1 , Pair<K,V>pair2){
		boolean keysEqual;
		
		if(pair1.getKey() == null && pair2.getKey() == null) {
			keysEqual = true;
		}else if(pair1.getKey() == null || pair2.getKey() == null) {
			keysEqual = false;
		}else {
			keysEqual = pair1.getKey().equals(pair2.getKey());
		}
		
		boolean valueEqual;
		if(pair1.getValue() == null && pair2.getValue() == null) {
			valueEqual = true;
		}else if(pair1.getValue() == null || pair2.getValue() == null) {
			valueEqual = false;
		}else {
			valueEqual = pair1.getValue().equals(pair2.getValue());
		}
		
		return keysEqual && valueEqual;
	}
	

}
