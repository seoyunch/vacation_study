import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result=0;
        int N = sc.nextInt();
        
        for(int i=N; i>=0; i--){
            int sum = i;
            String Nstr = Integer.toString(i);
            for(int j=0; j<Nstr.length(); j++){
                sum += Nstr.charAt(j) - '0';
            }
            if(sum == N){
                result = i;
            }
        }
        System.out.println(result);
        sc.close();
    }
}