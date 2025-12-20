import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class WordStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();

        String UpperCase = message.toUpperCase();
        Map<Character, Integer> alpha = new HashMap<>();
        for(int i=0; i<message.length(); i++){
            Character word = UpperCase.charAt(i);
            if(alpha.containsKey(word)){
                alpha.put(word, alpha.get(word) + 1);
            }else{
                alpha.put(word, 1);
            }
        }
        int max = 0;
        Character maxKey = null;
        boolean overlap = false;
        
        for(Map.Entry<Character, Integer> e : alpha.entrySet()){
            if(e.getValue()>max){
                overlap = false;
                max = e.getValue();
                maxKey = e.getKey();
            }
            else if(e.getValue() == max){
                overlap = true;
            }
        }
        if(overlap == true){
            System.out.println("?");
        }else{
            System.out.println(maxKey);
        }
        sc.close();
    }
}
