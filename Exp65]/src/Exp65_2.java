
public class Exp65_2 {
	public static void main(String[] args) {
		
		Integer i = 30;
		Double objDouble = Double.valueOf(i.intValue());
		System.out.println("objDouble" + objDouble);
		
		Double k = 12.0;
		Integer obj = Integer.valueOf((int) k.doubleValue());
		
		Double j = 12.0;
		Byte obj2 = Byte.valueOf((byte)j.doubleValue());
		
	}

}
