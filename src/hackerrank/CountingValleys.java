package hackerrank;

public class CountingValleys {

    public static void main(String[] args) {

        System.out.println(countingValleys(8, "UDDDUDUU"));
        System.out.println(countingValleys(10, "UDUUUDUDDD"));
        System.out.println(countingValleys(12, "DDUUDDUDUUUD"));
    }

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int cnt = 0;
        int valley = 0;

        for(int i=0; i < steps; i++){
            if(path.charAt(i) == 'U'){
                cnt++;
            }else{
                cnt--;
            }

            if(path.charAt(i) == 'U'&&cnt == 0){
                valley++;
            }
        }
        return valley;
    }
}
