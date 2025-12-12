import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();

        List<Integer> cards = new ArrayList<>();
        for(String s : line.split(" ")){
            cards.add(Integer.parseInt(s));
        }

        int sum = 0;
        int max = 0;

        for(int i=0; i<N-2; i++){
            for(int j = i+1; j<N-1; j++){
                for(int k= j+1; k<N; k++){
                    if(max == M){
                        break;
                    }
                    if(max < M){
                        sum = cards.get(i) + cards.get(j) + cards.get(k);
                        if(sum > M || sum < max){
                            continue;
                        }
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}
