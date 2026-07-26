import java.util.HashSet;
import java.util.TreeSet;

public class Exp700_2 {
	public static void main(String[] args) {

		// 配列 Array
		String[] fruits = {
				"りんご",
				"バナナ",
				"みかん",
				"りんご",
				"ぶどう",
				"バナナ",
				"もも",
				"みかん",
				"なし"
		};

		System.out.println("=== 配列の中身 ===");

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(i + "番目: " + fruits[i]);
		}

		System.out.println();

		// HashSet
		// 重複をなくす。ただし順番はバラバラになることがある
		HashSet<String> hashSet = new HashSet<>();

		for (int i = 0; i < fruits.length; i++) {
			hashSet.add(fruits[i]);
		}

		System.out.println("=== HashSetの中身 ===");

		for (String fruit : hashSet) {
			System.out.println(fruit);
		}

		System.out.println();

		// TreeSet
		// 重複をなくして、さらに自動で並び替える
		TreeSet<String> treeSet = new TreeSet<>();

		for (int i = 0; i < fruits.length; i++) {
			treeSet.add(fruits[i]);
		}

		System.out.println("=== TreeSetの中身 ===");

		for (String fruit : treeSet) {
			System.out.println(fruit);
		}

		System.out.println();

		// HashSetに入っているか確認
		System.out.println("=== データがあるか確認 ===");

		if (hashSet.contains("りんご")) {
			System.out.println("HashSetの中に りんご があります。");
		} else {
			System.out.println("HashSetの中に りんご はありません。");
		}

		if (hashSet.contains("メロン")) {
			System.out.println("HashSetの中に メロン があります。");
		} else {
			System.out.println("HashSetの中に メロン はありません。");
		}

		System.out.println();

		// TreeSetの最初と最後
		System.out.println("=== TreeSetの最初と最後 ===");

		System.out.println("最初: " + treeSet.first());
		System.out.println("最後: " + treeSet.last());

		System.out.println();

		// 要素数を表示
		System.out.println("=== 要素数 ===");

		System.out.println("配列の要素数: " + fruits.length);
		System.out.println("HashSetの要素数: " + hashSet.size());
		System.out.println("TreeSetの要素数: " + treeSet.size());

		System.out.println();

		// 削除
		System.out.println("=== バナナを削除 ===");

		hashSet.remove("バナナ");
		treeSet.remove("バナナ");

		System.out.println("HashSetからバナナを削除しました。");
		System.out.println("TreeSetからバナナを削除しました。");

		System.out.println();

		System.out.println("=== 削除後のHashSet ===");

		for (String fruit : hashSet) {
			System.out.println(fruit);
		}

		System.out.println();

		System.out.println("=== 削除後のTreeSet ===");

		for (String fruit : treeSet) {
			System.out.println(fruit);
		}

		System.out.println();

		System.out.println("プログラム終了");
	}
}