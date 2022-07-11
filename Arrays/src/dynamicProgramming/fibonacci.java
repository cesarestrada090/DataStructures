package dynamicProgramming;

public class fibonacci {
    public static void main(String[] args) {
        int n = 4;
        // 1 1 2 3 5 8
        int result [] = new int[n+1];

        result[0] = 1;
        result[1] = 1;

        for(int i = 2 ; i <= n; i++){
            result[i] = result[i-1] + result[i-2];
        }

        System.out.println(result[n]);

    }
}
