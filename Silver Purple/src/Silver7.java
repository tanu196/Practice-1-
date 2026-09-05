record Item(int id , String name) {}

class Silver7 {
	public static void main(String[] args) {
		Item item1 = new Item(100 , "T-shirts");
		Item item2 = new Item(100 , "からあげ");
		System.out.println(item1.id());
		System.out.println(item1.name());
		System.out.println(item1.equals(item2));
		
		System.out.println(item1.hashCode());
		System.out.println(item1.toString());
		System.out.println(item2.toString());
		
	}
}
