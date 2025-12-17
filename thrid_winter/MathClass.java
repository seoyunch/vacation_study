import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        boolean is_match = false;

        for(int x=-999; x<=999; x++){
            for(int y=-999; y<=999; y++){
                if(a*x + b*y == c && d*x + e*y == f){
                    is_match = true;
                    System.out.println(x+" "+y);
                    break;
                }
            }
            if(is_match == true)
                break;
        }
        sc.close();
    }
}