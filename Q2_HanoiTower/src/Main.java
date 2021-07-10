import java.util.Scanner;
public class Main {

	static StringBuilder builder = new StringBuilder();
	static int count = 0;

	public static void hanoi(int n, int start, int goal, int temp) {
		if (n == 0) {
			return;
		} else {
			count++;
			hanoi(n - 1, start, temp, goal);
			builder.append(start + " " + goal + "\n");
			hanoi(n - 1, temp, goal, start);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		hanoi(n, 1, 3, 2);

		System.out.println(count);
		System.out.println(builder);

        scanner.close();
	}

}