import java.util.Arrays;

public class A_7 {
    public static void main(String[] args) {
        String[] words = {
            "dog", "apple", "cat", "banana", "ant"
        };

        Arrays.sort(words, (a, b) -> {
            int result = Integer.compare(
                a.length(), b.length()
            );

            if (result != 0) {//-1 、 1の時は変更せずにそのまま入れる
                return result;
            }

            return a.compareTo(b);//同じときは辞書の順番に依存するからこれを返す
        });

        System.out.println(Arrays.toString(words));
    }
}