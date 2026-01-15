public class Cryptogram{
    public static void main(String args[]){
        String s = "a bz";
        int n = 3;
        char[] words = s.toCharArray();
        StringBuilder result = new StringBuilder();
        
    for(int i = 0; i<s.length(); i++){
            Boolean is_changed = false;
            Character word = words[i];
            if(Character.isUpperCase(word)){
                is_changed = true;
            }
            if(word == ' '){
                result.append(' ');
                continue;
            }
            char alpha = Character.toLowerCase(word);
            int number = (int)alpha + n;
            if(number > 122){
                number -= 26;
            }
            if(is_changed == true){
                result.append(Character.toUpperCase((char)number));
            }else{
                result.append((char)number);
            }
        }
        System.out.println(result);
    }
}