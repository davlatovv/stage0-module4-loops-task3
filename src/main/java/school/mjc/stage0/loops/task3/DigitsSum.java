package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        String numberString = Integer.toString(t);
        int length = numberString.length();
        for (int i = 0; i < length; i++) {
            char digit = numberString.charAt(i);
            sum += Character.getNumericValue(digit);
        }
        System.out.println(sum);
    }
}
