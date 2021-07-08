import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int N, K;
    static Stack<Integer> t1, t2, t3;
    static ArrayList<int[]> history = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = 0;
        t1 = new Stack<>();
        t2 = new Stack<>();
        t3 = new Stack<>();
        for (int i = N; i > 0; i--) t1.push(i);

        // 한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
        // 쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
        



        scanner.close();
    }
}
