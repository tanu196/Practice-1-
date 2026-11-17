import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        //ここからコードを書く
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        int cal = sc.nextInt();
        
        String[][] allMap = new String[line][cal];
        
        
        
        
        for(int i = 0 ; i < allMap.length ; i++) {
        	for(int j = 0 ; i < allMap[i].length ; j++) {
        		allMap[i][j] = sc.next();
        	}
        }
        
        for(int i = 0 ; i < allMap.length ; i++) {
        	for(int j = 0 ; j < allMap[i].length ; j++) {
        		System.out.println(allMap[i][j]);
        	}
        }
        
        System.out.println("ファイルの読み込み終了しました。");
        
        HashMap<Character , Character> hashMap = new HashMap<>();
        
        hashMap.put('A', 'a');
        hashMap.put('B', 'b');
        hashMap.put('C', 'c');
        hashMap.put('D', 'd');
        hashMap.put('E', 'e');
        hashMap.put('F', 'f');
        
        System.out.println(hashMap);
    }
}