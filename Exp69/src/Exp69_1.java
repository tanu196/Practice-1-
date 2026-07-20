import java.util.ArrayList;
import java.util.Scanner;
public class Exp69_1 {
	public static void main(String[] args) {
		ArrayList<String> listName = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		listName.add("佐藤");
		listName.add("鈴木");
		listName.add("高橋");
		listName.add("田中");
		listName.add("新野");
		listName.add("池田");
		listName.add("池田");
		System.out.println(listName);
		System.out.println("検索したい名前を検索してください");
		String name = sc.nextLine();
//		boolean isFlag = false;
//		
//		for(int i = 0 ; i < listName.size(); i++) {
//			if(listName.get(i).equals(name)) {
//				isFlag = true;
//			}
//		}
//		
//		
//		if(isFlag) {
//			System.out.println("見つかった");
//		}else {
//			System.out.println("そんな人いないです");
//		}
		
		int index = listName.indexOf(name);
		
		if(index > 0) {
			System.out.println(index + "番に保存されています");
		}else {
			System.out.println("リストには含まれていませんでした");
		}
		
//		if(listName.contains(name)) {
//			System.out.println("います");
//		}else {
//			System.out.println("いない");
//		}
		
		
		int indexLast = listName.lastIndexOf(name);
		
		if(indexLast > 0){
			System.out.println(indexLast + "番に保存されています");
		}else {
			System.out.println("リストには含まれていませんでした");
		}
		
	}

}
