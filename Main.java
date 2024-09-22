import java.util.Scanner;

public class Main {

    // Function to check if S1 is a subsequence of Q
    public static boolean isSubsequence(String S1, String Q) {
        int n = S1.length(), m = Q.length();
        int j = 0; // For index of S1

        // Traverse Q and S1
        for (int i = 0; i < m && j < n; i++) {
            if (Q.charAt(i) == S1.charAt(j)) {
                j++;
            }
        }
        return (j == n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input reading
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String S1 = sc.nextLine();
        String S2 = sc.nextLine();

        int[] P = new int[M];
        for (int i = 0; i < M; i++) {
            P[i] = sc.nextInt();
        }

        // Adjust the permutation to be 0-indexed
        for (int i = 0; i < M; i++) {
            P[i]--;
        }

        // Initialize Q with '*'
        char[] Q = new char[M];
        for (int i = 0; i < M; i++) {
            Q[i] = '*';
        }

        // Simulate the process
        for (int i = 0; i < M; i++) {
            Q[P[i]] = S2.charAt(P[i]);
            // Check if S1 is a subsequence of Q
            if (isSubsequence(S1, new String(Q))) {
                System.out.println(i + 1);
                sc.close();
                return;
            }
        }

        // If no such position is found
        System.out.println(M);
        sc.close();
    }
}
