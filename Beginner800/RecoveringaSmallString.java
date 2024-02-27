import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RecoveringaSmallString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, List<String>> hMap = new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {
                for (char ch2 = 'a'; ch2 <= 'z'; ch2++) {
                    int curr = (ch - 'a') + (ch1 - 'a') + (ch2 - 'a') + 3;
                    String ans = "" + ch + ch1 + ch2;
                    hMap.computeIfAbsent(curr, k -> new ArrayList<>()).add(ans);
                }
            }
        }
        Collections.sort(hMap.get(n));
        System.out.println(hMap.get(n).get(0) + '\n');
    }
}
