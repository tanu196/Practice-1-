public class Silver13 {
	public static void main(String[] args) {
		System.out.print("明日\rこれ\nから");
		
		System.out.println();
		String num = """
				Language:%s
				Score:%d
				""".formatted("韓国語" , 75);
		
		System.out.println(num);
		
		
		
		String line = "   dff df fefef ffe fef ef ef e ef ef\n      ef ";
		
		System.out.println(line.stripIndent());
		
		
		String line2 = "明日\\nkore\\rdfafdfgsdgds";
		
		System.out.println(line2.translateEscapes());
		
	}
}
