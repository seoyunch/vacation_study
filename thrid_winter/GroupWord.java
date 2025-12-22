import java.util.Scanner;

public class GroupWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        int count = 0;

        for(int i=0; i<N; i++){
            String line = sc.nextLine();
            Boolean is_Group = false;
            if(line.length() < 3){
                count += 1;
                continue;
            }
            for(int j=0; j<line.length()-2; j++){
                if(line.charAt(j) == line.charAt(j+1)){
                    is_Group = true;
                }else{
                    if(line.substring(j+2, line.length()).contains(line.substring(j, j+1))){
                        is_Group = false;
                        break;
                    }else{
                        is_Group = true;
                    }
                }
            }
            if(is_Group == true){
                count += 1;
            }
        }
        sc.close();
        System.out.println(count);
    }
}
