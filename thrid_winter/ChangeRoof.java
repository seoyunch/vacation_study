public class ChangeRoof {
    public static void main(String[] args) {
        String s = "1111111";
        int[] answer = new int[2]; // 처음에 크기 지정 안하고 나중에 변수 넣으면 boundery에러남
        int zero_removed = 0;
        int change_count = 0;
        StringBuilder changed = new StringBuilder(s);
        while(changed.length()>1){
            int count = 0;
            change_count++;
            for(int i=0; i<changed.length(); i++){
                if(String.valueOf(changed.charAt(i)).equals("1")){
                    count++;
                }else{
                    zero_removed++;
                }
            }
            changed.delete(0, changed.length());
            int length = count;
            while(length >= 2){
                changed.append(length%2);
                length /= 2;
            }
            changed.append(length);
            changed.reverse();

            answer[0] = change_count;
            answer[1] = zero_removed;

            System.out.println(answer);
        }
        
    }
}
