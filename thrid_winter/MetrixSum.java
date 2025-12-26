import java.util.Scanner;

public class MetrixSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] metrix1 = new int[N][M];
        int[][] metrix2 = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                metrix1[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                metrix2[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.printf("%d ", metrix1[i][j] + metrix2[i][j]);
            }
            if(i==N-1){
                continue;
            }
            System.out.println("");
        }
        sc.close();
    }
}
