package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        long sum = 0;
        long number = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            number = number * 10 + 9; // add one more 9 to the end of the number
            sum += number; // add the new number to the sum
        }
        System.out.println(sum);
    }
}
