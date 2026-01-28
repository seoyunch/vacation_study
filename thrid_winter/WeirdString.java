public class WeirdString {
    public static void main(String args[]){
        String s = "try hello world";
        String[] words = s.split("(?<= )|(?= )");
        // 안에 조건식은 앞에서부터 공백 바로 뒤 또는 공백 바로 앞에서 자른다
        // 공백하나하나 있는거까지 버리지 않고 사용하기 위해서 쓰는 식
        StringBuilder result = new StringBuilder();


        for(int i=0; i<words.length; i++){
            System.out.println("'" + words[i]+ "'");
            if(words[i].equals(" ")){
                result.append(' ');
                continue;
            }
            for(int j=0; j<words[i].length(); j++){
                if(j % 2 == 0){
                    result.append(Character.toUpperCase(words[i].charAt(j)));
                }else{
                    result.append(Character.toLowerCase(words[i].charAt(j)));
                }
            }
        }
        System.out.println("'" + result + "'");
        
    }
    
}
