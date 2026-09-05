public class Silver6 {
	public static void main(String[] args) {
		String s = "A";
		
		switch(s){
			case "A" -> System.out.println("A");
		}
		
		
		int month = 2;
		
		String val = switch(month) {
		case 12 ,2 -> "Winter";
		default -> "nani";
		};
		
		
		
	}
}
