package ch4.pb6;

public class programmers_min_12926 {
    public static void main(String[] args) {
        String s = "a B z";
        solution(s, 4);
    }

    public static String solution(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == ' ' ){
                stringBuilder.append(" ");
            }else if(c >= 'a' && c <= 'z'){
                stringBuilder.append(Character.toString((((c-97)+n)%26)+97));
            }else {
                stringBuilder.append(Character.toString((((c-65)+n)%26)+65));
            }
        }
        return stringBuilder.toString();
    }
}
