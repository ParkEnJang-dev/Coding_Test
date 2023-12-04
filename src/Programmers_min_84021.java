public class Programmers_min_84021 {
    int[] xRange = {-1, 0, 1, 0};
    int[] yRange = {0, 1, 0, -1};

    //1. 1인블록을 찾는다.
    //2.
    public static void main(String[] args) {

        int[][] gameBoard = {{0, 0, 0}, {1, 1, 0}, {1, 1, 1}};
        int[][] table = {{1, 1, 1}, {1, 0, 0}, {0, 0, 0}};

        int[][] gameBoardBlank = gameBoard;


    }

    public static int solution(int[][] game_board, int[][] table) {
        int answer = -1;
        return answer;
    }

    //0 일때 시작 한다.
    //
    public void search(int x, int y, int[][] board) {

        for (int i = 0; i < 4; i++) {
            int x1 = xRange[i] + x;
            int y1 = yRange[i] + y;

            if (board[y1][x1] == 0);



        }
    }
}
