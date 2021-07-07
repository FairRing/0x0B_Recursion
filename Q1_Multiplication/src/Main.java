import java.io.*;

// 문제 풀이 참조 : https://onsil-thegreenhouse.github.io/programming/problem/2018/03/29/problem_math_power/

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input[] = reader.readLine().split(" ");
        long a = Integer.parseInt(input[0]);
		long b = Integer.parseInt(input[1]);
		long c = Integer.parseInt(input[2]);

        System.out.println(power(a % c, b, c));
    }

    public static long power(long a, long b, long c) {
        
        if(b == 0) return 1; // b == 0
        if(b == 1) return a; // b == 1 
                
        long temp = power(a, b/2, c) % c;
        
        if(b % 2 == 0) return (temp * temp) % c; // b == 짝수
        else return (((temp * temp) % c) * a) % c; //  b == 홀수
    }
}