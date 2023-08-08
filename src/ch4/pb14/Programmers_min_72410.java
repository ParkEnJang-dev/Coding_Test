package ch4.pb14;

public class Programmers_min_72410 {

    public static void main(String[] args) {
        Programmers_min_72410 solution = new Programmers_min_72410();
        System.out.println(solution.solution("...!@BaT#*..y.abcdefghijklm"));

    }

    public String solution(String new_id) {
        String answer = "";

        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        new_id = new_id.replaceAll("[.]{2,}", ".");
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        new_id = new_id.isBlank() ? "a" : new_id;
        new_id = new_id.length() >= 16 ? new_id.substring(0, 15) : new_id;
        new_id = new_id.replaceAll("[.]$", "");
        while (new_id.length() <= 2){
            new_id += new_id.charAt(new_id.length() - 1);
        }

        answer = new_id;
        return answer;
    }
}
