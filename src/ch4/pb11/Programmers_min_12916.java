package ch4.pb11;

public class Programmers_min_12916 {

    public static void main(String[] args) {
        Programmers_min_12916 solution = new Programmers_min_12916();
        System.out.println(solution.solution("pPoooyYy"));
    }

    boolean solution(String s) {
        boolean answer;
        int pCnt = 0;
        int yCnt = 0;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for (int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);

            if (c== 'p' || c == 'P'){
                pCnt++;
            } else if (c == 'y' || c == 'Y'){
                yCnt++;
            }
        }

        if (pCnt == yCnt){
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }

}
