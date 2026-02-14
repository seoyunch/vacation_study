public class NewId {
    public static void main(String[] args) {
        String new_id = "abcdefghijklmn.p";
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
        //4단계
        boolean end_is_point = true;
        while(end_is_point == true){
            if(id.length() == 0){
                id.append("a"); // 5단계
                break;
            }
            if(String.valueOf(id.charAt(0)).equals(".")){
                id.deleteCharAt(0);
                continue;
            }else{
                if(String.valueOf(id.charAt(id.length()-1)).equals(".")){
                    id.deleteCharAt(id.length()-1);
                    continue;
                }else{
                    end_is_point = false;
                    break;
                }
            }
        }
        // 6단계
        if(id.length() > 15){
            id.delete(15, id.length());
        }
        if(String.valueOf(id.charAt(id.length()-1)).equals(".")){
            id.deleteCharAt(id.length()-1);
        }

        while(id.length() < 3){
            id.append(String.valueOf(id.charAt(id.length()-1)));
        }
        System.out.println(id);
    }
}
