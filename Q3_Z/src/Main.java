import java.io.*;

public class Main {
    static int N, R, C, count;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input[] = reader.readLine().split(" ");
        N = Integer.parseInt(input[0]); 
        R = Integer.parseInt(input[1]);
        C = Integer.parseInt(input[2]);

        Z((int) Math.pow(2, N), 0, 0);
    }

    static void Z(int n, int r, int c) {
        if (r==R && c==C) {
            System.out.println(count);
            System.exit(0);
        }

        if (r<=R && R<(r+n) && c<=C && C<(c+n)) {
            int n2 = n / 2;
            Z(n2, r, c);
            Z(n2, r, c+n2);
            Z(n2, r + n2, c);
            Z(n2, r + n2, c+n2);
        } else {
            count += n*n;
        }
    }
}