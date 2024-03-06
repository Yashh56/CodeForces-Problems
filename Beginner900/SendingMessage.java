package Beginner900;

import java.util.Scanner;

public class SendingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no of msg
        int f = sc.nextInt(); // inital charging
        int a = sc.nextInt(); // charge consumption per unit of time
        int b = sc.nextInt(); // consumption when turned off
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        int last = 0;
        for (int i = 0; i < n; i++) {
            long keepOn = 1L * a * (v[i] - last);
            long turnOffAndOn = b;
            long req = Math.min(keepOn, turnOffAndOn);
            f -= req;
            last = v[i];
            if (f <= 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
