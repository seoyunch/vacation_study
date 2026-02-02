public class IntegerString {
    public static void main(String[] args) {
        String s = "one4seveneight";
        StringBuilder str = new StringBuilder(s);
        StringBuilder numbers = new StringBuilder();
        String[] words = new String[10];
        words[0] = "zero";
        words[1] = "one";
        words[2] = "two";
        words[3] = "three";
        words[4] = "four";
        words[5] = "five";
        words[6] = "six";
        words[7] = "seven";
        words[8] = "eight";
        words[9] = "nine";

        while (!str.toString().isEmpty()) {// StringBuilder로 했을때 String 메서드 사용하는거 주의하기
            char word = str.charAt(0);
            String sub;

            if(String.valueOf("0123456789").contains(String.valueOf(word))){
                numbers.append(word);
                str.deleteCharAt(0);
                continue;
            }
            if(str.length() > 5){
                sub = str.substring(0, 5);
            }else{
                sub = str.substring(0, str.length());
            }
            for(int i=0; i<10; i++){
                if(sub.contains(words[i])){
                    numbers.append(i);
                    str.delete(0, words[i].length());
                    break;
                }
            }
        }
        Integer.parseInt(numbers.toString());
        System.out.println(numbers);
    }
}
