public class StringZip {
    public static void main(String[] args) {
        String s = "aabbaccc";
        int answer = s.length();
        StringBuilder result = new StringBuilder();
        for(int i=1; i<s.length(); i++){
            String word = "";
            int count = 1;
            for(int j=0; j<s.length(); j+=i){
                String sub = "";
                if(j+i > s.length()){
                    sub = s.substring(j, s.length());
                }else{
                    sub = s.substring(j, j+i);
                }

                if(word.equals(sub)){
                    count++;
                }else{
                    if(count==1){
                        result.append(word);
                    }else{
                        result.append(count);
                        result.append(word);
                        count = 1;
                    }
                    word = sub;
                }
                if(j+i >= s.length()){//이런 예외케이스 처리 꼼꼼하게 해주기
                    if(count > 1){
                        result.append(count);
                    }
                    result.append(word);
                }
            }
            if(result.length() < answer){
                answer = result.length();
            }
            System.out.println(result);
            result.delete(0, result.length());
        }
        System.out.println(answer);
    }
}
