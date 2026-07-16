
public class Exp65_1 {
	public static void main(String[] args) {
		int num = 10;
		System.out.println("num：" + num);
		
		Integer obj = new Integer(10);
		System.out.println("obj:" + obj);
		
		Integer objNum = new Integer(num);
		System.out.println("objNum:" + objNum);
		
		Integer intNum1 = Integer.valueOf(15);
		System.out.println("intNum1" + intNum1);
		
		Integer intNum2 = Integer.valueOf(12);
		System.out.println("intNum2:" + intNum2);
		
		Character ch = Character.valueOf('7');
		
		int intNum3 = intNum2.intValue();
		System.out.println("intNum3" + intNum3);
		
		Integer x = 10;
		int y = x;
		
	}
}
