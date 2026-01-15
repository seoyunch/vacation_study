public class WeirdString {
    public static void main(String args[]){
        String s = "A biaslkdf  fd gk";
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                if(j % 2 == 0){
                    result.append(Character.toUpperCase(words[i].charAt(j)));
                }else{
                    result.append(Character.toLowerCase(words[i].charAt(j)));
                }
            }
            if(i != words.length-1){
                result.append(' ');
            }
        }
        System.out.println("'" + result + "'");
        
    }
    
}
