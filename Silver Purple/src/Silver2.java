public class Silver2 {
	public static void main(String[] args) {
		String s1 = "Java Language";
		
		String s2 = s1.replace("Language" , "VM");
		
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		
		System.out.println(s1.substring(0,5));
		System.out.println(s1.indexOf("a"));
		
		
		String t1 = """
				Language: %s
				Version : %d 
				""".formatted("Java" , 15);
		System.out.println(t1);
		
		String t2 = "     Duke     \n  James";
		
		System.out.println(t2);
		System.out.println("---------");
		System.out.println(t2.stripIndent());
		
		String s3 = "Hello\\n\\tworld";
		
		System.out.println(s3);
		System.out.println("-----------");
		System.out.println(s3.translateEscapes());
		
		
		
		
		
	}
}
