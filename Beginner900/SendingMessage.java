// package Beginner900;

// import java.util.Scanner;

// public class SendingMessage {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = 1;
//         t = sc.nextInt();
//         while (t-- > 0) {
//             int n = sc.nextInt(); // no of msg
//             long f = sc.nextLong(); // inital charging
//             long a = sc.nextLong(); // charge consumption per unit of time
//             long b = sc.nextLong(); // consumption when turned off
//             long[] v = new long[n];

//             for (int i = 0; i < n; i++) {
//                 v[i] = sc.nextInt();
//             }
//             long last = 0;
//             for (int i = 0; i < n; i++) {
//                 long keepOn = 1L * a * (v[i] - last);
//                 long turnOffAndOn = b;
//                 long req = Math.min(keepOn, turnOffAndOn);
//                 f -= req;
//                 last = v[i];
//                 if (f <= 0) {
//                     System.out.println("NO");
//                     // return;
//                 } else {
//                     System.out.println("YES");
//                 }
//             }
//         }
//     }

// }

package Beginner900;

import java.util.Scanner;
import java.util.Vector;

/**
 * SendingMessage
 */
public class SendingMessage {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        int f = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        Vector<Integer> v = new Vector<>(n);
        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());
        }
        int last = 0;
        for (int i = 0; i < n; i++) {
            long keepOn = 1L * a * (v.get(i) - last);
            long turnOffAndOn = 0;
            long required = Math.min(keepOn, turnOffAndOn);

            f -= required;
            last = v.get(i);
            if (f <= 0) {
                System.out.println("NO");
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
}