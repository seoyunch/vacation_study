public class NewId {
    public static void main(String[] args) {
        String new_id = "..123aaa~...deF.";
        StringBuilder id = new StringBuilder(new_id.toLowerCase());//1단계
        int index = 0;
        while (index < id.length()) {//2단계
            char word = id.charAt(index);
            if((word >= 'A' && word <= 'Z') || (word >= 'a' && word <= 'z') || (word >= '0' && word <= '9')){
                index++;
            }else{
                if(String.valueOf(word).equals(".") || String.valueOf(word).equals("-") || String.valueOf(word).equals("_")){
                    index++;
                }else{
                    System.out.println(word);
                    id.deleteCharAt(index);
                }
            }
        }
        index = 0;
        while(index < id.length()-2){// 3단계
            String sub = id.substring(index, index+2);
            if(sub.equals("..")){
                id.replace(index, index+2, ".");
            }else{
                index++;
            }
        }
        while(String.valueOf(id.charAt(0)).equals(".") || String.valueOf(id.charAt(id.length()-1)).equals(".")){
            if(String.valueOf(id.charAt(0)).equals(".")){
                id.deleteCharAt(0);
            }else if(String.valueOf(id.charAt(id.length()-1)).equals(".")){
                id.deleteCharAt(id.length()-1);
            }
        }
        System.out.println(id);
    }
}
