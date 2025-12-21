import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Croatia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        List<String> croatia = new ArrayList<>();
        croatia.add("c=");
        croatia.add("c-");
        croatia.add("dz=");
        croatia.add("d-");
        croatia.add("lj");
        croatia.add("nj");
        croatia.add("s=");
        croatia.add("z=");

        for(int i=0; i<croatia.size(); i++){
            String replace = croatia.get(i);
            word = word.replaceAll(replace, "?");
        }

        System.out.println(word.length());
        sc.close();
    }
}
