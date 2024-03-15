package Beginner1000;

import java.util.ArrayList;
import java.util.Scanner;

public class Rudolfand121 {
    public static boolean f(ArrayList<Integer> left) {
        int k = left.size();
        for (int i = 1; i < k - 2; i++) {
            if (left.get(i) < 0 || left.get(i - 1) < 0 || left.get(i + 1) < 0) {
                return false;
            }
            if (left.get(i - 1) != 0) {
                int l = left.get(i - 1);
                left.set(i - 1, 0);
                left.set(i, left.get(i) - 2 * l);
                left.set(i + 1, left.get(i + 1) - l);
                if ((left.get(i) <= 0 || left.get(i + 1) <= 0) && left.get(i - 1) != 0) {
                    return false;
                }
            }
        }
        if (left.get(k - 1).equals(left.get(k - 3)) && left.get(k - 2) == 2 * left.get(k - 1))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0) {
            int k = scanner.nextInt();
            ArrayList<Integer> left = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                left.add(scanner.nextInt());
            }

            if (!f(left))
                System.out.println("NO");
            else
                System.out.println("YES");
        }
        scanner.close();
    }
}