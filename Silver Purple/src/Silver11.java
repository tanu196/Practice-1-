class Man extends Woman{
}
class Woman{
	
}

public class Silver11 {
	public static void main(String[] args) {
		Object obj = new Object();
		Man obj2 = new Man();
		if(!(obj2 instanceof Object s)) {
//			System.out.println(s);
		}else {
			System.out.println(s);
			System.out.println("失敗");
		}
		
		if(!(obj2 instanceof Object s)) {
//			System.out.println(s);
		}else if (!(obj2 instanceof  Woman n)){
			System.out.println(s);
			System.out.println("失敗");
		}else {
			System.out.println(n);
			
		}
		boolean n = false;
		if(!(obj2 instanceof Object s)) {
//			System.out.println(s);
		}else if (n){
			System.out.println(s);
			System.out.println("失敗");
		}else {
			
		}
		
		
		if (obj2 instanceof Object s) {}
		
		
		
		
		
		
		
		
	}
}
