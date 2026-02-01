public class TripleReverse {
    public static void main(String[] args) {
        int n = 3;
        int answer = 0;
        StringBuilder reverse = new StringBuilder();
        while(n>=3){
            reverse.append(n%3);
            n /= 3;
        }
        reverse.append(n);
        reverse.reverse();
        for(int i=0; i<reverse.length(); i++){
            answer += Integer.parseInt(String.valueOf(reverse.charAt(i)))*Math.pow(3, i);
        }
        System.out.println(answer);
    }
}
