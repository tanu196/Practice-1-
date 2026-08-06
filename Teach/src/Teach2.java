public class Teach2 {
	
//	public void Ara(int num) {	
//		System.out.println("わからない");
//		System.out.println(num);
//	}
//	
//	public void Ara (int num , int num2) {
//		System.out.println("わからない");
//		System.out.println(num + num2);
//	}
//	
//	public void Ara (int num , int num2 , int num3) {
//		System.out.println("わからない");
//		System.out.println(num + num2 + num3);
//	}
	
	int sum;
	public void Ara(int ...num) {
		for(int n : num) {
			sum += n;
			System.out.println("合計" + sum);
		}
	}
	
	public void Ara(String num2 , int ...num) {
		for(int n : num) {
			sum += n;
			System.out.println(num2 + sum);
		}
	}
}
