public class StringBasic {
    public static void main(String[] args) {
        boolean answer = true;
        String s = "1234";
        if(s.length() != 4 && s.length() != 6){
            answer = false;
            System.out.println(answer);
            System.exit(0);
        }
        for(int i=0; i<s.length(); i++){
            int word = s.charAt(i) - '0';
            if(word < 0 || word > 9){
                answer = false;
                break;
            }
        }
        System.out.println(answer);
    }
}