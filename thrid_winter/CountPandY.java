public class CountPandY {
    public static void main(String[] args) {
        String s = "pPoooYy";
        boolean answer = true;
        s = s.toLowerCase();
        int count_p = 0;
        int count_y = 0;
        
        for(int i=0; i<s.length(); i++){
            if(String.valueOf(s.charAt(i)).equals("y")){
                count_y++;
            }else if(String.valueOf(s.charAt(i)).equals("P")){
                count_p++;
            }
        }
        System.out.println(count_p);
        System.out.println(count_y);
        if(count_p != count_y){
            answer = false;
        }

        System.out.println(answer);
    }
}
