import java.io.*;

public class Main {
    private static int N, R, C, count;
    private static int[] aroundX = {0, 1, 0, 1}, aroundY = {0, 0, 1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input[] = reader.readLine().split(" ");
        N = (int)Math.pow(2, Integer.parseInt(input[0])); 
        R = Integer.parseInt(input[1]);
        C = Integer.parseInt(input[2]);
        
        Z(N, 0, 0);
    }
    private static void Z(int n, int r, int c) {
        if(n == 2) {
            for (int i = 0; i < 4; i++) {
                int ay = r+aroundY[i];
                int ax = c+aroundX[i];
                if (ay==R && ax==C) { // find result
                    System.out.println(count); 
                    System.exit(0); // exit main
                }
                count++;
            }
            return;
        }
        
        Z(n/2, r, c); // upper left
        Z(n/2, r, c+n/2); // upper right
        Z(n/2, r+n/2, c);  // bottom left
        Z(n/2, r+n/2, c+n/2); // bottom right
    }
}